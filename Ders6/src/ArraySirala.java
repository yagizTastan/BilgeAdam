import java.sql.SQLOutput;

public class ArraySirala {

    public static void main(String[] args){

        int[] array = {7, 3, 125, 9, 1, 0, 17, 88, 22, 4};

        System.out.println("Dizinin Boyutu : " + array.length);

        int i;
        int x;
        int temp = 0;

        for (i = 0; i < array.length ; i++){

            for (x = i + 1; x < array.length; x++){

                if (array[i] > array[x]){
                    temp = array[x];
                    array[x] = array[i];
                    array[i] = temp;
                }
            }
        }

        String sonuc = " ";
        for (int arrayElemani:array){

            sonuc += arrayElemani +", ";

        }
        System.out.println("Dizinin sıralı hali : " + sonuc);
    }
}
