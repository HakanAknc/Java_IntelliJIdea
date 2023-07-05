package Deneme04;

import java.util.Timer;
import java.util.TimerTask;

public class Timer_Kullanim {

    static int sayac = 0;

    public static void main(String[] args) {

        Timer myTimer = new Timer();

        TimerTask gorev = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Merhaba");
                sayac++;
                if (sayac==7) myTimer.cancel();
            }
        };
        myTimer.schedule(gorev,0,1000);

        TimerTask gorev2 = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Gorev2 Çalışıyor");
            }
        };
        myTimer.schedule(gorev2,0,300);


    }
}
