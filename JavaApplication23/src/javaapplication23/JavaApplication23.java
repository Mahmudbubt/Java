package javaapplication23;

import java.util.ArrayList;

public class JavaApplication23 {

    public static void main(String[] args) {
       ArrayList <Integer> number =new  ArrayList <> ();
       
       
       number.add (10);
       number.add (20);
       number.add (30);
       number.add (3,40);
       number.add (4,50);
       //System.out.println (number);
       
       for (int  x: number){
           System.out.print (" "+x);
       }
       System.out.println (" ");
       System.out.println  ("Size of number"+" " +number.size ());
       
       number.remove (1);
       number.remove (3);
       System.out.print("");
       System.out.println (number);
    }
    
}
