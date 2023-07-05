package Hafta06;

interface lmbd{   //lambda için tanımlanması gerekiyor
    void yaz();   //buraya tanımlanmasının sebebi her yerde kullana bilmek
}

public class lambdaInterface {

    public static void main(String[] args) {
        lmbd l = new lmbd(){  //obje tanımlandı

            @Override
            public void yaz(){   //metot oluşturuldu = 1.yazım şekli
                //buraya yaz
                System.out.println("Hakan");
                System.out.println("Ensar");
                System.out.println();
            }
        };
        l.yaz();


        lmbd I2 = ()-> System.out.println("Merhaba Hoşgeldiniz Lambda'ya");   //metot oluşturuldu = 2.yazım şekli
        System.out.println("Caner");
        System.out.println("EVREN");
        I2.yaz();
    }
}
