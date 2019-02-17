public class StringKelimeSayisiBulma {

    public static void main(String[] args) {

        String deger = "stringIfadeleriGetirenMethod";

        int sayac = 1;
        char[] array = deger.toCharArray();
        String temp="";

        for (int i =0; i<array.length; i++){

            temp = String.valueOf(array[i]);
            if (temp.equals(temp.toUpperCase())){
                sayac++;

            }

        }
        System.out.println("Girilen kelime sayısı : " + sayac);


    }
}
