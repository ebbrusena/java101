import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.println("kullanıcı adınız: ");
        userName = input.nextLine();

        System.out.println("şifreniz: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("giriş yaptınız");
        }else{
            System.out.println("bilgileriniz yanlış");
        }
    }
}
