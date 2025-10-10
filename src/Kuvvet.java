import java.util.Scanner;
public class Kuvvet {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("satır sayısını giriniz: ");
        n = input.nextInt();
        for(int i=1; i<=n; i*=2){
            System.out.println(i);
        }
    }
}
