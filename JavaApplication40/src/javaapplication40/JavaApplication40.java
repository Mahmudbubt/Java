package javaapplication40;

import java.util.Scanner;

  public class JavaApplication40 {
   public static void main(String[] args) {
    
   int count = 1;
   do {
    try {
       
    Scanner input = new Scanner (System.in);
    System.out.println ("Enter First Number :");
    int num1 = input.nextInt () ;
    System.out.println ("Enter Second Number :");
    int num2 = input.nextInt ();
    int result = num1/num2;
    System.out.println ("Result :"+result);
    count = 2;
    
    } catch (Exception e) {
        System.out.println ("Exception :"+e);
        System.out.println ("You must enter integer. Please, try again");
    }
    
  
   } while (count ==1);
   
}

  }