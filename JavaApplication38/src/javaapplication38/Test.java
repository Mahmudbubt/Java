package javaapplication38;
class A {
    String name;
    String color;
    double weight;
    
    A (String n,String c,double w){
         name = n;
         color = c;
         weight = w;
    }
void attribute () {    
    System.out.println ("Name :"+name);
    System.out.println ("Color :"+color);
    System.out.println ("Weight :"+weight);
    
}
} 

class B extends A {
    int gear;
    B (String n,String c,double w,int g) {
        super (n,c,w);
        gear = g;
    }
    @Override
void attribute (){
    super.attribute();
    System.out.println ("Gear :"+gear);
}
}

public class Test {
    public static void main(String[] args) {
   B obj = new B ("Volbo","Black",1000,50);
   obj.attribute();
   
}
}