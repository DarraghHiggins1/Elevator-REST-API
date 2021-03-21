package com.aws.codestar.projecttemplates.Dao;

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


}
