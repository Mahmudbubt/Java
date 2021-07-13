
package javaapplication03;

import java.util.Scanner;

public class NewClass {
public static void main (String[]args){
    double base,height,area;
    Scanner input=new Scanner (System.in);
    System.out.println ("Enter base:");
    base=input.nextDouble();
    System.out.println("Enter height:");
     height=input.nextDouble();
    
    area= 0.5 * base * height;
    System.out.println ("Area of triangle:"+area);
    
}
}