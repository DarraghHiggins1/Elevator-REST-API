package com.aws.codestar.projecttemplates.Dao;

import com.aws.codestar.projecttemplates.Entity.Building;
import com.aws.codestar.projecttemplates.Entity.Elevator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;


@Repository("elevator")
public class ElevatorDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Collection<Elevator> getAlElevators(){

        List<Elevator> elevator = jdbcTemplate.query("SELECT * FROM ElevatorTest.Elevator",
                new RowMapper<Elevator>() {
                    @Override
                    public Elevator mapRow(ResultSet resultSet, int i) throws SQLException {
                        Elevator elevator = new Elevator();
                        elevator.setId(resultSet.getInt("idElevator"));
                        elevator.setName(resultSet.getString("ElevatorName"));
                        elevator.setFloors(resultSet.getString("ElevatorFloors"));
                        elevator.setCurrentFloor(resultSet.getInt("ElevatorCurrentFloor"));
                        elevator.setState(resultSet.getString("ElevatorSTATE"));
                        return elevator;
                    }
                }
        );
        return elevator;
    }


}
