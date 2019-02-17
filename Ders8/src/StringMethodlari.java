public class StringMethodlari {

    public static void main(String[] args) {

        String deger = "Merhaba Java";

        System.out.println(deger.toUpperCase());
        System.out.println(deger.toLowerCase());

        System.out.println(deger.charAt(8));

        System.out.println(deger.indexOf('a'));
        System.out.println(deger.lastIndexOf('a'));

        System.out.println(deger.substring(8));
        System.out.println(deger.substring(0, 3));

        System.out.println(deger + " Naber");

        System.out.println(deger.replace('a', 'o'));
        System.out.println(deger.replaceAll(" ", ""));

        String bosluk = " Merhaba ";
        System.out.println(bosluk);
        System.out.println(bosluk.trim());

        String adSoyad = "Yağız TAŞTAN";
        String ad="";
        String soyad="";

        int boslukDeger = adSoyad.indexOf(" ");

        ad=adSoyad.substring(0, boslukDeger);
        soyad=adSoyad.substring(boslukDeger+1);

        System.out.println("Ad : " + ad);
        System.out.println("Soyad : " + soyad);


        System.out.println("char array kullanımı : ");
        char[] array = deger.toCharArray();

        for (char c:array){
            System.out.println(c);
        }

        String a = "12";
        int sayi1 = Integer.parseInt(a);
        System.out.println(sayi1+1);

        int sayi2 = Integer.valueOf(a);
        System.out.println(sayi2+2);

        String stringSayi = String.valueOf(sayi1);
        System.out.println(stringSayi);


    }

}
