package com.serenitydojo;

public abstract class Pet {
    private String name;
    public Pet(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String goForWalks(){
        return "Walk Walk Walk";
    }
    public abstract String makeNoise ();
}
