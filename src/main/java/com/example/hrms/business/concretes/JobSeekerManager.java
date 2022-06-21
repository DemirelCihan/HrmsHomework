package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.JobSeekerService;
import com.example.hrms.dataAccess.abstracts.JobSeekerDao;
import com.example.hrms.entities.concretes.Employer;
import com.example.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class JobSeekerManager implements JobSeekerService {

    private JobSeekerDao jobSeekerDao;
    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao){
        this.jobSeekerDao = jobSeekerDao;
    }
    @Override
    public List<JobSeeker> getAll() {
      return this.jobSeekerDao.findAll();
    }
}
