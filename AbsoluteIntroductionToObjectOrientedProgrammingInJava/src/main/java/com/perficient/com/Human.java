package com.perficient.com;

public class Human implements Flying, walking {

    private String name;
    private String age;
    private int heightInInches;
    private String eyeColor;

    public Human() {
    }

    public Human(String name, String age, int heightInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    public void speak() {

        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println("I am " + heightInInches + " height in inche");
        System.out.println("my eye color is " + eyeColor);

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

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public void fly() {
        System.out.println("flying....");
    }

}
