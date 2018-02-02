package com.cy.example.demo;

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

    @NotNull
    @Size(min=5)
    private String educationBSMajor;

    @NotNull
    @Size(min=5)
    private String educationBSSchool;

    @NotNull
    @Size(min=5)
    private String educationMSMajor;

    @NotNull
    @Size(min=5)
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


    @NotNull
    @Size(min=5)
    private String experiencePreviousTitle;

    @NotNull
    @Size(min=5)
    private String experiencePreviousCompany;

    @NotNull
    @Size(min=5)
    private String experiencePreviousDuties;


    @NotNull
    @Size(min=5)
    private String skill_1;

    @NotNull
    @Size(min=5)
    private String skill_2;

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

    public String getEducationBSMajor() {
        return educationBSMajor;
    }

    public void setEducationBSMajor(String educationBSMajor) {
        this.educationBSMajor = educationBSMajor;
    }

    public String getEducationBSSchool() {
        return educationBSSchool;
    }

    public void setEducationBSSchool(String educationBSSchool) {
        this.educationBSSchool = educationBSSchool;
    }

    public String getEducationMSMajor() {
        return educationMSMajor;
    }

    public void setEducationMSMajor(String educationMSMajor) {
        this.educationMSMajor = educationMSMajor;
    }

    public String getEducationMSSchool() {
        return educationMSSchool;
    }

    public void setEducationMSSchool(String educationMSSchool) {
        this.educationMSSchool = educationMSSchool;
    }

    public String getExperienceMostRecentTitle() {
        return experienceMostRecentTitle;
    }

    public void setExperienceMostRecentTitle(String experienceMostRecentTitle) {
        this.experienceMostRecentTitle = experienceMostRecentTitle;
    }

    public String getExperienceMostRecentCompany() {
        return experienceMostRecentCompany;
    }

    public void setExperienceMostRecentCompany(String experienceMostRecentCompany) {
        this.experienceMostRecentCompany = experienceMostRecentCompany;
    }

    public String getExperienceMostRecentDuties() {
        return experienceMostRecentDuties;
    }

    public void setExperienceMostRecentDuties(String experienceMostRecentDuties) {
        this.experienceMostRecentDuties = experienceMostRecentDuties;
    }

    public String getExperiencePreviousTitle() {
        return experiencePreviousTitle;
    }

    public void setExperiencePreviousTitle(String experiencePreviousTitle) {
        this.experiencePreviousTitle = experiencePreviousTitle;
    }

    public String getExperiencePreviousCompany() {
        return experiencePreviousCompany;
    }

    public void setExperiencePreviousCompany(String experiencePreviousCompany) {
        this.experiencePreviousCompany = experiencePreviousCompany;
    }

    public String getExperiencePreviousDuties() {
        return experiencePreviousDuties;
    }

    public void setExperiencePreviousDuties(String experiencePreviousDuties) {
        this.experiencePreviousDuties = experiencePreviousDuties;
    }

    public String getSkill_1() {
        return skill_1;
    }

    public void setSkill_1(String skill_1) {
        this.skill_1 = skill_1;
    }

    public String getSkill_2() {
        return skill_2;
    }

    public void setSkill_2(String skill_2) {
        this.skill_2 = skill_2;
    }
}
