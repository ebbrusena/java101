import java.util.Scanner;
public class Vki {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("lütfen boyunuzu metre cinsinde giriniz:" );
        float boy = input.nextFloat();

        System.out.println("Lütfen kilonuzu giriniz: " );
        float kg = input.nextFloat();

        float vki = kg /(boy * boy) ;
        System.out.println("vücut kitle indeksiniz: " +vki);

    }
}
