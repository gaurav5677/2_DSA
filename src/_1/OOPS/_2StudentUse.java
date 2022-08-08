package _1.OOPS;

public class _2StudentUse {
    public static void main(String[] args) {


        _1Student s1 = new _1Student();
        _1Student s2 = new _1Student();//whenever we use "New" object is created
        //  s1 and s2 are references to that object //not actual addresss
        System.out.println(s1);
        s1.name = "agaurav";
//        s1.Rollnumber = 45 ;
        s1.setRollnumber(100);
        System.out.println(s1.name +" "+s1.getRollnumber()); //s1.Rollnumber);
//        s2.Rollnumber=48;
        s2.name = " adam";
        s2.setRollnumber(-11);
        System.out.println(s2.name + " "+s2.getRollnumber()); //s2.Rollnumber);

//          _1Student is created in heap memory and s1 is stored in stack memory
    }

}

