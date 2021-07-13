package mahmud;
interface Animal {
   public  void AnimalSound ();
   public  void eat ();
}

class Dog implements Animal {
    public void AnimalSound () {
        System.out.println ("Ghew Ghew");
    }

    @Override
    public void eat() {
      System.out.println ("Anything");
    }
}

class Cat implements Animal {
    
    public void AnimalSound () {
        System.out.println ("Mew Mew");
    }
    @Override
    public void eat (){
        System.out.println ("Anything");
    }
}



public class Mahmud {

    public static void main(String[] args) {
        
        Dog obj = new Dog ();
        Cat obj1 = new Cat ();
        
        obj.AnimalSound();
        obj.eat();
        
        obj1.AnimalSound();
        obj1.eat();
       
    }
    
}
