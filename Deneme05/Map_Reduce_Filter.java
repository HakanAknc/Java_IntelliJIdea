package Deneme05;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Map_Reduce_Filter {
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(5);
        sayilar.add(8);
        sayilar.add(11);
        sayilar.add(14);
        sayilar.add(19);
        System.out.println(sayilar);
        System.out.println("**************************");

        //map
        List<Integer> lm1 = sayilar.stream().map(p->p+2).collect(Collectors.toList());  //Bütün elemanlara +2 ekledi
        System.out.println(lm1);

        List<Integer> lm2 = sayilar.stream().map(p->p*2).collect(Collectors.toList());  //Bütün elemanları 2 ile çarptı
        System.out.println(lm2);

        System.out.println("**************************");
        //filter
        List<Integer> lf1 = sayilar.stream().filter(p->p%2==0).collect(Collectors.toList());  //Çift olanları aldı
        System.out.println(lf1);

        List<Integer> lf2 = sayilar.stream().filter(p->p>8).collect(Collectors.toList());  //8'den büyük olan elemanları alır
        System.out.println(lf2);

        System.out.println("**************************");
        //reduce
        Optional<Integer> lr1 = sayilar.stream().reduce((p1,p2)->p1+p2);  //Dizideki elemanları toplar
        System.out.println(lr1.get());  //2+5+8+11+14+19 = 59

        Optional<Integer> lr2 = sayilar.stream().reduce((p1,p2)->p1-p2);  //Dizideki elemanları çıkarır
        System.out.println(lr2.get());  //2-5-8-11-14-19 = -55

        Optional<Integer> lr3 = sayilar.stream().reduce((p1,p2)->p2-p1);  //Dizideki elemanları çıkarır
        System.out.println(lr3.get());  //Dikkat p2'den p1'i çıkarıyor

        // DİKKAT!!!
        // && = ve = and = Her iki koşulun'da ya true ya false olması gerekiyor yani her iki koşulunda sağlanması gerekiyor
        // || = veya = or = Her iki koşuldan en az birinin sağlaması yeterli



    }
}
