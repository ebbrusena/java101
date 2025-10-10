import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kaç tane sayı gireceksiniz?");
        int k = input.nextInt();
        int sayi;
        int enBuyuk = 0;
        int enKucuk = 1;

        for(int i = 1; i<=k; i++){
            System.out.println(i + ". sayıyı giriniz:  ");
            sayi = input.nextInt();
        }
        if(i == 1){
            enBuyuk = sayi;
            enKucuk = sayi;
        }
        if(sayi > enBuyuk){
            enBuyuk = sayi;
        }
        if(sayi<enKucuk){
            enKucuk = sayi;
        }
        System.out.println("en büyük sayı: " + enBuyuk);
        System.out.println("en küçük sayı: " + enKucuk);
    }
}
