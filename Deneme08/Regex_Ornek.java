package Deneme08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Ornek {
    public static void main(String[] args) {
        String s = "Ancak görünüş aldatıcıdır. Özgür olduğumuz için burda değiliz, özgür olmadığımız için burdayız. Kaçmak için bir nedenimiz yok." +
                " İkimizde çok iyi biliyoruz ki amaç olmazsa biz de var olamayız. Bizi yaratan işte o amaç. Amaç bizi birleştiriyor." +
                " Amaç bizi çekiyor, yol gösteriyor, harekete geçiriyor. Amaç hareketlerimiz tanımlıyor, bizi birbirimize bağlıyor." +
                " Senin yüzünden burdayız, senin bizden almaya çalıştığını senden almak için burdayız: Amaç";


        Pattern p = Pattern.compile("[\s]{1}");   //boşluk karekterlerini sayaç
        Matcher m = p.matcher(s);

        int sayac=0;
        while(m.find()) sayac++;

        System.out.println(sayac);

    }
}
