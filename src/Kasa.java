import java.util.Scanner;

public class Kasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ürünlerin kilogram fiyatları
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        // Kullanıcıdan alınacak kilogram değerleri
        System.out.print("Armut Kaç Kilo ? : ");
        double armutKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        double elmaKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        double domatesKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        double muzKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlicanKg = input.nextDouble();

        // Toplam tutar hesaplama
        double toplamTutar = (armutKg * armutFiyat) +
                (elmaKg * elmaFiyat) +
                (domatesKg * domatesFiyat) +
                (muzKg * muzFiyat) +
                (patlicanKg * patlicanFiyat);

        // Toplam tutarı ekrana yazdırma (2 ondalık basamak)
        System.out.printf("Toplam Tutar : %.2f TL%n", toplamTutar);
    }
}
