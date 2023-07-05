package Hafta06;

@FunctionalInterface  //Lambda yı tanımlar yazamsan da çalışır zorunlu değil
interface lmbda2{
    int topla(int a,int b);
}

public class lambda_Interface_toplama {
    public static void main(String[] args) {
        lmbda2 l =  (a,b)-> a+b;
        lmbda2 l1 = (a,b)-> a-b;
        lmbda2 l2 = (a,b)-> a*b;


        System.out.println(l.topla(8,13));         // topla
        System.out.println(l.topla(12,12));       // topla
        System.out.println(l1.topla(20,10));     // çıkar
        System.out.println(l2.topla(20,10));    // çarp


    }

}
