import java.util.Scanner;

public class Taksimetre {
    static void main(String[] args) {
        int km ;
        double perKm = 2.20, startPrice = 10;
        double total;
        Scanner input = new Scanner(System.in);
        System.out.println("mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();

        total = (km * perKm);
        total += startPrice;

        total = (total<20) ? 20 : total;
        System.out.println("toplam tutar: "total);
    }
}
