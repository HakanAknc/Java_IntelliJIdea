package hafta09;

import java.util.regex.Pattern;

public class regex2 {
    public static void main(String[] args) {
        // regex pattern örnekler

		/*
		[abc]	a , b veya c (basit sınıf)
		[abc]? sadece bir kere mi kullanılmış
		[abc]+ birden fazla kullanım destekliyor
		[abc]* hiç kulanılmamış yada birden fazla kullanılmışsa
		[^abc]	a , b veya c (olumsuzlama) dışında herhangi bir karakter
		[a-zA-Z]	a'dan z'ye veya A'dan Z'ye , dahil (aralık )
        [a-d[m-p]]	a'dan d'ye veya m'den p'ye: [a-dm-p] (birleşim)
        [a-z&&[def]]	d, e veya f (kavşak)
        [a-z&&[^bc]]	a'dan z'ye, b ve c hariç: [ad-z] (çıkarma)
        [a-z&&[^m-p]]	a'dan z'ye ve m'den p'ye değil: [a-lq-z](çıkarma)
		 */

        System.out.println("  1 : " + Pattern.matches("\\d", "1"));//true
        System.out.println("  2 : " + Pattern.matches("\\d", "123"));//false
        System.out.println("  3 : " + Pattern.matches("[\\d]{3}", "123"));//true

        System.out.println("  4 : " + Pattern.matches("[abc]", "abc"));//false
        System.out.println("  5 : " + Pattern.matches("[abc]{3}", "abc"));//true
        System.out.println("  6 : " + Pattern.matches("[ab]{3}", "aba"));//true
        System.out.println("  7 : " + Pattern.matches("[abc]{3}", "aaa"));//true
        System.out.println("  8 : " + Pattern.matches("[abc]{2}", "aac"));//false

        System.out.println("  9 : " + Pattern.matches("[0-9]{2}", "99"));//true
        System.out.println(" 10 : " + Pattern.matches("[0-9]{2}", "12"));//true
        System.out.println(" 11 : " + Pattern.matches("[0-9a-z]{4}", "3d4f"));//true
        System.out.println(" 12 : " + Pattern.matches("[0-9a-z]{4}", "3D4f"));//false büyük karakter var
        System.out.println(" 13 : " + Pattern.matches("[0-9a-z]{4}", "1234"));//true

        System.out.println(" 14 : " + Pattern.matches("[0-9&&[^5]]{4}", "1289"));//true 5 hariç 4 basamaklı sayı
        System.out.println(" 15 : " + Pattern.matches("[a-zA-Z&&[^5-8]]{5}", "aA126"));//false
        System.out.println(" 16 : " + Pattern.matches("[a-zA-Z&&[^5-8]]{5}", "aA123"));//false sayısal ifade aramıyoruz


    }
}
