package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print ("Enter any number :");
       int num;
       num = input.nextInt();
       for (int i=1; i<=10; i++){
           System.out.println (num+"X"+i+"="+num*i);
       }
      
    }
    
}
