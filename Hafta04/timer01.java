package Hafta04;

import java.util.Timer;
import java.util.TimerTask;

public class timer01 {
    static Timer t;   //her yerde kullanabilmek için buraya yazıldı
    static int sayac=10;   //sayac 10'dan başlıyor
    static TimerTask gorev1,gorev2;

    public static void main(String[] args) {
        t = new Timer();    //obje tanımlandı

        gorev1 = new TimerTask() {
            @Override
            public void run() {
                if(sayac<=0) {
                    t.cancel();   // durdurmak
                } else {
                    sayac -= 3;
                    if(sayac>=0) System.out.print(" / gorev1 =" + sayac);
                }

            }
        };

        gorev2 = new TimerTask() {
            @Override
            public void run() {
                sayac += 3;
                System.out.print(" / gorev2 =" + sayac);
            }
        };

        t.schedule(gorev1,0,1000);    //gorev nesnesi program çalıştıktan sonra 0 milisaniye  her 1000 ms de çalışacak
        t.schedule(gorev2,0,2000);
    }

}