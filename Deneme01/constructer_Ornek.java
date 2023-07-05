package Deneme01;

class kup{
    int en;
    int boy;
    int yukseklik;

    int kupHacmi(){
        return en*boy*yukseklik;
    }
    kup(){
        en = 10;
        boy = 20;
        yukseklik = 30;
    }

}

public class constructer_Ornek {
    public static void main(String[] args) {

        kup k = new kup();
        System.out.println(k.kupHacmi());


    }
}
