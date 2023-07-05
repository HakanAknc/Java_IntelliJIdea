package Deneme01;

class statik{

    public void statikolmayan(){
        System.out.println("Statik olmayan fonksiyon.");
    }
    public static void statikOlan(){
        System.out.println("Statik olan fonksiyon.");
    }

}

public class Statik_Ornek {
    public static void main(String[] args) {
        /* Her hangi bir class'dan metot,fonksiyon çağırırken ilk önce onun objesini oluştururuz.
        Ama static deyiminiz kullanırsak objeyi tanımlamaya gerek kalmaz.
         */


        statik s = new statik();    //obje tanımlandı
        s.statikolmayan();
        statik.statikOlan();

        System.out.println();

        statik.statikOlan();       //bu şekilde kolayca tanımlana bilir statik tanımlarsak



    }
}
