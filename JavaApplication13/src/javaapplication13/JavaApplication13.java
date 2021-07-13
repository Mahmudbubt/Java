package javaapplication13;

import java.util.Scanner;

public class JavaApplication13 {
public static void main(String[] args) {
    Scanner input =new Scanner (System.in);
    int n,mul =0;
    System.out.print ("Enter the number :");
    n=input.nextInt ();
    
    for (int i=0; i<=n; i=i+1){
        System.out.println (i);
        mul=mul+i*i;
    }
        System.out.println (mul);
    }
    
}
