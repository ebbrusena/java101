import java.util.Scanner;
public class PolindromSayi {
    static boolean isPolindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;


        }
        if(number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz=" );
        sayi = input.nextInt();

        if(isPolindrom(sayi)) {
            System.out.println(sayi + " bir polindrom sayıdır.");
        }else{
            System.out.println( sayi + " bir polindrom sayı değildir.");
        }
    }

}
