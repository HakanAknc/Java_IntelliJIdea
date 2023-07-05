package Hafta08;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> mp1 = new HashMap<>();   // obje tanımlandı
        mp1.put(1,"Bir");   //değer alma karşılık yazdrma
        mp1.put(2,"İki");

        HashMap<Integer,String> mp2 = new HashMap<>();  // obje tanımlandı
        mp2.put(3,"Üç");
        mp2.put(4,"Dört");

        System.out.println(mp1.get(1) + "-" + mp1.get(2) + "-" + mp2.get(3) + "-" + mp2.get(4));   // Yan yana yazar

        System.out.println(mp1.containsKey(3));   // 3 içinde var mı yok mu false

        System.out.println(mp1.size());    // map1'in  toplam eleman sayısını veriri
        System.out.println(mp2.size());    // map2'nin toplam eleman sayısını veriri

        System.out.println(mp1.values());   // Keylerin karşılığı olan value'ları döndürür

        mp1.putAll(mp2);       // Eski map verilerin alıp yeni map verileri atar tekrar yazmaz siler
        System.out.println(mp1);

        mp1.remove(1);    // Keye göre siler
        System.out.println(mp1);

        mp1.clear();          // Tamamen temizler
        System.out.println(mp1);


    }
}
