package methodlar;

public class Ornekler {

    public static void main(String[] args){

        helloMethod();

        sayiYaz(12);

        int sonuc = 15 + 25;

        sayiYaz(sonuc);

        int gelelDeger=donusTipiOlanToplamaIslemi(7, 2);

        System.out.println("Donus tipi olan toplama islemi: " + gelelDeger);
    }

    public static void  helloMethod(){


System.out.println("Hello Method");
}
    public static void sayiYaz(int sayi){

        System.out.println("Sayınız: " + sayi);
    }

    public static int donusTipiOlanToplamaIslemi(int sayi1, int sayi2){

        int sonuc=sayi1+sayi2;

        return sonuc;
    }
}
