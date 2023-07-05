package Odevler;

public class Odev05_Tanımlar {
    public static void main(String[] args) {
        //2. TreeMap, HashMap ve LinkedHashMap arasındaki farklar nedir?

        /*
         * 1) HashMap:
         * arama ve ekleme sunar amahtar arasında yineleme sunar sıralama keyfidir ve düzen sağlamaz
         * Bir HashMap, anahtara dayalı değerler içerir.
         * Yalnızca benzersiz öğeler içerir.
         * Bir boş anahtara ve birden çok boş değere sahip olabilir.
         * Hiçbir düzen sağlamaz .
         *
         * public class HashMap extends AbstractMap
         * implements Map,Cloneable, Serializable
         */

        /*
        * 2) LinkedHashMap:
        * arama ve ekleme sunar ekleme sırasına göre sıralanır çift bağlantı vardır, ekleme sırasını korur
        * Bir LinkedHashMap, anahtara dayalı değerler içerir.
        * Yalnızca benzersiz öğeler içerir.
        * Bir boş anahtara ve birden çok boş değere sahip olabilir.
        * HashMap ile aynıdır, bunun yerine ekleme sırasını korur .
        *
        * public class LinkedHashMap extends HashMap
        *    implements Map
        **/

        /*
        *3) TreeMap:
        * arama ve ekleme sunar anahtar sırası düzenlenbilir
        * Yalnızca benzersiz öğeler içerir.
        * Herhangi bir null anahtarı veya değeri olmayabilir.
        * Senkronize edilir.
        * Bu bir miras sınıfıdır.
        *
        * genel sınıf TreeMap, AbstractMap uygulamalarını genişletir NavigableMap
        *   , Cloneable, Serializable
        *
        * */

        //System.out.print("Saat giriniz (SS:DD) : ");
        //s = scan.next();
    }

}
