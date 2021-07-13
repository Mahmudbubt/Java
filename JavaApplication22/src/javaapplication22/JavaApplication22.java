
package javaapplication22;
import java.util.Scanner;
public class JavaApplication22 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter elements :");
        int sum =0;
        int upper = 0;
        int lower =0;
        int [][] A = new int [4][4];
        for (int row=0; row<4; row++){
            for (int col=0; col<4; col++) {
                A [row] [col] = input.nextInt();
            }
        }
          for (int row=0; row<4; row++){
            for (int col=0; col<4; col++) {
                if (row==col)
                {
                sum = sum+A [row][col];
            }
                if (row<col)
                {
                    upper = upper+A [row][col];
                }
                if (row>col)
                {
                    lower = lower+A [row][col];
                }
        }
    }
    System.out.println ("The sum is :" +sum);
    System.out.println ("The upper elemenets is :" +upper);
    System.out.println ("The lower is : " +lower);
}
}
