package Odevler;

import java.util.HashMap;
import java.util.Scanner;

public class Odev04_HashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hk1 = new HashMap<>();
        hk1.put(1, "bir");
        hk1.put(2, "iki");
        hk1.put(3, "üç");
        hk1.put(4, "dört");
        hk1.put(5, "beş");
        hk1.put(6, "altı");
        hk1.put(7, "yedi");
        hk1.put(8, "sekiz");
        hk1.put(9, "dokuz");
        hk1.put(0, "");

        HashMap<Integer, String> hk2 = new HashMap<>();
        hk2.put(1, "On");
        hk2.put(2, "Yirmi");
        hk2.put(3, "Otuz");
        hk2.put(4, "Kırk");
        hk2.put(5, "Elli");
        //hk2.put(6, "Altmış");
        //hk2.put(7, "Yetmiş");
        //hk2.put(8, "Seksen");
        //hk2.put(9, "Doksan");
        hk2.put(0, "");
        String s = " ";


        Scanner scan = new Scanner(System.in);
        System.out.print("Saat giriniz (SS:DD) : ");
        s = scan.next();


        int s_onlar = Integer.parseInt(Character.toString(s.charAt(0)));
        int s_birler = Integer.parseInt(Character.toString(s.charAt(1)));
        int d_onlar = Integer.parseInt(Character.toString(s.charAt(3)));
        int d_birler = Integer.parseInt(Character.toString(s.charAt(4)));


        System.out.println(hk2.get(s_onlar)+" "+hk1.get(s_birler));
        System.out.println(hk2.get(d_onlar)+" "+hk1.get(d_birler));




    }
}
