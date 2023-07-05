package Deneme06;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class lambda_Ornek1 {
    public static void main(String[] args) {
        List<Integer> liste = Arrays.asList(0,2,3,5,1,4);
        System.out.println(liste);
        System.out.println();

        // Map
        List<Integer> l1 = liste.stream().map(p->p+3).collect(Collectors.toList());
        System.out.println(l1);  //dizideki her indise +3 ekler ve yeni dizi oluşturur
        System.out.println();


        List<Integer> l2 = liste.stream().map(p->p-2).collect(Collectors.toList());
        System.out.println(l2);  //dizideki her indiseten -2 çıkarır ve yeni dizi oluşturur
        System.out.println();


        List<Double> l3 = liste.stream().map(p->Math.sqrt(p+3)).collect(Collectors.toList());  //Math.sqrt = kare kök alır
        System.out.println(l3);  //dizideki elemanlara +3 ekleyip kare kökünü alıp yeni bir dizi oluşturduk
        System.out.println();


        List<Integer> l4 = liste.stream().map(p->(int)Math.pow(p,2)).collect(Collectors.toList());  //Math.pow = Üs alma işlemi yapar
        System.out.println(l4);  //dizideki her elemanın karesini alır (p,2) demek karesi demek (p,3) küpünü alır...
        System.out.println();


        List<Integer> l5 = liste.stream().map(p->p%2==1?p-2:p+1).collect(Collectors.toList());
        System.out.println(l5);  // sart kullalanılarak p tekse ise -2 çıkar çiftse ise +1 eklendi ve yeni dizi oluşturuldu
        System.out.println();


        List<Integer> l6 = liste.stream().map(p->p%2==0?p/2:p+1).collect(Collectors.toList());
        System.out.println(l6);  // sart kullalanılarak p çift ise 2'ye bölündü tek ise +1 eklendi ve yeni dizi oluşturuldu
        System.out.println();


        List<Integer> l18 = liste.stream().map(p->p%2==0?p/2:(p+1)/2).collect(Collectors.toList());
        System.out.println(l18);  //sart ve map kullanarak p çiftse 2'ye böl tekse +1 ekle 2'ye böl işlemini yap
        System.out.println();


        // Filter
        List<Integer> l7 = liste.stream().filter(p->p%2==0).collect(Collectors.toList());
        System.out.println(l7);  //İki'ye bölümünden kalan sıfır ise yani çift sayı olanları alır
        System.out.println();


        List<Integer> l8 = liste.stream().filter(p->p%2==1).collect(Collectors.toList());
        System.out.println(l8);  //İki'ye bölümünden kalan bir ise yani tek sayı olanları alır
        System.out.println();


        List<Integer> l9 = liste.stream().filter(p->p<3).collect(Collectors.toList());
        System.out.println(l9);  //3'den küçük olanları alır
        System.out.println();


        List<Integer> l10 = liste.stream().filter(p->p>2 && p<5).collect(Collectors.toList());
        System.out.println(l10);  //2'den büyük 5'den küçük olanları alır.
        System.out.println();


        List<Integer> l11 = liste.stream().filter(p->p>2 || p<5).collect(Collectors.toList());
        System.out.println(l11);  //Sadece bir koşulu sağlaması yeterli o yüzden bütün diziyi alır
        System.out.println();


        List<Integer> l12 = liste.stream().filter(p->p%2==0 || p<4).collect(Collectors.toList());
        System.out.println(l12);  //hem çift hemde dörten küçük olucak ama tek şartı sağlaması yeterli çünkü ( || = or = veya ) var
        System.out.println();


        List<Integer> l13 = liste.stream().filter(p->p%2==1 && p<5).collect(Collectors.toList());
        System.out.println(l13);  //hem tek hemde beşten küçük olucak her iki şartı sağlaması gerekiyor çünkü ( && = and = ve ) var
        System.out.println();

        System.out.println("Soru19");
        List<Integer> l19 = liste.stream().filter(p->p%4<3).collect(Collectors.toList());
        System.out.println(l19); // dizideki elemanların 4'e bölümündan kalan 3'ten küçük olanları alıyoruz
        System.out.println();


        System.out.println("Soru20");
        List<Integer> l20 = liste.stream().filter(p->p%3<2).collect(Collectors.toList());
        System.out.println(l20); // dizideki elemanların 4'e bölümündan kalan 3'ten küçük olanları alıyoruz
        System.out.println();


        // Reduce
        Optional<Integer> l14 = liste.stream().reduce((p1, p2)->p1+p2); //dizideki bütün elemanları toplar.
        System.out.println(l14.get()); //get methodu içindeki integerı alır.
        System.out.println();


        Optional<Integer> l15 = liste.stream().reduce((p1,p2)->p2-p1);  //ÇOOK DİKKKAT ETTT
        System.out.println(l15.get());  //get methodu içindeki integerı alır. //dizideki bütün elemanları çıkarır.
        System.out.println();


        Optional<Integer> l16 = liste.stream().reduce((p1,p2)->p1>p2?p1-p2:p2-p1);
        System.out.println(l16.get());  //sart kullanılarak p1>p2'den büyükse p1-p2 işlemi, küçükse p2-p1 işlemi yapılacak
        System.out.println();


        Optional<Integer> l17 = liste.stream().reduce((p1,p2)->p1>p2?p1:p2);
        System.out.println(l17.get());  //sart kullanılarak dizideki en büyük indisi bulur
        System.out.println();


        // && = ve = and = Her iki koşulun'da ya true ya false olması gerekiyor yani her iki koşulunda sağlanması gerekiyor (DİKKAT)
        // || = veya = or = Her iki koşuldan en az birinin sağlaması yeterli
        //  ! = değil = AND = sonuc true ise false, false ise true yapar

    }

}
