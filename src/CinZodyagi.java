import java.util.Scanner;

public class CinZodyagi {

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan girdi almak için bir nesne oluşturma
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan doğum yılını girmesini isteme
        System.out.print("Doğum yılınızı giriniz: ");
        int dogumYili = input.nextInt();

        // Doğum yılının 12 ile bölümünden kalanı hesaplama
        int zodyakKalan = dogumYili % 12;

        // Hesaplanan kalana göre Çin Zodyağı burcunu bulma
        String zodyakBurcu = "";

        switch (zodyakKalan) {
            case 0:
                zodyakBurcu = "Maymun";
                break;
            case 1:
                zodyakBurcu = "Horoz";
                break;
            case 2:
                zodyakBurcu = "Köpek";
                break;
            case 3:
                zodyakBurcu = "Domuz";
                break;
            case 4:
                zodyakBurcu = "Fare";
                break;
            case 5:
                zodyakBurcu = "Öküz";
                break;
            case 6:
                zodyakBurcu = "Kaplan";
                break;
            case 7:
                zodyakBurcu = "Tavşan";
                break;
            case 8:
                zodyakBurcu = "Ejderha";
                break;
            case 9:
                zodyakBurcu = "Yılan";
                break;
            case 10:
                zodyakBurcu = "At";
                break;
            case 11:
                zodyakBurcu = "Koyun";
                break;
        }

        // Sonucu ekrana yazdırma
        System.out.println("Çin Zodyağı burcunuz: " + zodyakBurcu);

        // Kaynakları serbest bırakma
        input.close();
    }
}