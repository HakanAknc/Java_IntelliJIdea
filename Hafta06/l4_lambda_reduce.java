package Hafta06;  //Lambda stream().reduce konusu
                  //Optional<Integer> reduce
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;   //genelde işlemlerle tek cevap çıkar

public class l4_lambda_reduce {
    public static void main(String[] args) {
        List<Integer> liste = Arrays.asList(0,2,3,5,0,2);
        System.out.println(liste);
        System.out.println();


        //Optional<Integer>
        Optional<Integer> toplam = liste.stream().reduce((p1,p2)->p1+p2); //dizideki bütün elemanları toplar.
        System.out.println(toplam.get()); //get methodu içindeki integerı alır.
        System.out.println();


        Optional<Integer> fark = liste.stream().reduce((p1,p2)->p2-p1);  //ÇOOK DİKKKAT ETTT
        System.out.println(fark.get());  //get methodu içindeki integerı alır. //dizideki bütün elemanları çıkarır.
        System.out.println();


        Optional<Integer> sart = liste.stream().reduce((p1,p2)->p1>p2?p1-p2:p2-p1);
        System.out.println(sart.get());  //sart kullanılarak p1>p2'den büyükse p1-p2 işlemi, küçükse p2-p1 işlemi yapılacak
        System.out.println();


        Optional<Integer> sart2 = liste.stream().reduce((p1,p2)->p1>p2?p1:p2);
        System.out.println(sart2.get());  //sart kullanılarak dizideki en büyük indisi bulur
        System.out.println();


        //map şart ifadesi
        List<Integer> l = liste.stream().map(p->p%2==0?p/2:p+1).collect(Collectors.toList());
        System.out.println(l);  // sart kullalanılarak p çift ise 2'ye bölündü tek ise +1 eklendi ve yeni dizi oluşturuldu
        System.out.println();


        // && = ve = and = Her iki koşulun'da ya true ya false olması gerekiyor yani her iki koşulunda sağlanması gerekiyor (DİKKAT)
        // || = veya = or = Her iki koşuldan en az birinin sağlaması yeterli
        //  ! = değil = AND = sonuc true ise false, false ise true yapar

    }
}
