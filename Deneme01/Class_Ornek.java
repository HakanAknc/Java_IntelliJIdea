package Deneme01;

class Ogrenci1 {
    String ad;       //Bunlar şuan publicdir yani herkese açık
    String soyad;     //Bunlar şuan publicdir yani herkese açık
    int yas;          //Bunlar şuan publicdir yani herkese açık
}


public class Class_Ornek {
    public static void main(String[] args) {

        Ogrenci1 ogr1 = new Ogrenci1();

        ogr1.ad = "Hakan";
        ogr1.soyad = "Akıncı";
        ogr1.yas = 20;

        System.out.println(ogr1.ad);
        System.out.println(ogr1.soyad);


    }
}
