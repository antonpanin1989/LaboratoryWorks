package com.company.Modul_2.Lab_7;

/**
 * Created by Антон on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Device[] arraysDevice = {new Device("Samsung",1526,"654456CDFG"),
                                 new Monitor("Dell",456,"jhdg5541",4558,5598),
                                 new EthernetAdapter("LG",89752,"jgh523746",8525, "macdj" )};
        for (Device device : arraysDevice) {
            System.out.println(device);

        }
    }
}
