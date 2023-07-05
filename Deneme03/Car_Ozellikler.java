package Deneme03;

public class Car_Ozellikler {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.rengi = "Siyah";
        car1.model = "MCLAREN";
        car1.motorHacmi = 6.5;
        car1.kapiSayisi = 2;
        car1.arabaninSahibi = "Hakan Akıncı";
        car1.malinmulkunAsilSahibi = "ALLAH (CC)";
        car1.nasipeden = "YERLERİN VE GÖKLERİN SAHİBİ OLAN ALLAH (CC)";
        car1.yanKoltuk = "Yunus Ensar Günay";



        System.out.println("Arabanın rengi: " + car1.rengi);
        System.out.println("Arabanın markası: " + car1.model);
        System.out.println("Arabanın motor hacmi: " + car1.motorHacmi);
        System.out.println("Arabanın kapısayısı: " + car1.kapiSayisi);
        System.out.println("Arabanın sahibi: " + car1.arabaninSahibi);
        System.out.println("Malın mülkün asıl sahibi: " + car1.malinmulkunAsilSahibi);
        System.out.println("Nasip eden: " + car1.nasipeden);
        System.out.println("Yan koltukta oturan KİM: " + car1.yanKoltuk);

    }

}
