package Hafta04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch_finally {
    public static void main(String[] args) {
        // try-catch

		try {
			int sonuc = 19 / 0;        //by zero
			System.out.println(sonuc);
		} catch (ArithmeticException e) {
			System.out.println("Hata : " + e.getMessage());
		}

        System.out.println();

        try {
            int a,b,sonuc;
            Scanner scan = new Scanner(System.in);
            System.out.print("İlk sayı: ");
            a = scan.nextInt();
            System.out.print("İkinci sayı: ");
            b = scan.nextInt();
            sonuc = a + b;
            System.out.println("Toplam = " + sonuc);

        } catch(InputMismatchException e) {      //hata mesajı
            System.out.println("Lütfen integer değer giriniz!");
            System.out.println("Hata : " + e.getMessage());
        } finally {
            System.out.println("Ne olursa olsun yapılacak son iş!");
        }

        System.out.println();

        try {
            int x,y;
            Scanner scan = new Scanner(System.in);
            System.out.print("x sayısını giriniz: ");
            x = scan.nextInt();
            System.out.print("y sayısını giriniz: ");
            y = scan.nextInt();
            int carp = x * y;
            System.out.println("Çarpım = " + carp);
        }catch (InputMismatchException e){
            System.out.println("Adam akıllı bir değer gir...");
            System.out.println("Hata : " + e.getMessage());
        }

    }

}