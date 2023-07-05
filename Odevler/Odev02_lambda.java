package Odevler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class Odev02_lambda {
    public static void main(String[] args) {
        //2.Sıfır ile on arasında rastgele on sayı oluşturup aşağıdaki işlemler için lambda kodlarını yazınız?

        Random r  = new Random();

        ArrayList<Integer> liste = new ArrayList<>();
        for(int i=0; i<10; i++) liste.add(r.nextInt(10));
        System.out.println(liste);

        // a) Her sayıya 5 ekleyiniz
        List<Integer> l1 = liste.stream().map(p->p+5).collect(Collectors.toList());
        System.out.println(l1);

        // b) 2 ile 8 arasındaki sayıları filtreleyiniz
        List<Integer> l2 = liste.stream().filter(p->p>2 && p<8).collect(Collectors.toList());
        System.out.println(l2);

        // c) Tüm ikili sayıları birbirinden çıkartarak reduce ediniz?
        Optional<Integer> fark = liste.stream().reduce((p1, p2)->p2-p1);
        System.out.println(fark.get());

        // d) Sayı çift ise bir ekleyiniz, tek ise bir çıkartınız?
        List<Integer> l3 = liste.stream().map(p->p%2==0?(p+1):(p-1)).collect(Collectors.toList());
        System.out.println(l3);

        // e) Çift olan sayıları 2'ye bölerek filtreleyiniz?
        List<Integer> l4 = liste.stream().filter(p->p%2==0).collect(Collectors.toList());
        System.out.println(l4);
        List<Integer> l5 = liste.stream().map(p->p/2).collect(Collectors.toList());
        System.out.println(l5);

        // f) Listedeki en küçük sayıyı buldurunuz? (reduce ile)
        Optional<Integer> sart2 = liste.stream().reduce((p1,p2)->p2>p1?p1:p2);
        System.out.println(sart2.get());

    }
}
