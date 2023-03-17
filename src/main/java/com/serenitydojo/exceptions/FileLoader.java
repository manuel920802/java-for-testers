package com.serenitydojo.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

import static java.nio.file.Files.readString;

public class FileLoader {
    public String readHelloWorld() throws IOException {
        return readString(Paths.get("src/main/resources/hello.txt"));

    }

    public Boolean fileContainsText(String filename, String expectedText) {
        String path = "src/main/resources/" + filename;
        try {
          return  readString(Paths.get(path)).contains(expectedText);
        } catch (NoSuchFileException noSuchFile) {
            return false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Boolean fileHasText(String filename, String expectedText) throws IOException {
        String path = "src/main/resources/" + filename;
        try {
             return Files.readString(Paths.get(path)).contains(expectedText);
        } catch (NoSuchFileException noSuchFile) {
            throw new MissingWelcomeFileException("No matching file is found" + filename);
        }
    }

}