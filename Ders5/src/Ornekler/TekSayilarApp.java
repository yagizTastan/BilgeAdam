package Ornekler;

public class TekSayilarApp {

    public static void main(String[] args) {
        int sayi;
        for (int i = 0; i <= 100; i++) {
            sayi = 0;
            if (i % 2 ==0){
            sayi++;
            }
            if (sayi == 0) System.out.println("Tek Sayı = "+i);
        }
    }
}
