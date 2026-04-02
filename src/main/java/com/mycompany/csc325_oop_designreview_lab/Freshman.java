package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student{
    public Freshman(String name, short age) {
        super(name, age);
    }

    public Freshman(String name, short age, int credits) {
        super(name, age, credits);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public short getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(short age) {
        super.setAge(age);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public int getCredits() {
        return super.getCredits();
    }

    @Override
    public void setCredits(int credits) {
        super.setCredits(credits);
    }

    @Override
    public double getGpa() {
        return super.getGpa();
    }

    @Override
    public void setGpa(double gpa) {
        super.setGpa(gpa);
    }
}
