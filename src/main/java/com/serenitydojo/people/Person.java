package com.serenitydojo.people;

public class Person {
    public enum Gender {MALE,FEMALE}
    String name;
    Gender gender;
    int age;
    String FavouriteColor;
    int points;

    public Person(String name, Gender gender, int age, String favouriteColor) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        FavouriteColor = favouriteColor;
        this.points = 0;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getFavouriteColor() {
        return FavouriteColor;
    }

    @Override
    public String toString(){
        return name;
    }

    public int getPoints(){
        return points;
    }

    public void earnPoints(int earnedPoints){
        System.out.println(getName() + " has just earned " + earnedPoints + " points" );
        points = points + earnedPoints;
    }

}
