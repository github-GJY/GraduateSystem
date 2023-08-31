package com.graduate.enity;

import java.util.Date;

public class StudentEmployAndName {
    private Integer graduateID;
    private String name;
    private Date worktime;
    private String workplace;
    private String worknature;
    private String duties;
    private String address;

    public StudentEmployAndName() {
    }

    public StudentEmployAndName(Integer graduateID, String name, Date worktime, String workplace, String worknature, String duties, String address) {
        this.graduateID = graduateID;
        this.name = name;
        this.worktime = worktime;
        this.workplace = workplace;
        this.worknature = worknature;
        this.duties = duties;
        this.address = address;
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

    @Override
    public String toString() {
        return "StudentEmployAndName{" +
                "graduateID=" + graduateID +
                ", name='" + name + '\'' +
                ", worktime=" + worktime +
                ", workplace='" + workplace + '\'' +
                ", worknature='" + worknature + '\'' +
                ", duties='" + duties + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
