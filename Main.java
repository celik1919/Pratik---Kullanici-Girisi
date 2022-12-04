import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, select;

        Scanner mec = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = mec.nextLine();

        System.out.print("Şifreniz: ");
        password = mec.nextLine();

        if (userName.equals("mstfclk") && password.equals("mec123")) {
            System.out.println("Giriş Yapıldı !");
        } else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            select = mec.nextLine();
            if (select.equals("evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                password=mec.nextLine();
                if (password.equals("mec123")) {
                    System.out.print("Şifreniz daha önceki şifreniz ile aynı olamaz!");
                }else{
                    System.out.print("Yeni şifre oluşturuldu.");
                }

            } else {
                System.out.print("Şifre yanlış tekrar deneyiniz.");
            }

        }
    }
}