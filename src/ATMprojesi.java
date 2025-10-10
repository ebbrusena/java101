import java.util.Scanner;
public class ATMprojesi {
    public static void main(String[] args) {
        String userName , password;
        Scanner input = new Scanner(System.in);

        int right = 3;

        while(right>3){
            System.out.println("kullanıcı adınız:");
            userName = input.nextLine();
            System.out.println("parolanız:");
            password = input.nextLine();
            if(userName.equals("patika") && password.equals("dev123") ){
                System.out.println("sisteme giriş yaptınız.");
            }else{
                right--;
                System.out.println("hatalı kullanıcı adı veya şifre. tekrar deneyiniz.");
                if(right == 0){
                    System.out.println("hesabınız bloke olmuştur.");
                }else{
                    System.out.println("kalan hakkınız: " + right);
                }

            }


        }



    }
}
