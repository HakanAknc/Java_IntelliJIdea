package Deneme04;

public class Thread_Kullanim {
    static int i,j;

    public static void main(String[] args) {

        Thread t1 = new Thread(){
            public void run(){
                for (i=0;i<1000;i++){
                    System.out.println("MM");
                }

            }
        };

        Thread t2 = new Thread(){
            public void run(){
                for (j=0;j<1000;j++){
                    System.out.println("OO");
                }

            }
        };
        t1.start();
        t2.start();

    }
}
