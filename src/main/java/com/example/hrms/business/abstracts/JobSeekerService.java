package com.example.hrms.business.abstracts;

import com.example.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {

    List<JobSeeker> getAll();
}
