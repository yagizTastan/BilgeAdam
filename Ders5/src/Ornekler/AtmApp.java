package Ornekler;

import java.util.Scanner;

public class AtmApp {

    public static void main(String[] args){

        int secenek = 0;
        String sifre = "1234";
        String girilenSifre = "";
        int bakiye = 1_000_000;
        int cekilecekMiktar = 0;
        boolean devamEdilsinMi=false;

        Scanner input=new Scanner(System.in);


        do {

            System.out.println("Hoşgeldiniz...");
            System.out.println("Şifreyi giriniz :");
            girilenSifre=input.next();

            if (girilenSifre.equals(sifre)){

                System.out.println("Hangi işlemi yapmak istiyorsunuz.");
                System.out.println("1- Para Çek");
                System.out.println("0- Çıkış");
                System.out.println("Seçiniz");
                secenek = input.nextInt();

                if (secenek >= 0&&secenek<=1){


                switch (secenek){
                    case 0:
                        System.out.println("İyi Günler");
                        devamEdilsinMi=false;
                        break;
                    case 1:
                        System.out.println("Çekmek istediğiniz tutarı giriniz.");
                        cekilecekMiktar=input.nextInt();
                        if (cekilecekMiktar <= bakiye){
                            bakiye=bakiye-cekilecekMiktar;
                            System.out.println("Çekilen Mikar :" + cekilecekMiktar);
                            System.out.println("Kalan Bakiye :" + bakiye);
                            devamEdilsinMi=true;

                        }else
                            System.out.println("Yetersiz Bakiye");
                            devamEdilsinMi = false;
                }
                }else {
                    System.out.println("Yanlış Seçenek");
                }

            }else {
                System.out.println("Yanlış Şifre girdiniz");
                devamEdilsinMi = true;
            }

        }while (devamEdilsinMi);


    }

}
