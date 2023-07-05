package Hafta08;

import java.util.HashMap;
import java.util.Scanner;

public class hashmap_sayi_donusum {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "bir");
        hm.put(2, "iki");
        hm.put(3, "üç");
        hm.put(4, "dört");
        hm.put(5, "beş");
        hm.put(6, "altı");
        hm.put(7, "yedi");
        hm.put(8, "sekiz");
        hm.put(9, "dokuz");
        hm.put(0, "");

        HashMap<Integer, String> hm1 = new HashMap<>();
        hm1.put(1, "On");
        hm1.put(2, "Yirmi");
        hm1.put(3, "Otuz");
        hm1.put(4, "Kırk");
        hm1.put(5, "Elli");
        hm1.put(6, "Altmış");
        hm1.put(7, "Yetmiş");
        hm1.put(8, "Seksen");
        hm1.put(9, "Doksan");
        hm1.put(0, "");
        String s = "";

        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Bir sayı giriniz: ");
            s = scan.next();
            if(Integer.parseInt(s)>0 && Integer.parseInt(s)<100)
                break;
            else System.out.println("Lütfen iki basamaklı bir sayı giriniz!");
        }

        int o = Integer.parseInt(Character.toString(s.charAt(0)));
        int b = Integer.parseInt(Character.toString(s.charAt(1)));

        System.out.println(hm1.get(o)+" "+hm.get(b));






    }
}
