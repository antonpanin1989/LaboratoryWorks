package com.company.Modul_2.Lab_11.Demo4;

/**
 * Created by Антон on 12.03.2017.
 */
public class InvalidShapeStringException extends Exception {
    public InvalidShapeStringException() throws Exception{
        throw new Exception("Задайте правельную форму строки");
    }
}
