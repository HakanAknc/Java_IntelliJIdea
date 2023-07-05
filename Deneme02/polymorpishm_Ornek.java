package Deneme02;

class hayvan{
    public void ses(){
        System.out.println("Hayvan sesleri...");
    }
}

class kopek extends hayvan{
    public void ses(){
        System.out.println("Hav Hav");
    }
}

class kedi extends hayvan{
    public void ses(){
        System.out.println("Miyav Miyav");
    }
}

class kus extends hayvan{
    public void ses(){
        System.out.println("Cik Cik");
    }
}

class kurbag extends hayvan{
    public void ses(){
        System.out.println("Vırak Vırak");
    }
}

class inek extends hayvan{
    public void ses(){
        System.out.println("Möö Möö");
    }
}

class koyun extends hayvan{
    public void ses(){
        System.out.println("Mee Mee");
    }
}

class hses extends hayvan{
    public void hses(hayvan Hayvan){
        Hayvan.ses();
    }
}

public class polymorpishm_Ornek {
    public static void main(String[] args) {
        hayvan h = new hayvan();
        h.ses();

        kopek k1 = new kopek();
        k1.ses();

        kedi k2 = new kedi();
        k2.ses();

        kus k3 = new kus();
        k3.ses();

        kurbag k4 = new kurbag();
        k4.ses();

        inek i = new inek();
        i.ses();

        koyun k5 = new koyun();
        k5.ses();

        System.out.println("********************");

        hses hs = new hses();   //polymorpishm burda başlıyor.
        hs.hses(k1);
        hs.hses(k2);





    }
}
