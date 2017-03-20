package com.company.Modul_2.Lab_11.ExceptionDemo;

/**
 * Created by Антон on 12.03.2017.
 */
public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message)throws RuntimeException {
        super(message);
        throw new RuntimeException(message);
    }
}
