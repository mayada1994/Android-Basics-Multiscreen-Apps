package com.example.android.reportcard;

public class ReportCard {
    String Name;
    String Surname;
    int Math;
    int Science;

    public ReportCard(String name, String surname, int math, int science) {
        this.Name = name;
        this.Surname = surname;
        this.Math = math;
        this.Science = science;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        this.Math = math;
    }

    public int getScience() {
        return Science;
    }

    public void setScience(int science) {
        this.Science = science;
    }

    @Override
    public String toString() {
        return "Name: " + Name + " " + Surname + "; Math grade: " + Math + "; Science grade: " + Science;
    }
}

