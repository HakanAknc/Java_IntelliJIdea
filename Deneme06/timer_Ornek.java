package Deneme06;

import java.util.Timer;
import java.util.TimerTask;

public class timer_Ornek {
    static Timer t;
    static int sayac=15;
    static TimerTask gorev1;

    public static void main(String[] args) {
        t = new Timer();

        gorev1 = new TimerTask() {
            @Override
            public void run() {
                if(sayac<=0) {
                    t.cancel();
                } else {
                    sayac -= 3;
                    if(sayac>=0) System.out.print(" / gorev1 =" + sayac);
                }
            }
        };
        t.schedule(gorev1,0,1000);    //gorev nesnesi program çalıştıktan sonra 0 milisaniye  her 1000 ms de çalışacak

    }
}
