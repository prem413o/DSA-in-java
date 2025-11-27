public class Ops {

    public static void main(String args[]){

        // Deer d1=new Deer();
        // d1.breath();

        Amu a1=new Amu();
        a1.speed();
        a1.eat();

    }
    
}

class Animal{
    String color;
    void eat(){
        System.out.println("Eats everthing.");
    }

    void breath(){
        System.out.println("animal breaths faster than human being.");
    }
}

class Deer extends Animal{
    int legs;
    void eat(){
        System.out.println("Eats grass only.");
    }

    void speed(){
        System.out.println("the speed of deer is 25km/h.");
    }
}

class Amu extends Deer{
    String color;
    void name(){
        System.out.println("my deer name is amu.");
    }
}
