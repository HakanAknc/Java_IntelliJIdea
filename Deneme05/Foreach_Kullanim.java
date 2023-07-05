package Deneme05;

import java.util.ArrayList;

public class Foreach_Kullanim {
    public static void main(String[] args) {
        ArrayList<Integer> Liste = new ArrayList<>();
        Liste.add(3);
        Liste.add(8);
        Liste.add(12);
        Liste.add(24);
        System.out.println(Liste);

        Liste.forEach(p-> System.out.println(p));  //Bütün elemanları tek tek yazdırıyor
        System.out.println("****************************");
        Liste.forEach(p-> System.out.println(p*2));  //Bütün elemanları iki çarptı

    }
}
