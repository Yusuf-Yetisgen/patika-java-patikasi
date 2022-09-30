import java.util.Scanner;

public class hesapMakinasi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        n2 = input.nextInt();

        System.out.println("1- Toplama \n 2- Çıkarma \n 3- Çarpma \n 4- Bölme");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();

        switch (select) {
            case 1: {
                System.out.println("Toplam : " + (n1 + n2));
            }
            break;
            case 2: {
                System.out.println("Çıkarma : " + (n1 - n2));
            }
            break;
            case 3: {
                System.out.println("Çarpma : " + (n1 * n2));
            }
            break;
            case 4: {
                if (n2 != 0) {
                    System.out.println("Bölme : " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez");
                }
                break;
            } default:  {
                System.out.println("Yanlış Değer Geçerli Bir Değer Giriniz ");
            }
        }
    }
}
