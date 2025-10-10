import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz (n): ");
        int n = input.nextInt();

        double harmonikToplam = 0.0;

        // Döngü 1'den n'ye kadar çalışır
        for (double i = 1; i <= n; i++) {
            harmonikToplam += (1 / i);
        }

        System.out.println("Harmonik Seri Toplamı: " + harmonikToplam);
        input.close();
    }
}