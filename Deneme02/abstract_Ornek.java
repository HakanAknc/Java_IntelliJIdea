package Deneme02;

abstract class soyut{
    abstract void soyutMethod();

    void somutMethod(){
        System.out.println("Ben somut metodum.");
    }
}

class somut extends soyut{
    void soyutMethod(){
        System.out.println("Ben soyut metodum.");
    }
}

public class abstract_Ornek {
    public static void main(String[] args) {

        somut s = new somut();
        s.soyutMethod();
        s.somutMethod();

    }
}
