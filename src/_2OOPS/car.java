package _2OOPS;

public class car extends vehicle  {
 //child class
    int numDoors;

    public car(){
        System.out.println("Car's construtor  ");

    }


    public  void print(){ //function overWriting
        System.out.println("car "+ "color "+ getColor() +" maxspeed "+ maxSpeed+" numDoors "+ numDoors );
    }
}
