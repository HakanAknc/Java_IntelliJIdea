package Odevler;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Odev03_lambda {
    public static void main(String[] args) {
        //BENİM KENDİ CEVAPLARIM

        // 1.Sorunun cevabı;
        // [60,57,82,98]

        // 2.Sorunun cevabı
        // [6,13,30,14,29,41,49]

        List<Integer> l = Arrays.asList(12,25,60,27,57,82,98);
        System.out.println(l);
        System.out.println();

        List<Integer> l1 = l.stream().filter(p->p%4<3 && p>25).collect(Collectors.toList());  //DİKKKAT && var
        System.out.println(l1);  //listedeki elemanların 4'e bölümünden kalan 3'ten küçük olucak ve yeni dizi oluşucak
        System.out.println();

        List<Integer> l2 = l.stream().map(p->p%2==0?p/2:(p+1)/2).collect(Collectors.toList());
        System.out.println(l2);  //listedeki elemanlar çiftse 2'ye böl tekse +1 ekle 2'ye bölecek ve yeni dizi oluşacak
        System.out.println();

        Optional<Integer> l3 = l.stream().reduce((p1, p2)->p1%3==0?p1-p2:p2-p1);
        System.out.println(l3.get());  //p1'in 3'e bölümünden kalan sıfırsa p1'den p2'yi çıkar değilse p2'den p1 çıkar sonuç tek eleman olucak
        System.out.println();

        List<Integer> l4 = l.stream().map(p->p%5>3 || p%2==1?p:p+1).collect(Collectors.toList());
        System.out.println(l4);  //p'nin 5'e bölümünden kalan 3 den büyükse veya p'nin 2'ye bölümünden kalan 1 ise p direk al değilse +1 ekle yeni dizi oluştur
        System.out.println();

        List<Integer> l5 = l.stream().filter(p->p%7==0 && p>20).collect(Collectors.toList());
        System.out.println(l5);  //p'nin 7'ye bölümünden kalan sıfırsa ve p 20'den büyükse  olanları al ve yeni dizi oluştur
        System.out.println();

    }
}
