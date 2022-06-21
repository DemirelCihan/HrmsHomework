package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.SystemPersonnelService;
import com.example.hrms.dataAccess.abstracts.SystemPersonnelDao;
import com.example.hrms.entities.concretes.SystemPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SystemPersonnelManager implements SystemPersonnelService {

   private SystemPersonnelDao systemPersonnelDao;

   @Autowired
   public SystemPersonnelManager (SystemPersonnelDao systemPersonnelDao){
       this.systemPersonnelDao = systemPersonnelDao;
   }

    @Override
    public List<SystemPersonnel> getAll() {
        return this.systemPersonnelDao.findAll();
    }
}
