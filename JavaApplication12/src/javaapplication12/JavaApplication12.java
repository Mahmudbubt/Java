
package javaapplication12;

import java.util.Scanner;

public class JavaApplication12 {
public static void main(String[] args) {
      Scanner input=new Scanner (System.in);
    int sum =0;
        int m,n;
        System.out.println ("Enter first number :");
        m=input.nextInt ();
        
        System.out.println ("Enter final value :");
        n=input.nextInt ();
        
        for (int i=m; i<=n; i++){
            if (i%2==0){
            sum=sum+i;
            System.out.println (" "+i);
            }
        }
        System.out.println ("The sum is :"+sum);
    }
    
}
