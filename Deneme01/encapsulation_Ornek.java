package Deneme01;

class Ogrenci2{
    private String Ad;
    private String Soyad;
    private int Yas;

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public int getYas() {
        return Yas;
    }

    public void setYas(int yas) {
        if(yas>0) this.Yas = yas; else System.out.println("Yaş sıfırdan küçük olamaz");
    }
}

public class encapsulation_Ornek {
    public static void main(String[] args) {

        Ogrenci2 ogr2 = new Ogrenci2();

        ogr2.setAd("Evren");
        System.out.println(ogr2.getAd());

        ogr2.setSoyad("Akıncı");
        System.out.println(ogr2.getSoyad());

        ogr2.setYas(4);
        System.out.println(ogr2.getYas());


    }
}
