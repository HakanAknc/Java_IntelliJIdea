package Hafta06;   // Lambda stream().filter konusu
                   // filter koşul durumları
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;  //genelde i

public class l3_lambda_filter {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(20,35,63,27,47,82,99);
        System.out.println(l);
        System.out.println();


        List<Integer> l1 = l.stream().filter(p->p%2==0).collect(Collectors.toList());
        System.out.println(l1);  //İki'ye bölümünden kalan sıfır ise yani çift sayı olanları alır
        System.out.println();


        List<Integer> l2 = l.stream().filter(p->p%2==1).collect(Collectors.toList());
        System.out.println(l2);  //İki'ye bölümünden kalan bir ise yani tek sayı olanları alır
        System.out.println();


        List<Integer> l3 = l.stream().filter(p->p<50).collect(Collectors.toList());
        System.out.println(l3);  //50'den küçük olanları alır
        System.out.println();


        List<Integer> l4 = l.stream().filter(p->p>20 && p<80).collect(Collectors.toList());
        System.out.println(l4);  //20'den büyük 80'den küçük olanları alır.
        System.out.println();


        List<Integer> l5 = l.stream().filter(p->p>20 || p<80).collect(Collectors.toList());
        System.out.println(l5);  //Sadece bir koşulu sağlaması yeterli o yüzden bütün diziyi alır
        System.out.println();


        List<Integer> l6 = l.stream().filter(p->p%2==0 || p<80).collect(Collectors.toList());
        System.out.println(l6);  //hem çift hemde seksenden küçük olucak ama tek şartı sağlaması yeterli çünkü ( || = or = veya ) var
        System.out.println();


        List<Integer> l7 = l.stream().filter(p->p%2==1 && p<80).collect(Collectors.toList());
        System.out.println(l7);  //hem tek hemde seksenden küçük olucak her iki şartı sağlaması gerekiyor çünkü ( && = and = ve ) var
        System.out.println();


        // && = ve = and = Her iki koşulun'da ya true ya false olması gerekiyor yani her iki koşulunda sağlanması gerekiyor (DİKKAT)
        // || = veya = or = Her iki koşuldan en az birinin sağlaması yeterli
        //  ! = değil = AND = sonuc true ise false, false ise true yapar











    }
}
