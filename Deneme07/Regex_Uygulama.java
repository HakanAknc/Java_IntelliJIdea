package Deneme07;

import java.util.regex.Pattern;

public class Regex_Uygulama {
    public static void main(String[] args) {
        //Regex Ornekleri

        System.out.println("  1 : " + Pattern.matches("\\d", "1"));//true     //Bir rakam: [0-9]

        System.out.println("  2 : " + Pattern.matches("\\d", "123"));//false

        System.out.println("  3 : " + Pattern.matches("\\D", "m"));//true  //Rakam olmayan: [^0-9]

        System.out.println("  4 : " + Pattern.matches("\\D", "12lm"));//false

        System.out.println("  5 : " + Pattern.matches("[\\d]{3}", "123"));//true

        System.out.println("  6 : " + Pattern.matches("[abc]", "abc"));//false    //parentez içinde olunca tek karekter arar

        System.out.println("  7 : " + Pattern.matches("[abc]{3}", "abc"));//true  //köşeli parantez tek karekter olarak arar

        System.out.println("  8 : " + Pattern.matches("[abc]", "a"));//true

        System.out.println("  9 : " + Pattern.matches("abc", "abc"));//true

        System.out.println(" 10 : " + Pattern.matches("[ab]{3}", "aba"));//true

        System.out.println(" 11 : " + Pattern.matches("[0-9]", "9"));//true

        System.out.println(" 12 : " + Pattern.matches("[0-9]", "945"));//false

        System.out.println(" 13 : " + Pattern.matches("[0-9a-z]{4}", "3d4f"));//true

        System.out.println(" 14 : " + Pattern.matches("[0-9a-z]{4}", "3D4f"));//false    //büyük karakter var

        System.out.println(" 15 : " + Pattern.matches("[0-9&&[^5]]{4}", "1289"));//true   //5 hariç 4 basamaklı sayı

        System.out.println(" 16 : " + Pattern.matches("[a-zA-Z&&[^5-8]]{5}", "aABvf"));//true

        System.out.println(" 17 : " + Pattern.matches("[a-zA-Z&&[^5-8]]{5}", "aA123"));//false  //sayısal ifade aramıyoruz

    }
}
