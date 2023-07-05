package Deneme02;

class cokgen{
    protected int yukseklik;
    protected int genislik;

    public void set_genyuk(int a, int b){
        yukseklik = a;
        genislik = b;
    }
}

class dortgen extends cokgen{
    public int alan(){
        return yukseklik*genislik;
    }
}

class ucgen extends cokgen{
    public int alan(){
        return yukseklik*genislik/2;
    }
}

class kare extends cokgen{
    public int alan(){
        return yukseklik*genislik;
    }
}


public class Inheritance_Ornek {
    public static void main(String[] args) {

        dortgen d = new dortgen();
        d.set_genyuk(5,10);
        System.out.println("Dörtgenin alanı : " + d.alan());

        ucgen u = new ucgen();
        d.set_genyuk(4,8);
        System.out.println("Üçgenin alanı : " + d.alan());

        kare k = new kare();
        d.set_genyuk(8,9);
        System.out.println("Karenin alanı : " + d.alan());

    }
}
