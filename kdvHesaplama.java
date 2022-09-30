import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.08, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.println("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        double kdv = (tutar <= 1000) ? kdvOran = 0.08 :  kdvOran ;
        kdvOran=kdv;

        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Oranı :" + kdvTutar);
        System.out.println("KDV Tutarı :" + kdvTutar);
        System.out.println("KDV'li Tutarı :" + kdvliTutar);
    }
}
