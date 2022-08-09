package _2OOPS;

public class car extends vehicle  {
 //child class
    int numDoors;

    public  void printCar(){
        System.out.println("car "+ "color "+ getColor() +" maxspeed "+ maxSpeed+" numDoors "+ numDoors );
    }
}
