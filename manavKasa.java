import java.util.Scanner;

public class manavKasa {
    public static void main (String [] args){

        double a, e, d, m, p;

        Scanner input = new Scanner(System.in);

        System.out.println(" Armut Kaç Kilo");
        a = input.nextDouble();


        System.out.println("Elma Kaç Kilo");
        e = input.nextDouble();

        System.out.println("Domates Kaç Kilo");
        d = input.nextDouble();

        System.out.println("Muz Kaç Kilo");
        m  = input.nextDouble();

        System.out.println("Patlıcan Kaç Kilo");
        p  = input.nextDouble();

        a *= 2.14;
        e *= 3.67;
        d *= 1.11;
        m *= 0.95;
        p *= 5.00;


        System.out.println("Armut fiyat :" + a);
        System.out.println("Elma fiyat :" + e);
        System.out.println("Domates fiyat :" + d);
        System.out.println("Muz fiyat :" + m);
        System.out.println("Patlıcan fiyat :" + p);




















    }
}
