class Fan{
    private String brand;
    private String color;
    private byte speed;
    private boolean isOn;
    private double radius;

    Fan(String brand, String color, double radius){
        this.brand = brand;
        this.color = color;
        this.radius = radius;
    }

    public String toString(){
        return String.format("brand - %s, radius - %f, color - %s, isOn - %b, speed - %d", brand,radius, color,isOn,speed);
    }

    public void switchOn(){
        this.isOn = true;
    }

    public void switchOff(){
        this.isOn = false;
    }
    public void increaseSpeed(){
        this.speed++;
    }

    public void decreaseSpeed(){
        this.speed--;
    }
}

class Practice{
    public static void main(String args[]){
        Fan fan = new Fan("Havells","White",0.2);
        fan.switchOn();
        fan.increaseSpeed();
        fan.increaseSpeed();
        fan.increaseSpeed();
        System.out.println(fan);
    }
}