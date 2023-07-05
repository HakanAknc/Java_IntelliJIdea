package Deneme08;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Hashmap_ve_Hashset {
    public static void main(String[] args) {
        //HashMap
        System.out.println("HashMap Soruların Cevabı:");
        HashMap<Integer,String> m = new HashMap<>(Map.of(1,"a",2,"b",3,"c",4,"d"));

        //Soru1
        System.out.println("Çıktı: " + m.get(3));

        //Soru2
        System.out.println("Çıktı: " + m.get(0));

        //Soru3
        System.out.println("Çıktı: " + m.containsKey(2));


        System.out.println();


        //HashSet
        System.out.println("HashSet Soruların Cevabı:");
        HashSet<Integer> A = new HashSet<>(Arrays.asList(0,2,3,5,8));
        HashSet<Integer> B = new HashSet<>(Arrays.asList(1,2,4,5,7));

        //Soru1 = Birleşim
        A.addAll(B);
        System.out.println(A);

        //Soru2 = Kesişim
        A.retainAll(B);
        System.out.println(A);

        //Soru3 = Fark
        A.removeAll(B);
        System.out.println(A);

    }
}
