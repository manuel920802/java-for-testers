package com.serenitydojo;

import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithExceptions {

    WordCounter wordCounter = new WordCounter();

    @Test
    public void shouldCountTheWordsInAString(){
        int numberOfWords = wordCounter.numberOfWordsIn("Some String");

        assertThat(numberOfWords).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroForANullString(){
        assertThat(wordCounter.numberOfWordsIn(null)).isEqualTo(0);
    }

    @Test
    public void shouldCountWordsInAFile() throws Exception {
        int numberOfWords = wordCounter.numberOfWordsInFile("src/main/resources/hello.txt");
        assertThat(numberOfWords).isEqualTo(2);
    }

    @Test(expected = FileHasNoWordException.class)
    public void shouldReportAnErrorIfTheFileDoesNotExist() throws Exception{
       int numberOfWords =  wordCounter.numberOfWordsInFile("file-that-does-not-exists.txt");
       assertThat(numberOfWords).isEqualTo(0);
    }

    @Test(expected = FileHasNoWordException.class)
    public void shouldThrowMeaningfulExceptionIfThereAreNoWordsInTheFile() throws Exception{
        wordCounter.numberOfWordsInFile("src/main/resources/no_words.txt");
    }


}
