package com.company;

import java.util.Objects;

public class Pet {
    // Member variable: data
    private String name;
    private int age;
    private String location;
    private String type;

    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    // Methods: functionality
    void eat() {
        System.out.println();
    }

    void run() {
        System.out.println();
    }

    @Override
    public String toString() {
        return "My name is " + this.name + ", and I live in " + this.location;
    }

    String getName() {
        return this.name;
    }
    int getAge() {
        return this.age;
    }
    String getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}


