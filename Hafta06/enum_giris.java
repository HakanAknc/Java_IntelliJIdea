package Hafta06;  // Alanları sabit bir sabitler kümesinden oluşan java.lang.Enum dan türeyen özel sınıf türüdür.

//COLOR.RED;

enum Gunler{   //class açıldı        // enum = sabitleri olarak adlandırılır.
    PAZARTESİ,     // 0 indis
    SALI,          // 1 indis
    ÇARŞAMBA,      // 2 indis
    PERŞEMBE,      // 3 indis
    CUMA,          // 4 indis
    CUMARTESİ,     // 5 indis
    PAZAR          // 6 indis
}

public class enum_giris {
    public static void main(String[] args) {
        Gunler g = Gunler.PAZARTESİ;    //obje tanimlandi
        System.out.println(g);         //ilk işlem pazartesiyi yazdırdı

        Gunler g1 = Gunler.ÇARŞAMBA;   //obje tanımlandı
        System.out.println(g1);


        System.out.println(g.compareTo(Gunler.PERŞEMBE)); // KARŞILAŞTIRMA yapıyor pazartesi ile perşembenin arasındaki farkı bulur.
                                                           // 0-3 = -3 bulur

        System.out.println(g.compareTo(Gunler.PAZAR)); // KARŞILAŞTIRMA yapıyor pazartesi ile pazar arasındaki farkı bulur.
                                                            // 0 - 6 = -6 yazdırır

        System.out.println(g.ordinal());  //Pazartesi'nin İNDEKS değerini yazdırır.
        //System.out.println(Gunler.PAZARTESİ.ordinal());  //Bu şekilde de pazartesinin indeks numarasını verir.


        System.out.println(Gunler.PAZAR.ordinal());     //PAZAR'ın indeks numarasını verir.
        System.out.println(Gunler.ÇARŞAMBA.ordinal());  //ÇARŞAMBA'nın indeks numarasını verir.

    }
}
