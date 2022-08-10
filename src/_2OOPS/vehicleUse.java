package _2OOPS;

public class vehicleUse {
    public static void main(String[] args) {

        vehicle v = new vehicle();
//        v.color ="red";
        v.setColor("red");
        v.maxSpeed = 80;
        v.print();

        car c = new car();
//        c.color = " black ";
        c.setColor("black");
        c.maxSpeed = 123;
        c.numDoors = 4 ;
        c.print();
//        c.printCar();

        bicycle b = new bicycle();
        b.print();
    }
}
