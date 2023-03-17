package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Percentage;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Percentage.withPercentage;

public class WhenAddingNumbers {

    @Test
    public void shouldAddTwoIntegersCorrectly(){
        List<String> colors = Arrays.asList("red","green","blue");


        assertThat(colors).hasSize(3);
        assertThat(colors).contains("green");
        assertThat(colors).containsExactly("red","green","blue");
        assertThat(colors).containsExactlyInAnyOrder("blue","green","red");
        assertThat(colors).doesNotContain("yellow");

    }
}
