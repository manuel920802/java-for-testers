package com.serenitydojo;

public class Dog extends Pet {

    private String favoriteToy;
    private int age;
    public static final String DOG_NOISE = "Woof";

    public Dog(String name, String favoriteToy, int age) {
        super(name);
        this.favoriteToy = favoriteToy;
        this.age = age;

    }

    public String getFavoriteToy(){
        return favoriteToy;
    }

    public int getAge(){
        return age;
    }

    public String makeNoise() {
        return DOG_NOISE;
    }
}
