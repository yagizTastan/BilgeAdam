package ikiboyutluarray;

public class ikiboyutluarray {

    public static void main(String[] args) {

        int satir = 3, sutun = 4;

        int[][] array = new int[satir][sutun];

        System.out.println("Array'in satir boyutu : " + array.length);
        System.out.println("Array'in sutun boyutu : " + array[0].length);

        int sayac = 0;

        for (int i = 0; i < array.length; i++){

            for (int k = 0; k<array[i].length; k++){

                array[i][k] =++sayac;

                System.out.print(array[i][k]+" ");
            }
            System.out.println();
        }


    }

}
