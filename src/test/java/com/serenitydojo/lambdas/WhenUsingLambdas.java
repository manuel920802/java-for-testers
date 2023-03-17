package com.serenitydojo.lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class WhenUsingLambdas {

    @Test
    public void printingOutColors(){
        List<String> colors = Arrays.asList("red","green","blue","grey");

        colors.forEach(
                color -> System.out.println(color)
        );
        // Lambda with if clause
        /* colors.forEach(
                color -> {
                   if (color.equals("red"))
                       System.out.println("RED!");
                   else
                       System.out.println(color);
                }
        );*/
        // Simple lambda reference
      /* for (String color: colors){
            printColorOf(color);
        }*/
    }

    @Test
    public void filteringColors(){
        List<String> colors = Arrays.asList("red","gritty white","grey","green","blue","grey-blue");

        Integer minLength = colors.stream()
                .filter(color -> color.startsWith("g"))
                .map(String::length)
                .sorted()
                .findFirst()
                .orElse(0);


        System.out.println(minLength);
    }
}
