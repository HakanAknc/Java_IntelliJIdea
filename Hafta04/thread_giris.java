package Hafta04;

public class thread_giris {
    static int i,j;
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {       //new Runnable() = karışık yazdırmak demek
            @Override
            public void run() {
                for(i=0;i<100;i++){
                    System.out.print("AAA - ");
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(j=0;j<100;j++){
                    System.out.print("BBB - ");
                }
            }
        });

        t1.start();
        t2.start();

    }


}