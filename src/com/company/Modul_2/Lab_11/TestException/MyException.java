package com.company.Modul_2.Lab_11.TestException;

/**
 * Created by Антон on 12.03.2017.
 */
public class MyException extends Throwable{
    private String s;
    public MyException(String s) {
        this.s = s;

    }
    public String MyExceptionPrint() throws Exception{
        throw new Exception("Our Exaption is : " + s);
    }
}
