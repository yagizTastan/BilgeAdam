package MathIslemleri;

import java.util.Random;
import java.util.Scanner;

public class ornekler {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rnd = (int) (Math.random()*10);

        int tahmin;

        boolean devamEdilsinMi= false;

        do {
            System.out.println("Sayıyı tahmin et bakalım : ");
            tahmin = input.nextInt();

            if (tahmin == rnd + 2 || tahmin == rnd - 2){
                System.out.println("Yaklaştınız..");
                devamEdilsinMi = true;
            }
            else if (tahmin == rnd + 1 || tahmin == rnd - 1){
                System.out.println("Yaklaştınız...");
                devamEdilsinMi = true;
            }
            else if (tahmin == rnd){
                System.out.println("Tebrikler bildiniz !!! ");
                devamEdilsinMi = false;
            }else{

                System.out.println("Yaklaşamadınız.");
                devamEdilsinMi = true;
            }


        }while (devamEdilsinMi);
    }

    }
