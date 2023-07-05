package Odevler;

import java.util.Random;
import java.util.TreeSet;

public class Odev08_HashMap_Kume {
    public static void main(String[] args) {
        /*A ve B kümeleri 0 ile 50 arasında rastgele 20 eleman içerecek şekilde rastgele sayılarla doldurulsun.
        *(her iki kümede de 20'şer eleman olmalı!).Ardından bu iki kümenin birleşimini, kesişimini ve farkını buldurup yazdırınız */

        Random r = new Random();

        TreeSet<Integer> A = new TreeSet<>();
        TreeSet<Integer> B = new TreeSet<>();

        while(true){
            A.add(r.nextInt(50));
            if(A.size()==20) break;
        }

        while(true){
            B.add(r.nextInt(50));
            if(B.size()==20) break;
        }

        System.out.println(A);
        System.out.println(B);
        System.out.println();


        //Birleşim
        System.out.println("Birleşim");
        A.addAll(B);
        System.out.println(A);
        System.out.println();


        //Kesişim
        System.out.println("Kesişim");
        A.retainAll(B);
        System.out.println(A);
        System.out.println();


        //Fark
        System.out.println("Fark");
        A.removeAll(B);
        System.out.println(A);
        System.out.println();


    }
}
