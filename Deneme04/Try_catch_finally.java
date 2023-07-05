package Deneme04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch_finally {
    public static void main(String[] args) {
        System.out.println("Örnek-1");

        try {
            int a = 19 / 0 ;
            System.out.println(a);
        } catch (ArithmeticException e){
            System.out.println("Hata : " + e.getMessage());
        }

        System.out.println("Örnek-2");

        try {
            int a,b,sonuc;
            Scanner scan = new Scanner(System.in);
            System.out.println("a sayısını giriniz: ");
            a = scan.nextInt();
            System.out.println("b sayısını giriniz: ");
            b = scan.nextInt();
            System.out.println("Sonuc : a + b = " + (a+b));
        }catch (InputMismatchException e){
            System.out.println("Hata : Integer girmediniz ");
        }finally {
            System.out.println("İslem Bitti");
        }

        System.out.println("Örnek-3");

        try {
            int [] a = {1,2,3,4,5,6,7,8,9};
            System.out.println(a[8]);
        }catch (Exception e){
            System.out.println("Hata : Olmayan elemanı girdiniz.");
        }
    }
}
