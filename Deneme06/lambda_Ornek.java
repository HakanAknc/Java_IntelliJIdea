package Deneme06;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class lambda_Ornek {
    public static void main(String[] args) {
        List<Integer> liste = Arrays.asList(0,2,3,4,0,1,5);
        System.out.println(liste);
        System.out.println();


        List<Integer> l1 = liste.stream().map(p->p%2==1?p-2:p+1).collect(Collectors.toList());
        System.out.println(l1);  // sart kullalanılarak p tekse ise -2 çıkar çiftse ise +1 eklendi ve yeni dizi oluşturuldu
        System.out.println();


        List<Integer> l2 = liste.stream().filter(p->p%4<3).collect(Collectors.toList());
        System.out.println(l2); // dizideki elemanların 4'e bölümündan kalan 3'ten küçük olanları alıyoruz
        System.out.println();


        List<Integer> l4 = liste.stream().map(p->(int)Math.pow(p,2)).collect(Collectors.toList());  //Math.pow = Üs alma işlemi yapar
        System.out.println(l4);  //dizideki her elemanın karesini alır (p,2) demek karesi demek (p,3) küpünü alır...
        System.out.println();


        Optional<Integer> sart = liste.stream().reduce((p1, p2)->p1>p2?p1-p2:p2-p1);
        System.out.println(sart.get());  //sart kullanılarak p1>p2'den büyükse p1-p2 işlemi, küçükse p2-p1 işlemi yapılacak
        System.out.println();



    }
}
