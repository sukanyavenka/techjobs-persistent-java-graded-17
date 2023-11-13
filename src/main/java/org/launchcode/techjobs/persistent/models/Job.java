package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {


    @ManyToMany
    private List<Skill> skills;

    // private String employers;
    //   private String skills;


    @ManyToOne
    //@JoinColumn(name="employer_id")

    private Employer employer;

    public Job() {
    }

    // Initialize the id and value fields.
    public Job( Employer employer,List<Skill> someSkills) {
        //super();
        this.employer = employer;
        this.skills = someSkills;
    }

    // Getters and setters.


//    public String getEmployer() {
//        return employers;
//    }
//
//    public void setEmployer(String employer) {
//        this.employers = employer;
//    }

    //  public String getEmployers() {return employers;}

    // public void setEmployers(String employers) {this.employers = employers;}

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

//    public String getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String skills) {
//        this.skills = skills;
//    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
    }

