package com.aws.codestar.projecttemplates.Dao;

import com.aws.codestar.projecttemplates.Entity.Building;
import com.aws.codestar.projecttemplates.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("user")
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static class UserRowMapper implements RowMapper<User>{

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setId(resultSet.getInt("idUser"));
            user.setName(resultSet.getString("UserName"));
            user.setBuildings(resultSet.getString("UserBuildings"));
            return user;
        }

    }

    public Collection<User> getAllUsers(){

        List<User>  users = jdbcTemplate.query("SELECT * FROM ElevatorTest.User",
                new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet resultSet, int i) throws SQLException {
                        User user = new User();
                        user.setId(resultSet.getInt("idUser"));
                        user.setName(resultSet.getString("UserName"));
                        user.setBuildings(resultSet.getString("UserBuildings"));
                        return user;
                    }
                }
        );
        return users;
    }

    public User getUserByID(String userid){

        String SQL = "SELECT * FROM `ElevatorTest`.`User` where idUser = ?";
        User user = jdbcTemplate.queryForObject( SQL, new UserDao.UserRowMapper(), userid );
        return user;

    }





    public void AddUser(String username, String buildings){

        jdbcTemplate.update("INSERT INTO `ElevatorTest`.`User`(`UserName`,`UserBuildings`) VALUES (?,?)",username,buildings);

    }

    public void UpdateUserName(User user, String username){

        String SQL = "UPDATE `ElevatorTest`.`User SET `UserName` = ? WHERE `idUser` = ?";
        jdbcTemplate.update(SQL,username,user.getId());

    }

    public void UpdateUserBuildings(User user, String userbuildings){

        String SQL = "UPDATE `ElevatorTest`.`User SET `UserBuildings` = ? WHERE `idUser` = ?";
        jdbcTemplate.update(SQL, userbuildings ,user.getId());

    }








}
