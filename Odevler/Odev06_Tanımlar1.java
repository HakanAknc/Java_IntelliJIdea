package Odevler;

public class Odev06_Tanımlar1 {
    public static void main(String[] args) {
        //3. HashSet ve TreeSet arasındaki farklar nelerdir?

        /* 1) HashSet:
        * Java'daki HashSet aslında bir HashMap örneği olan bir karma tablo tarafından desteklenen set arayüzünü
        * uygulayan bir sınıftır. Bu sınıf boş öğeye izin verir ve HashSet'teki öğeler sıralı değil.
        * rama, ekleme ve silme gibi işlemler için HashSet bu işlemler için ortalama olarak sabit bir süre alır.
        * HashSet, TreeSet'ten daha hızlıdır. HashSet bir karma tablo kullanılarak gerçekleştirilir
        * HashSet, Set'teki iki nesneyi karşılaştırmak ve kopyaları algılamak için equals() yöntemini kullanır.
        * */


        /* 2) TreeSet:
        * TreeSet, HashSet'ten daha yüksek olan arama ekleme ve silme için O(Log n) alır.
        * Ancak TreeSet sıralanmış verileri tutar.
        * Ayrıca, high () (En az yüksek öğeyi döndürür), floor() , tavan() vb. işlemleri destekler.
        * Bu işlemler ayrıca TreeSet'te O(Log n)'dir ve HashSet'te desteklenmez.
        * TreeSet, kendi kendini dengeleyen bir ikili arama ağacı ( Kırmızı-Siyah Ağaç ) kullanılarak uygulanır.
        * HashSet'in aksine TreeSet, nesneleri Java'da Comparable veya Comparator yöntemiyle tanımlanan Sıralı düzende tutar.
        * TreeSet, null Object'e izin vermez
        *
        * */


    }
}
