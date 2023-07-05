package Deneme06;

import java.util.Scanner;

public class throw_Ornek {

    static float ortalama(int x,int y){
        float ort = 0;
        if (x>100 || x<0 || y>100 || y<0){
            throw new ArithmeticException("İnteger değer giriniz");
        }else {
            ort = (float) ((float)x*0.4 + (float)y*0.6);
        }

        return ort;
    }

    public static void main(String[] args) {

        int x,y;

        Scanner scan = new Scanner(System.in);
        System.out.print("x : ");
        x = scan.nextInt();
        System.out.print("y : ");
        y = scan.nextInt();
        System.out.println("Ortalama : " + ortalama(x,y));


    }
}
