import java.util.Scanner;

public class StringIfadeyiTerstenYazdiranApp {

    public static void main(String[] args) {


        StringBuilder deger = new StringBuilder("Merhaba Java");

        System.out.println(deger.reverse().toString());


        String deger2 = "Merhaba Java";


        for (int i =deger2.length()-1; i >=0; i--) {
            System.out.print(deger2.charAt(i));
    }

    }

}
