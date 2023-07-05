package Hafta04;

import java.util.Timer;
import java.util.TimerTask;

public class timer03 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int zaman = 5;

            @Override
            public void run() {
                System.out.println("Kalan Süre: " + zaman++);
                if (zaman < 0) {
                    zaman = 5; timer.cancel();
                }
            }
        };
        timer.schedule(task, 2000, 1000); // delay = belirlenen süre kadar geç başlatma
                                                     // period = belirlenen saniye aralıkları ile akrana yazdırma
    }
}
