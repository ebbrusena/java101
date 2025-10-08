import java.util.Scanner;

public class UcakBileti{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan gerekli bilgileri al
        System.out.print("Mesafeyi (KM) giriniz: ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 = Tek Yön, 2 = Gidiş-Dönüş): ");
        int yolculukTipi = input.nextInt();

        // Girilen değerleri kontrol et
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            // Normal bilet fiyatını hesapla
            double normalFiyat = mesafe * 0.10;
            double indirimliFiyat = normalFiyat;

            // Yaşa göre indirim uygula
            if (yas < 12) {
                // 12 yaşından küçükse %50 indirim
                indirimliFiyat = normalFiyat * 0.50;
            } else if (yas >= 12 && yas <= 24) {
                // 12-24 yaş arasıysa %10 indirim
                indirimliFiyat = normalFiyat * 0.10;
            } else if (yas > 65) {
                // 65 yaşından büyükse %30 indirim
                indirimliFiyat = normalFiyat * 0.30;
            }

            double toplamIndirimliFiyat = normalFiyat - indirimliFiyat;

            // Gidiş-dönüş bilet indirimi ve toplam fiyatı hesapla
            if (yolculukTipi == 2) {
                // Gidiş-dönüşse %20 indirim uygula
                double gidisDonusIndirimi = toplamIndirimliFiyat * 0.20;
                toplamIndirimliFiyat = (toplamIndirimliFiyat - gidisDonusIndirimi) * 2;
            }

            System.out.println("Toplam tutar: " + toplamIndirimliFiyat + " TL");
        }
        input.close();
    }
}