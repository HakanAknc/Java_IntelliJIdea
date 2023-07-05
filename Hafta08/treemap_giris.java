package Hafta08;

import java.util.TreeMap;

public class treemap_giris {
    public static void main(String[] args) {
        TreeMap<String,Boolean> tmp = new TreeMap<>();   //Girilen veriyi alfabetik olarak sıralar
        tmp.put("Ali",true);
        tmp.put("Ayşe",false);
        tmp.put("Zeynep",false);
        tmp.put("Betül",true);

        System.out.println(tmp);

        System.out.println(tmp.get("Ayşe"));  // keyin karşılığı olan valu değeri yazdırı
        System.out.println(tmp.get("Ali"));   // keyin karşılığı olan valu değeri yazdırı
        System.out.println();


        System.out.println(tmp.get("Yasin"));  //null = bir değer atanmamış


        System.out.println(tmp.containsKey("Ali"));     //Ali var olduğu için true döndürür


        System.out.println(tmp.containsKey("Ayşe"));     //Ayşe var olduğu için true döndürür


        System.out.println(tmp.containsKey("Ahmet"));  //Ahmet var olmadığı için false döndürür

    }
}
