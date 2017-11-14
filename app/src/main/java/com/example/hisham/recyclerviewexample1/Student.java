package com.example.hisham.recyclerviewexample1;

/**
 * Created by Hisham on 11/14/2017.
 */

public class Student {

    private String name;
    private String id;
    private String age;
    private String avg;

    public Student() {
    }

    public Student(String name, String id, String age, String avg) {
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
