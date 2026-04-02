/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{
    private String address;
    private int credits;
    private double gpa;

    public Student(String name, short age){
        super(name, age); //recommended by intellij
    }

    public Student(String name, short age, int credits) {
        super(name, age); //recommended by intellij
        this.credits = credits;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public double getGpa(){
        return this.gpa;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", address='" + address + '\'' +
                ", age=" + getAge() +
                ", credits=" + credits +
                ", gpa=" + gpa +
                '}';
    }
}
