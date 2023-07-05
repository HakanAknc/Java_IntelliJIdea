package Deneme03;

public class OkulMalzemeleri {
    public static void main(String[] args) {
        Kirtasiye krs = new Kirtasiye();

        krs.setDefter("Yeşil");
        krs.setKalem("Uçlu kalem");
        krs.setSilgi("Beyaz silgi");
        krs.setKalemlik(2);
        krs.setBoyaKalemi(12);


        System.out.println("Defterin rengi: " + krs.getDefter());
        System.out.println("Kalem tipi: " + krs.getKalem());
        System.out.println("Silgi tipi " + krs.getSilgi());
        System.out.println("Kalemlik sayısı: " + krs.getKalemlik());
        System.out.println("Boya sayısı: " + krs.getBoyaKalemi());
        krs.Hazir();
        krs.Bitti();

    }

}
