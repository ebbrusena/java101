import java.util.Scanner;
public class Dongu {
    public static void main(String[] args) {
        int k;

        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        k = input.nextInt();
        int toplam =0;
        int adet =0;

        for(int i = 1; i <=k; i++){
            if(i % 3 == 0 && i % 4 ==0){
                toplam = toplam + i;
                adet++;

            }
        }
        if(adet > 0){
            double ortalama = (double) toplam/ adet;
            System.out.println("3'e ve 4'e tam bçlünen sayıların ortalaması: " + ortalama);

        }else{
            System.out.println("Girilen aralıkta 3'e ve 4'e tam bölünen sayı yok.");
        }
    }
}
