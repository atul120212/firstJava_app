package com.example.demo.requests;

public class MyFirstRequest {
    private String name;
    private int roll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "MyFirstRequest{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }
}
