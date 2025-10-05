import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenleri oluştur
        int mat, fizik, kimya,turkce, tarih, muzik;

        // Scanner sınıfını tanımlıyoruz
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değer al
        System.out.println("matematik notunuz: ");
        mat = inp.nextInt();

        System.out.println("fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.println("kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.println("türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.println("tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.println("muzik notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);

        double sonuc = toplam / 6.0;
        System.out.println("Not ortalmanız: ");
        System.out.println(sonuc);

        if(sonuc>=50){
            System.out.println("geçti");
        }else{
            System.out.println("kaldı");
        }
    }
}
