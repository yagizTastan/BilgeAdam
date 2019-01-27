package ilkelveritipleri;

public class Main {
    public static void main(String[] args){

        int a = 5;
        System.out.println("a bir int değer = " + a);
        Integer b = 5;
        System.out.println("b bir int değer = " + b);
        Integer c = new Integer(5);
        System.out.println("c bir int değer = " + c);
        int sonuc;
        System.out.println("Sonuc = " + (sonuc = (a+b+c)));

        long along = 4;
        System.out.println("Bu bir long değerdir " + along);

        Long blong = 456L;
        System.out.println("Bu bir long değerdir " + blong);

    }
}
