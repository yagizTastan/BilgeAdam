package methodlar;

import java.util.Scanner;

public class OrnekMethod {

    public static void main(String[] args){

        int islem = 0;
        int sayi1;
        int sayi2;
        boolean yeniIslem = false;

        Scanner input = new Scanner(System.in);

        do {


            System.out.println("Lütfen Yapmak İstedğiniz İşlemi seçiniz.");
            System.out.println("0 = Toplama");
            System.out.println("1 = Çıkarma");
            System.out.println("2 = Bölme");
            System.out.println("3 = Çarpma");
            islem = input.nextInt();


            if (islem >= 0 && islem <= 3) {


                switch (islem) {

                    case 0:
                        System.out.println("Toplamak istedğiniz ilk sayıyı giriniz");
                        sayi1 = input.nextInt();
                        System.out.println("Toplamak istedğiniz ikinci sayıyı giriniz");
                        sayi2 = input.nextInt();
                        int toplamaSonuc = toplama(sayi1, sayi2);
                        System.out.println("Toplama Sonucu : " + toplamaSonuc);
                        yeniIslem = true;
                        break;
                    case 1:
                        System.out.println("Çıkarmak istedğiniz ilk sayıyı giriniz");
                        sayi1 = input.nextInt();
                        System.out.println("Çıkarmak istedğiniz ikinci sayıyı giriniz");
                        sayi2 = input.nextInt();
                        int cikarmaSonuc = cikarma(sayi1, sayi2);
                        System.out.println("Çıkarma Sonucu : " + cikarmaSonuc);
                        yeniIslem = true;

                        break;
                    case 2:
                        System.out.println("Bölmek istedğiniz ilk sayıyı giriniz");
                        sayi1 = input.nextInt();
                        System.out.println("Bölmek istedğiniz ikinci sayıyı giriniz");
                        sayi2 = input.nextInt();
                        int bolmeSonuc = bolme(sayi1, sayi2);
                        System.out.println("Bölme Sonucu : " + bolmeSonuc);
                        yeniIslem = true;

                        break;
                    case 3:
                        System.out.println("Çarpmak istedğiniz ilk sayıyı giriniz");
                        sayi1 = input.nextInt();
                        System.out.println("Çarpmak istedğiniz ikinci sayıyı giriniz");
                        sayi2 = input.nextInt();
                        int carpmaSonuc = carpma(sayi1, sayi2);
                        System.out.println("Çarpma Sonucu : " + carpmaSonuc);
                        yeniIslem = true;

                        break;
                        default:
                }
            }
            else{
                System.out.println("Yanlış seçenek lütfen tekrar deneyin");
                yeniIslem = true;
            }


        }while (yeniIslem);
    }

    public static int toplama(int sayi1, int sayi2){

        int sonuc = sayi1 + sayi2;

        return sonuc;
    }

    public static int cikarma(int sayi1, int sayi2){

        int sonuc = sayi1 - sayi2;

        return sonuc;
    }

    public static int bolme(int sayi1, int sayi2){

        int sonuc = sayi1 / sayi2;

        return sonuc;
    }

    public static int carpma(int sayi1, int sayi2){

        int sonuc = sayi1 * sayi2;

        return sonuc;
    }


}
