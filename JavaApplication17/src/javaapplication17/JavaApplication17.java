
package javaapplication17;

import java.util.Scanner;

public class JavaApplication17 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter any number :");
        int num;
        num = input.nextInt ();
        
        if (num%2==0 && num!=1)
        System.out.println ("It is not a prime number ");
        else 
        System.out.println ("it is  a prime");
    }
    
}
