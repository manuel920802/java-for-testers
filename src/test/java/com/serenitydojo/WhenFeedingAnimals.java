package com.serenitydojo;

import com.serenitydojo.model.AnimalType;
import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.serenitydojo.model.AnimalType.*;

public class WhenFeedingAnimals {

    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds(CAT, false);

        Assert.assertEquals(food, "Tuna", food);

    }

    @Test
    public void shouldFeedHamstersCabbage() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds(HAMSTER,false);

        Assert.assertEquals(food, "Cabbage", food);
    }

    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds(DOG, false);

        Assert.assertEquals(food, "Dog Food", food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(CAT, true);

        Assert.assertEquals(food, "Salmon", food);
    }

    @Test
    public void shouldFeedPremiumDogsDeluxeDogFood(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(DOG, true);

        Assert.assertEquals(food,"Deluxe Dog Food",food );
    }

    @Test
    public void shouldFeedPremiumHamstersLettuce(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(HAMSTER, true);

        Assert.assertEquals(food,"Lettuce",food );
    }

    @Test
    public void listOfColors(){

        String[] color = {"red", "green", "blue"};
        int [] ages = {1,2,3};

        String [] moreColors = new String[3];
        moreColors[0] = "red";
        moreColors[1] = "green";
        moreColors[2] = "blue";

        System.out.println("First Color = " + moreColors[0]);

        for (int i =0; i < moreColors.length;i++){
            System.out.println(moreColors[i]);
        }

        List<String> myColors = new ArrayList<>();
        myColors.add("red");
        myColors.add("blue");
        myColors.add("purple");
        myColors.add("red");

        for (String someColor: myColors){
            System.out.println(" List Color: " + someColor);
        }

        Set<String> mySet = new HashSet<>();
        mySet.add("red");
        mySet.add("purple");
        mySet.add("blue");
        mySet.add("red");

        for (String someSet :mySet ){
            System.out.println("Set Color= " + someSet);
        }

    }

}
