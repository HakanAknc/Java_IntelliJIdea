package Deneme03;

public class Kirtasiye {
    private String Defter;
    private String Kalem;
    private String Silgi;
    private int Kalemlik;
    private int boyaKalemi;

    public void setDefter(String Defter){
        this.Defter = Defter;
    }
    public String getDefter(){
        return this.Defter;
    }

    public String getKalem() {
        return Kalem;
    }

    public void setKalem(String kalem) {
        this.Kalem = kalem;
    }

    public String getSilgi() {
        return Silgi;
    }

    public void setSilgi(String silgi) {
        this.Silgi = silgi;
    }

    public int getKalemlik() {
        return Kalemlik;
    }

    public void setKalemlik(int kalemlik) {
        this.Kalemlik = kalemlik;
    }

    public int getBoyaKalemi() {
        return boyaKalemi;
    }

    public void setBoyaKalemi(int boyaKalemi) {
        this.boyaKalemi = boyaKalemi;
    }
    public void Hazir(){
        System.out.println("Herşey alındı çanta doldu");
    }
    public void Bitti(){
        System.out.println("Artık gidebiliriz...  :)");
    }

}
