package com.graduate.enity;

public class ProfessionalNumber {
    private String professional;
    private int number;

    public ProfessionalNumber() {
    }

    public ProfessionalNumber(String professional, int number) {
        this.professional = professional;
        this.number = number;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ProfessionalNumber{" +
                "professional='" + professional + '\'' +
                ", number=" + number +
                '}';
    }
}
