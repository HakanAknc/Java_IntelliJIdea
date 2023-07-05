package Deneme06;

import java.util.Scanner;

public class try_catch_Ornek {
    public static void main(String[] args) {

        try {
            int sonuc = 20/0;
            System.out.println(sonuc);
        } catch (Exception e) {
            System.out.println("Hata : " + e.getMessage() );
        } finally {
            System.out.println("Hakan AKINCI");
        }

        System.out.println();

        try {
            int a,b,sonuc;
            Scanner scan = new Scanner(System.in);
            System.out.print("a : ");
            a = scan.nextInt();
            System.out.print("b : ");
            b = scan.nextInt();
            sonuc = a + b;
            System.out.println("Sonuc : " + sonuc);
        }catch (Exception e){
            System.out.println("Lütfen integer değer giriniz!!! ");
            System.out.println("Hata : " + e.getMessage());
        }finally {
            System.out.println("Ne olursa olsun çalışcak");
        }


    }
}
