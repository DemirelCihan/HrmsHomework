package com.example.hrms.api.controllers;

import com.example.hrms.business.abstracts.SystemPersonnelService;
import com.example.hrms.entities.concretes.SystemPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/systemPersonnels")
public class SystemPersonnelsController {
    private SystemPersonnelService systemPersonnelService;
    @Autowired
    public SystemPersonnelsController(SystemPersonnelService systemPersonnelService){
        this.systemPersonnelService = systemPersonnelService;
    }

    @GetMapping("/getall")
    public List<SystemPersonnel> getAll(){
     return this.systemPersonnelService.getAll();
    }
}
