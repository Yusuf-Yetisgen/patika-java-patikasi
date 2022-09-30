import java.util.Scanner;

public class hipotenüs {
    public static void main (String[] args) {

        int a, b ,c;

        Scanner girdi= new Scanner(System.in);
        System.out.println("1. kenarı gir");
        a = girdi.nextInt();
        System.out.println("2. kenarı gir");
        b = girdi.nextInt();
        System.out.println("3. kenarı gir");
        c = girdi.nextInt();

         double sonuc= Math.sqrt((a*a) + (b*b) + (c*c));
         System.out.println("Hipotenüs : " + sonuc );
    }
}
