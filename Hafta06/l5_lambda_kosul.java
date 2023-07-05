package Hafta06;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class l5_lambda_kosul {

    static int kuvvet(int a,int b){  //Yeni liste için tanımlandı
        return (int) Math.pow(a,b);
    }

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(20,35,63,27,47,82,99);
        System.out.println(l);
        System.out.println();


        List<Integer> l1 = l.stream().filter(p->p%4<3).collect(Collectors.toList());
        System.out.println(l1); // dizideki elemanların 4'e bölümündan kalan 3'ten küçük olanları alıyoruz
        System.out.println();


        List<Integer> l2 = l.stream().filter(p->p%4<3 || p>25).collect(Collectors.toList());  // || = or iki şartan birin sağlanması
        System.out.println(l2);  //sart kullanılarak
        System.out.println();


        List<Integer> l3 = l.stream().map(p->p%2==0?p/2:(p+1)/2).collect(Collectors.toList());
        System.out.println(l3);  //sart ve map kullanarak p çiftse 2'ye böl tekse +1 ekle 2'ye böl işlemini yap
        System.out.println();


        System.out.println("***************************");


        List<Integer> l4 = Arrays.asList(2,1,3,1,2,1,1);
        System.out.println(l4);
        System.out.println();


        Optional<Integer> toplam = l4.stream().reduce((p1, p2)->kuvvet(p1, p2));
        System.out.println(toplam.get()); //p1 üsü p2 kuvvet alarak sonucu bulduk
        System.out.println();


        // && = ve = and = Her iki koşulun'da ya true ya false olması gerekiyor yani her iki koşulunda sağlanması gerekiyor (DİKKAT)
        // || = veya = or = Her iki koşuldan en az birinin sağlaması yeterli
        //  ! = değil = AND = sonuc true ise false, false ise true yapar

    }
}
