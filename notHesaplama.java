import java.util.Scanner;
public class notHesaplama {
    public static void main(String[] args) {

        int  mat, fen, turk, sos;

        Scanner inp = new Scanner (System.in);

        System.out.println ("Mat notunuzu giriniz : ");
        mat = inp.nextInt();

        System.out.println("Fen notunuzu giriniz : ");
        fen = inp.nextInt();

        System.out.println("Turk notunuzu giriniz : ");
        turk = inp.nextInt();

        System.out.println("Sos notunuzu giriniz : ");
        sos = inp.nextInt();

     double ortalama = (mat+fen+turk+sos)/4;
     System.out.println("Ortalama: " + ortalama);
     String Mesaj = ortalama > 60 ? "Geçtiniz" : "Kaldınız";
     System.out.println("Derslerden: " + Mesaj);
    }
}