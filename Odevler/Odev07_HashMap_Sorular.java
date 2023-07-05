package Odevler;

import java.util.HashMap;
import java.util.Map;

public class Odev07_HashMap_Sorular {
    public static void main(String[] args) {
        HashMap<Integer,String> n = new HashMap<>(Map.of(1,"a",
                2,"b",
                3,"c",
                4,"d"));
        n.put(5,"e");

        //1
        System.out.println("Soru 1");
        System.out.println(n);   //elemanları yazdırır
        System.out.println();

        //2
        System.out.println("Soru 2");
        System.out.println(n.get(3));   //üçüncü elemanın karşılığını yazdırır
        System.out.println();

        //3
        System.out.println("Soru 3");
        System.out.println(n.get(0));   //null döndürür çünkü bir değer atanmamış  * null = bir değer atanmamış
        System.out.println();

        //4
        System.out.println("Soru 4");
        n.remove(2);      // 2.elemanı siler
        System.out.println(n);
        System.out.println();

        //5
        System.out.println("Soru 5");
        n.putAll(Map.of(2,"iki",6,"f"));  //istenilen elemanları atadı ve değiştirildi
        System.out.println(n);
        System.out.println();

        //6
        System.out.println("Soru 6");
        n.put(2,"b");      // 2.elemana b değeri atandı
        System.out.println(n);
        System.out.println();

        //7
        System.out.println("Soru 7");
        System.out.println(n.containsKey(2));   // 2 var mı yokmu (false - true)
        System.out.println();

        //8
        System.out.println("Soru 8");
        System.out.println(n.size());    // iki'li kat sayısını aldı
        System.out.println();

        //9
        System.out.println("Soru 9");
        System.out.println(n.values());    // Keylerin karşılığı olan value'ları döndürür
        System.out.println();

        //10
        System.out.println("Soru 10");
        for (Map.Entry<Integer,String> e : n.entrySet()){   // sıralama yapar
            System.out.println(e);
        }
        System.out.println();

        //11
        System.out.println("Soru 11");
        HashMap<Integer,String> n2 = new HashMap<>(Map.of(7,"g",
                8,"h",
                9,"i",
                10,"j"));
        HashMap<Integer,String> n3 = new HashMap<>();      // Yeni eleman ekler yeni dizi oluşturur

        n3.putAll(n);
        n3.putAll(n2);
        System.out.println(n3);




    }
}
