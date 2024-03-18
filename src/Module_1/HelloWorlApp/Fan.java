package Module_1.HelloWorlApp;

public class Fan {

    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = STOPPED;
    private boolean isFanOn = false;
    private double radius = 6.0;
    private String color = "white";

    public Fan() {
        setSpeed(this.speed);
        setColor(this.color);
        setFanOn(this.isFanOn);
        setRadius(this.radius);
    }

    public Fan(int speed, boolean isFanOn, double radius, String color) {
        this.speed = speed;
        this.isFanOn = isFanOn;
        this.radius = radius;
        this.color = color;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isFanOn() {
        return isFanOn;
    }

    public void setFanOn(boolean fanOn) {
        isFanOn = fanOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String returnValue = "";

        if (isFanOn()) {
            returnValue = "The fan speed is set to " + getSpeed()
                    + " with a color of " + getColor()+ " and a radius of "+getRadius();
        } else {
            returnValue = "The fan is " + getColor() + " " + "with a radius of "
                    + getRadius()+ " " + " and the fan is off";
        }
        return returnValue;
    }
}
