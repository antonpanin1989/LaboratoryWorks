package com.company.Modul_2.Lab_5;

/**
 * Created by Anton on 07.02.2017.
 */
public class InitTes {
    private int id;
    private static int nextId = (int) (1000 * Math.random());
    private int i;
    private static int ii = 1;

    public InitTes() {
        this.id = nextId ++;
        this.i = ii ++;

    }
    public String getId() {
        return "InitTes  " +
                "id " + i + " = " + id +
                '}';
    }
}
