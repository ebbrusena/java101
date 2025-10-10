import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan iki sayı alınır
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = input.nextInt();

        int ebob = 1;

        // EBOB hesaplama
        for (int i = 1; i <= Math.min(sayi1, sayi2); i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }

        // EKOK hesaplama: (sayi1 * sayi2) / EBOB
        int ekok = (sayi1 * sayi2) / ebob;

        // Sonuçlar ekrana yazdırılır
        System.out.println("EBOB (" + sayi1 + ", " + sayi2 + ") = " + ebob);
        System.out.println("EKOK (" + sayi1 + ", " + sayi2 + ") = " + ekok);

        input.close();
    }
}
