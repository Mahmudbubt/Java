
package javaapplication05;

import java.util.Scanner;

public class NewClass {
    public static void main (String[]args){
    Scanner input=new Scanner (System.in);
    int num;
    System.out.println ("Enter any number :");
    num=input.nextInt();
    
    if (num>30 && num<=33) {
        System.out.println ("Pass");
    }
    else if (num>=40 && num<45){
        System.out.println ("D");
    }
    else if (num>=50 && num<55){
        System.out.println ("C");
    }
    else if (num>=60 && num<65){
        System.out.println ("B");
    }
    else if (num>=70 && num<75){
        System.out.println ("A");
    }
    else if (num>=80 && num<90){
        System.out.println ("A+");
    }
    else {
        System.out.println ("Fail");
    }
    
    
    }
}
