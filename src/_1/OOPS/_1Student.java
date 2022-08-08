package _1.OOPS;

public class _1Student {
     public String name;
       private int rollnumber;// here int Rollnumber is only accessible in the same package, outside the package   not accessible
    //access Modifiers 1. public 2. private 3.default


    public int getRollnumber(){
        return rollnumber;
    }

//    public void setRollnumber(int num){
//        if (num<=0){
//            return;
//        }
//        rollnumber = num;
//    }
    public void setRollnumber(int rollnumber) {
        if (rollnumber <= 0) {
            return;
        }
       this.rollnumber = rollnumber;
        //this
    }
}
