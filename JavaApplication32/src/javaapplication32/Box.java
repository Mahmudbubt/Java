package javaapplication32;
public class Box {
    double height;
    double width;
    double depth;
    
    Box (int h,int w,double d) {
    height = h;
    width = w;
    depth = d;
}

    Box() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayVol () {
        double vol = height * width * depth ;
        System.out.println ("The first box's are :" +vol );
        
    }
}