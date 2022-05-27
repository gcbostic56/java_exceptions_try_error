package application;

public class StandardSensor implements Sensor {
    
    private boolean sensor;
    private int value;
    
    public StandardSensor(int number) {
        this.value = number;
    }

    public int getValue() {
        return this.value;
    }
    @Override
    public boolean isOn() {
        if(this.sensor = true) {
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
        if(this.sensor = true) {
        return this.value;
        }
        return 0;
    }
    public String toString() {
        return "The value is: " +this.getValue();
    }
}
