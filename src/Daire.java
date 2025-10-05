import java.util.Scanner;
public class Daire {
    public static void main() {
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("yarıçapını giriniz: ");
        r = input.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("dairenin alanı: " +alan);
        System.out.println("dairenin çevresi : " +cevre);

    }
}
