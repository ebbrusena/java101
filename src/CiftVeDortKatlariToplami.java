import java.util.Scanner;

public class CiftVeDortKatlariToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        do {
            System.out.print("Bir sayı giriniz: ");
            sayi = input.nextInt();

            // Sadece çift ve 4'ün katı olan sayılar toplanıyor
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }

        } while (sayi % 2 == 0);  // Tek sayı girilene kadar devam eder

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + toplam);

        input.close();
    }
}
