package com.company.Modul_2.Lab_7;

/**
 * Created by Anton on 09.02.2017.
 */
public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EthernetAdapter that = (EthernetAdapter) o;

        if (speed != that.speed) return false;
        return mac.equals(that.mac);
    }

    @Override
    public int hashCode() {
        int result = speed;
        result = 31 * result + mac.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +"  " +  "EthernetAdapter : " +
                "speed = " + speed +
                ", mac = '" + mac + '\'';

    }
}
