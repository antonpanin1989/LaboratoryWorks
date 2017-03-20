package com.company.Modul_2.Lab2_1;

/**
 * Created by Anton on 22.01.2017.
 */
public class Computer {
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public void view() {
        System.out.println("Все поля обьекта  --  Manufacturer  " + manufacturer + "  " + "Serial Number : " + serialNumber + "  "
                + "Price : " + price + "  " + "Quantity CPU : " +
                +quantityCPU + " " + "Frequency CPU : " + frequencyCPU);
    }

    public String toString() {
        return "Manufacturer : " + manufacturer + "\n "
                + "Serial Number : " + serialNumber + " \n "
                + "Price : " + price + "\n  "
                + "Quantity CPU : "  + quantityCPU + "\n "
                + "Frequency CPU : " + frequencyCPU;

    }
}
