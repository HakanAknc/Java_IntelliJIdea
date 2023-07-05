package Deneme05;

enum Gunler {
    PAZARTESİ,SALI,ÇARŞAMBA,PERŞEMBE,CUMA,CUMARTESİ,PAZAR;
}

public class Enum_Kullanim {
    public static void main(String[] args) {
        Gunler g = Gunler.ÇARŞAMBA;
        System.out.println(g);
        System.out.println(g.ordinal());  //ÇARŞAMBA'nın indeks değerini yazdırdı

        System.out.println(g.compareTo(Gunler.CUMARTESİ)); //ÇARŞAMBA - CUMARTESİ = 2 - 5 = -3 indeks numaralarını çıkartıyor
        System.out.println(g.compareTo(Gunler.PAZARTESİ)); //ÇARŞAMBA - PAZARTESİ = 2 - 0 = 2 indeks numaralarını çıkartıyor

        System.out.println(Math.abs(g.compareTo(Gunler.PAZAR)));  //Mutlak değer alır (abs)


    }

}
