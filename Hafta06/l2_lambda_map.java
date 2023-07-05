package Hafta06;   // Lambda stream().map konusu
                   // map ile her rakamın karesini alabilir veya farklı matematiksel işlemler yapabilirsiniz.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;  //genelde işlemlerle yeni bir

public class l2_lambda_map {
    public static void main(String[] args) {
        //ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(0,1,2,5));  böylede tanımlanabilir
        List<Integer> liste = Arrays.asList(1,14,3,18,5,1,2,6); //ana dizimiz
        System.out.println(liste);
        System.out.println();


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


        // && = ve = and = Her iki koşulun'da ya true ya false olması gerekiyor yani her iki koşulunda sağlanması gerekiyor (DİKKAT)
        // || = veya = or = Her iki koşuldan en az birinin sağlaması yeterli
        // =! = değil = AND = sonuc true ise false, false ise true yapar


    }
}
