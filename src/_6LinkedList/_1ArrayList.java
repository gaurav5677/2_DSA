package _6LinkedList;

import java.util.ArrayList;

public class _1ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(12);
        a.add(13);
        a.add(23);
        a.add(50);
        a.add(90);
        a.add(1,80);
        a.set(4,59);// this will replace the element at 4th index with 59
        // without changing the size
        //System.out.println(arr.size());
        //System.out.println(arr.get(1));// indexing starts form zero
        for (int i = 0; i < a.size() ; i++) { // here i hold index
            System.out.println(a.get(i));




        }



        // Enhanced for loop - for each loop

        for( int i : a){ // here i  hold the value of arraylist element
            System.out.println(i);
        }
    }

}
