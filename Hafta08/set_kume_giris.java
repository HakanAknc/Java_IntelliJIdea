package Hafta08;

import java.util.*;

public class set_kume_giris {
    public static void main(String[] args) {
        Set<Integer> k1 = new HashSet<>();   //küçükten büyüğe sıralar ve aynı elemanları bir kere yazar
        k1.add(2);
        k1.add(3);
        k1.add(1);
        k1.add(2);
        k1.add(5);
        System.out.println(k1);
        System.out.println();

        HashSet<String> k2 = new HashSet<>();  //Başlangıç HashSet yaparsan String girilir
        k2.add("Ali");                        // Elemanları alfabetik sıralamaz ama aynı elemanları bir kez yazar
        k2.add("Zeynep");
        k2.add("Cihan");
        k2.add("Ali");
        k2.add("Kamil");
        System.out.println(k2);
        System.out.println();

        System.out.println(k2.size());
        System.out.println();

        TreeSet<Float> tk = new TreeSet<>();    //küçükten büyüğe sıralar ve aynı elemanları bir kere yazar
        tk.add(1.0f);
        tk.add(1.4f);
        tk.add(2.3f);
        tk.add(0.5f);
        System.out.println(tk);
        System.out.println();
        System.out.println("*********************");

        //küme iţlemleri
        HashSet<Integer> A = new HashSet<>(Arrays.asList(0,2,3,5,8));
        HashSet<Integer> B = new HashSet<>(Arrays.asList(1,2,4,5,7));

        //Birleşim
        A.addAll(B);
        System.out.println(A);

        //Kesişim
        A.retainAll(B);
        System.out.println(A);

        //Fark
        A.removeAll(B);   // A kümesinde olup B kümesinde olmayan demektir
        System.out.println(A);

        //Fark
        B.removeAll(A);   // B kümesinde olup A kümesinde olmayan demektir
        System.out.println(B);

    }
}
