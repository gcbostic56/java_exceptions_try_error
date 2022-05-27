package application;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class AverageSensor implements Sensor {
    private boolean sensor;
    private List<Integer> averageSensor;
    private ArrayList<Sensor> sensors;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.averageSensor = new ArrayList<>();
        this.sensor = false;
    }
    @Override
    public boolean isOn() {
        
        return this.sensor;
    }

    @Override
    public void setOn() {
        this.sensor = true;
        
    }

    @Override
    public void setOff() {
        this.sensor = true;
        
    }

    @Override
    public int read() {
    if (!isOn()) {
        throw new IllegalArgumentException("Try again bro!");
    }
    OptionalDouble avg = sensors.stream()
    .map(Sensor::read)
    .mapToInt(Integer::valueOf)
    .average();
    
    int newInt = (int) avg.getAsDouble();
    averageSensor.add(newInt);
    return newInt;
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }
    
    public void printItems() {
        this.sensors.forEach(System.out::println);
    }
    
    
}
