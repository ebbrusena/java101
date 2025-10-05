import java.util.Scanner;

public class Kdv {
    public static void main(String[] args){
        double tutar, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("tutarı giriniz: ");

        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran;

        double kdvliTutar = tutar + kdvTutar;
        System.out.println("kdv oranı: "+kdvOran);
        System.out.println("kdv tutarı:"+kdvTutar);
        System.out.println("kdvli tutar:"+kdvliTutar);
        System.out.println(kdvliTutar);

    }

}
