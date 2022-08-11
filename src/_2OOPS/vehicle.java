package _2OOPS;

public class vehicle {
    // parent class
    private String color;
  public int maxSpeed;

    public vehicle (){
        System.out.println("vehicle's construtor  ");

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print() {
        //function overloading
        System.out.println("vechicle" + " color " + color + " maxspeed " + maxSpeed);
    }
}
