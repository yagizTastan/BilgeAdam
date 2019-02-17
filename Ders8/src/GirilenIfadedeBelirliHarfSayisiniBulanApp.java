import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class GirilenIfadedeBelirliHarfSayisiniBulanApp {

    public static void main(String[] args) {

        //Kullanıcı ilk olarak bir string ifade girecek.
        //Sonrasında bir harf girecek.
        //Program girilen harf sayısını o ifade içerisinde sayısını bulacak.

        Scanner input = new Scanner(System.in);

        System.out.println("Bir string ifadesini giriniz...");
        String girilenCumle = input.nextLine();// Ard arda bir string girilidiği için nextline ile alınır.
        System.out.println("Sayısını bulmak istediğiniz harfi giriniz");
        String girilenharf = input.next();
        int sayac = 1;
        char[] arrayCumle = girilenCumle.toCharArray();
        char[] arrayHarf = girilenharf.toCharArray();
        for (int i = 0; i<arrayCumle.length; i++){
            if (arrayHarf == arrayCumle){
                sayac++;
            }
        }

        System.out.println(sayac);

    }

}
