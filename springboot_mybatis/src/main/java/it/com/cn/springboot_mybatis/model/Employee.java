package it.com.cn.springboot_mybatis.model;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private Date birthday;
    private String postion;
    private double compensation;
    private double score;
    public Employee() {
    }

    public Employee(int id, String name, Date birthday, String postion, double compensation, double score) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.postion = postion;
        this.compensation = compensation;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPostion() {
        return postion;
    }

    public void setPostion(String postion) {
        this.postion = postion;
    }

    public double getCompensation() {
        return compensation;
    }

    public void setCompensation(double compensation) {
        this.compensation = compensation;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", postion='" + postion + '\'' +
                ", compensation=" + compensation +
                ", score=" + score +
                '}';
    }
}
