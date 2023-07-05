package Deneme08;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lambda_Ornek {
    public static void main(String[] args) {
        //Lambda
        List<Integer> z = Arrays.asList(1,0,3,2,5,6,9,7,0);

        //Soru1;
        List<Integer> a = z.stream().map(p->p%3==2?p+1:p).collect(Collectors.toList());
        System.out.println(a);

        //Soru2
        List<Integer> b = z.stream().filter(p->p%5<4 && p>5).collect(Collectors.toList());
        System.out.println(b);

        //Soru3
        Optional<Integer> c = z.stream().reduce((p1,p2)->p1%5==0?p1:p2);
        System.out.println(c.get());

        //Soru4
        List<Integer> d = z.stream().filter(p->p%5==2 || p%5==0).collect(Collectors.toList());
        System.out.println(d);

    }
}
