package methodlar;

import java.util.Scanner;

public class OrnekMethodHoca {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secenek, sayi1, sayi2;
        double sonuc;
        boolean devamEdilsinMi = false;


        do {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
            System.out.println("1 - Toplama");
            System.out.println("2 - Çıkarma");
            System.out.println("3 - Bölme");
            System.out.println("4 - Çarpma");
            System.out.println("0 - Çıkış");

            System.out.print("Seçiniz:");
            secenek = input.nextInt();

            switch (secenek) {
                case 1:
                System.out.print("1. Sayıyı Giriniz.");
                sayi1 = input.nextInt();
                System.out.print("2. Sayıyı Giriniz.");
                sayi2 = input.nextInt();
                sonuc = toplamaIslemi(sayi1, sayi2);
                System.out.println("Toplama İşlemi Sonnucu : " + sonuc);
                break;
                case 0:
                    devamEdilsinMi = false;
                    System.out.println();
                    break;
                default:
                    System.err.println("Yanlış işlem seçildi!");
                    devamEdilsinMi = true;

            }
        } while (devamEdilsinMi);

    }

    public static double toplamaIslemi(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }
}
