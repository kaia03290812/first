package org.example;

public class LengthException extends RuntimeException {

    public LengthException() {
        super("密碼長度限制不符");
    }

    public LengthException(String message){
        super(message);
    }
}
