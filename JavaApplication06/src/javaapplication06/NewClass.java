
package javaapplication06;

import java.util.Scanner;

public class NewClass {
    public static void main (String[]args){
        int digit;
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter any digit :");
        digit=input.nextInt ();
        switch (digit){
            case 0:
                System.out.println ("Zero");
                break;
            case 1:
                System.out.println ("One");
                break;
            case 2: 
                System.out.println ("Two");
                break;
            case 3: 
                System.out.println ("Three");
            case 4: 
                System.out.println ("Four");
                break;
            default :
                System.out.println ("Not a digit");
        }
        
    }
    
}
