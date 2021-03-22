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

@Repository("building")
public class BuildingDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static class BuildingRowMapper implements RowMapper<Building>{

        @Override
        public Building mapRow(ResultSet resultSet, int i) throws SQLException {
            Building building = new Building();
            building.setId(resultSet.getInt("idBuilding"));
            building.setName(resultSet.getString("BuildingName"));
            building.setLocation(resultSet.getString("BuildingLocation"));
            building.setElevators(resultSet.getString("BuildingElevators"));
            return building;
        }

    }

    public Collection<Building> getAllBuildings(){

        String SQL = "SELECT * FROM ElevatorTest.Building";
        List<Building> buildings = jdbcTemplate.query( SQL, new BuildingRowMapper());
        return buildings;
    }
/*
    public Building getBuildingByUser(String userid){

        String SQL = "SELECT * FROM ElevatorTest.Building where BuildingName = ?";
        Building building = jdbcTemplate.queryForObject( SQL, new BuildingRowMapper(),  userid
        );
        return building;
    }
*/


}
