import java.util.Scanner;
public class UsluSayi {
    public static void main(String[] args) {
        int n,k;
        Scanner input = new Scanner(System.in);

        System.out.println("üssü alınacak sayı: ");
        n = input.nextInt();
        System.out.println("üs olacak sayı: ");
        k = input.nextInt();

        int total = 1;

        for(int i=1 ; i<=k; i++){
            total *= n;
        }
        System.out.println("cevap:" + total);
    }
}
