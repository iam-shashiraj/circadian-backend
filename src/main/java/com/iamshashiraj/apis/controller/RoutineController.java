package com.iamshashiraj.apis.controller;

import com.iamshashiraj.apis.model.Routine;
import com.iamshashiraj.apis.service.RoutineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RoutineController {

    @Autowired
    private RoutineService routineService;

    @RequestMapping("/circadian-backend/v1/routines")
    public List<Routine> getRoutines() {
        return new ArrayList<Routine>();
    }
}
