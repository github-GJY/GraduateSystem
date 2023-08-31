package com.graduate.enity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class GraduateBaseInf {
    private Integer graduateID;
    private String name;
    private String gender;
    private String ethnic;
    private String place;
    private String professional;
    private Date graduateTime;
    private String status;

    public GraduateBaseInf() {
    }

    public GraduateBaseInf(Integer graduateID, String name, String gender, String ethnic, String place, String professional, Date graduateTime, String status) {
        this.graduateID = graduateID;
        this.name = name;
        this.gender = gender;
        this.ethnic = ethnic;
        this.place = place;
        this.professional = professional;
        this.graduateTime = graduateTime;
        this.status = status;
    }

    public Integer getGraduateID() {
        return graduateID;
    }

    public void setGraduateID(Integer graduateID) {
        this.graduateID = graduateID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public Date getGraduateTime() {
        return graduateTime;
    }

    public void setGraduateTime(Date graduateTime) {
        this.graduateTime = graduateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GraduateBaseInf{" +
                "graduateID=" + graduateID +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", ethnic='" + ethnic + '\'' +
                ", place='" + place + '\'' +
                ", professional='" + professional + '\'' +
                ", graduateTime=" + graduateTime +
                ", status='" + status + '\'' +
                '}';
    }
}
