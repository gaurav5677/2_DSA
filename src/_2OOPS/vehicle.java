package _2OOPS;

public class vehicle {
  // parent class
   private   String color;
    int maxSpeed ;

    public  String  getColor(){
      return color;
    }
    public  void  setColor(String color){
      this.color=color;
    }
    public void print(){
        System.out.println("vechicle"+ " color "+ color+" maxspeed "+ maxSpeed);
    }
}
