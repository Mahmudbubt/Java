package javaapplication20;

import java.util.Scanner;

public class JavaApplication20 {

    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int []number = new int[5];
        int sum=0;
        System.out.print ("Enter five number :");
       
        for (int i=0;i<number.length;i++){
          number [i]=input.nextInt();  
        }
        for (int i=0;i<number.length;i++){
            sum=sum+number [i];
        }
        System.out.println ("The sum is :"+sum);
        int avrg = sum / number.length;
        System.out.println ("The average is :"+avrg);
    }
    
}
