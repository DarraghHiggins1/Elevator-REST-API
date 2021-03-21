package com.aws.codestar.projecttemplates.service;

import com.aws.codestar.projecttemplates.Dao.ElevatorDao;
import com.aws.codestar.projecttemplates.Entity.Elevator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.Collection;


@Service
public class ElevatorService {

    @Autowired
    @Qualifier("elevator")
    private ElevatorDao elevatordao;

    public Collection<Elevator> getAlElevators() {
        return this.elevatordao.getAlElevators();
    }




}
