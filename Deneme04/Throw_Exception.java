package Deneme04;

public class Throw_Exception {

    static void ortalama(int v, int f) {
        if (v > 100 || f > 100 || v < 0 || f < 0) {
            throw new ArithmeticException("Notlar 0 ile 100 arasında olmalı");
        } else {
            System.out.println("Ortalama : " + (v * 0.4 + f * 0.6));
        }
    }
    public static void main(String[] args) {

        ortalama(40,100);
        //ortalama(28,500);  //Hata
        ortalama(28,75);

    }
}


