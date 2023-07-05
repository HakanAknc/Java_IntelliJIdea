package Hafta06;

import java.util.ArrayList;
import java.util.Random;

public class l1_lambdaListe_foreach {
    public static void main(String[] args) {
        Random r = new Random();   //Random 0 ile 10 arasında dizi oluşturduk.

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++) list.add(r.nextInt(10));  // 10 tane RASTGELE sayı üretir sürekli
        System.out.println(list);                // bound:10 demek 0 ile 10 arası olan sayılardan seç rastgele sayıları (10 dahil değil)

        list.forEach(p-> System.out.println(p.intValue()+3));  //Rondom dizideki her elemana +3 ekledik yeni dizi oluşturduk
    }

}
