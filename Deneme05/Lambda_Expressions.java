package Deneme05;

@FunctionalInterface  //Lambdayı tanımlar yazamsan da çalışır zorunlu değil
interface Lmd{
    void yaz(String s);
}

interface lam{
    int topla (int x , int y);
}

public class Lambda_Expressions {
    public static void main(String[] args) {
        Lmd l = (s)-> System.out.println("Hoşgeldin " + s);
        l.yaz("Hakan");

        System.out.println("*****************************");

        lam l1 = (x,y)->x + y;
        System.out.println(l1.topla(20,15));


    }
}
