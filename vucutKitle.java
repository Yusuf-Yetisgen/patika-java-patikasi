import java.util.Scanner;

public class vucutKitle {
    private static double sonuc;

    public static void main (String[] args) {

     double boy, kilo, index;
     Scanner input = new Scanner(System.in);

     System.out.println("Boyunuzu giriniz (m): ");
     boy = input.nextDouble();

         System.out.println("Kilonuzu giriniz(kg) : ");
        kilo = input.nextDouble();

        index= kilo/(boy*boy);
     System.out.println( "Kitle indeksin: " + index);





    }
}
