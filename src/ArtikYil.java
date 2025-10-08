import java.util.Scanner;

public class ArtikYil {

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan girdi almak için bir nesne oluşturma
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan bir yıl girmesini isteme
        System.out.print("Bir yıl giriniz: ");
        int yil = input.nextInt();

        // Artık yıl olup olmadığını belirlemek için boolean değişkeni
        boolean artikYilMi = false;

        // 4'ün katı olan yıllar artık yıldır
        // Ancak 100'ün katı olanlar artık yıl değildir
        // Ve 400'ün katı olanlar kesinlikle artık yıldır
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artikYilMi = true;
                }
            } else {
                artikYilMi = true;
            }
        }

        // Sonucu ekrana yazdırma
        if (artikYilMi) {
            System.out.println(yil + " bir artık yıldır!");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

        // Kaynakları serbest bırakma
        input.close();
    }
}