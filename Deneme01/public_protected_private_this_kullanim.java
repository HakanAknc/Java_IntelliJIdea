package Deneme01;

class erisim{
    public String ad;
    protected String soyad;
    private int yas;

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}

public class public_protected_private_this_kullanim {
    public static void main(String[] args) {

        /*
		 Access Levels
		 Modifier 	   Class 	Package 	Subclass 	World
		 public 	     Y 		  Y 			Y 			Y
		 protected 	     Y 		  Y 			Y 			N
		 no modifier     Y 		  Y 			N 			N
         private 	     Y 		  N 			N 			N
		 */

        erisim ers = new erisim();

        ers.ad = "Eyüpcan";
        System.out.println(ers.ad);

        ers.soyad = "Akıncı";
        System.out.println(ers.soyad);

        ers.setYas(24);
        System.out.println(ers.getYas());



    }
}
