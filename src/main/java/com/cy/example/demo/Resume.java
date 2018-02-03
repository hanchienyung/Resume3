package com.cy.example.demo;

import com.sun.istack.internal.Nullable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=5)
    private String name;

    @NotNull
    @Size(min=5)
    private String email;


    /*@NotNull
    @Size(min=5)
    private String educationBSMajor;


    @NotNull
    @Size(min=5)
    private String educationBSSchool;

    @Nullable
    private String educationMSMajor;

    @Nullable
    private String educationMSSchool;

    @NotNull
    @Size(min=5)
    private String experienceMostRecentTitle;

    @NotNull
    @Size(min=5)
    private String experienceMostRecentCompany;

    @NotNull
    @Size(min=5)
    private String experienceMostRecentDuties;


    @Nullable
    private String experiencePreviousTitle;

    @Nullable
    private String experiencePreviousCompany;

    @Nullable
    private String experiencePreviousDuties;


    @NotNull
    @Size(min=5)
    private String skill_1;

    @Nullable
    private String skill_2;
    */

    public Resume() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
