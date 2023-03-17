package com.serenitydojo.exceptions;

public class MissingWelcomeFileException extends RuntimeException {

    public MissingWelcomeFileException(String message) {
        super(message);
    }
    public MissingWelcomeFileException(String message, Throwable cause) {
        super(message, cause);
    }


}
