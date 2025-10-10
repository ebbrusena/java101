import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin basamak sayısını giriniz: ");
        int basamakSayisi = input.nextInt();
        for (int i = basamakSayisi; i >= 1; i--) {

            for (int j = 0; j < (basamakSayisi - i); j++) {
                System.out.print(" ");
            }
            for (int k = (2 * i) - 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}