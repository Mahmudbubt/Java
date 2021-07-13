package javaapplication44;
public class JavaApplication44 {
    public static void main(String[] args) {
     System.out.println ("Divided by : 3");
        int i;
        for (i=1;i<=100;i++){
            if (i%3==0){
                System.out.println (+i);
        }
        
        }
        System.out.println ("Divided by : 5");
        for (i=1;i<=100;i++) {
            if (i%5==0) {
                System.out.println (+i);
            }
        } 
        
        
        System.out.println ("Divided by : 3 & 5");
        for (i=1; i<=100; i++) {
            if (i%3==0 && i%5==0) {
                
                System.out.println (+i);
            
            }
        }
           
    }
    
}
