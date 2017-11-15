package com.example.hisham.recyclerviewexample1.models;

/**
 * Created by Hisham on 11/14/2017.
 */

public class Student {

    private String name;
    private Integer id;
    private Integer age;
    private Integer avg;

    public Student() {
    }

    public Student(String name, Integer id, Integer age, Integer avg) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAvg() {
        return avg;
    }

    public void setAvg(Integer avg) {
        this.avg = avg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age='" + age + '\'' +
                ", avg='" + avg + '\'' +
                '}';
    }
//TODO hashcode
    //TODO equals
}
