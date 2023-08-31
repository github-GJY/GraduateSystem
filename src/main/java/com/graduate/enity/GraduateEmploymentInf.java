package com.graduate.enity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class GraduateEmploymentInf {
    private Integer graduateID;
    private Date worktime;
    private String workplace;
    private String worknature;
    private String duties;
    private String address;
    private GraduateBaseInf graduateBaseInf;

    public GraduateEmploymentInf() {
    }

    public GraduateEmploymentInf(Integer graduateID, Date worktime, String workplace, String worknature, String duties, String address, GraduateBaseInf graduateBaseInf) {
        this.graduateID = graduateID;
        this.worktime = worktime;
        this.workplace = workplace;
        this.worknature = worknature;
        this.duties = duties;
        this.address = address;
        this.graduateBaseInf = graduateBaseInf;
    }

    public Integer getGraduateID() {
        return graduateID;
    }

    public void setGraduateID(Integer graduateID) {
        this.graduateID = graduateID;
    }

    public Date getWorktime() {
        return worktime;
    }

    public void setWorktime(Date worktime) {
        this.worktime = worktime;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public String getWorknature() {
        return worknature;
    }

    public void setWorknature(String worknature) {
        this.worknature = worknature;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GraduateBaseInf getGraduateBaseInf() {
        return graduateBaseInf;
    }

    public void setGraduateBaseInf(GraduateBaseInf graduateBaseInf) {
        this.graduateBaseInf = graduateBaseInf;
    }

    @Override
    public String toString() {
        return "GraduateEmploymentInf{" +
                "graduateID=" + graduateID +
                ", worktime=" + worktime +
                ", workplace='" + workplace + '\'' +
                ", worknature='" + worknature + '\'' +
                ", duties='" + duties + '\'' +
                ", address='" + address + '\'' +
                ", graduateBaseInf=" + graduateBaseInf +
                '}';
    }
}
