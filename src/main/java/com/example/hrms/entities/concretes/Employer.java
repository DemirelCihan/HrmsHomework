package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "employers")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Employer extends User {

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_adress")
    private String website;

    @Column(name = "phone_no")
    private String phoneNo;

}