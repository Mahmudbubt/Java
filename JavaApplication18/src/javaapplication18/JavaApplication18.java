package javaapplication18;
import java.util.Scanner;
public class JavaApplication18 {
       public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print ("Enter any number : ");
        int n;
        n=input.nextInt ();
        for (int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                System.out.print ("*");
            }
           System.out.println ( "");
        }
    }
    
}
