package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.Cat.usualFood;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat(){

        Cat felix = new Cat("Felix", "Tuna", 4);

        Assert.assertEquals(felix.getName(),"Felix");
        Assert.assertEquals(felix.getFavoriteFood(),"Tuna");
        Assert.assertEquals(felix.getAge(),4);

        Pet hamster = new Hamster("Rusty", "Wheel", 1);

    }

    @Test
    public void creating_a_hamster(){

        Hamster rusty = new Hamster("Rusty", "Wheel", 1);

        Assert.assertEquals(rusty.getName(), "Rusty");
        Assert.assertEquals(rusty.getFavoriteGame(), "Wheel");
        Assert.assertEquals(rusty.getAge(),1);

    }

    @Test
    public void cat_makes_noise(){
        Cat felix = new Cat("Felix",4);

        System.out.println("Felix goes " + felix.makeNoise());
    }

    @Test
    public void dog_makes_noise(){
        Dog fido = new Dog("Fido", "Bone", 5);

        System.out.println("Fido goes " + fido.makeNoise());

    }

    @Test
    public void pets_make_noise(){
        Pet felix = new Cat("Felix", 4);
        Pet fido = new Dog("Fido", "Bone", 5 );
        Pet rusty = new Hamster("Rusty", "Wheel", 1 );

        System.out.println("Felix goes " + felix.makeNoise());
        System.out.println("Fido goes " + fido.makeNoise());
        System.out.println("Rusty goes " + rusty.makeNoise());

    }
}
