package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private boolean sensor;
    @Override
    public boolean isOn() {
        if (this.sensor = true) {
        return true;
        }
        return false;
    }

    @Override
    public void setOn() {
        this.sensor = true;
    }

    @Override
    public void setOff() {
        this.sensor = false;
    }

    @Override
    public int read() {
    if (this.sensor = true) {
        int newNumber = new Random().nextInt(61) - 30;
        return newNumber;
    }
    throw new IllegalArgumentException("Try again bro!");
    }
    // public String toString() {
    //     return 
    // }
    
}
