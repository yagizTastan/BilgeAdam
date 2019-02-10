public class ArrayWhile {

    public static void main(String[] args){

        int[] array = new int[100];

        int i = 0;

        while  (i<array.length){
            array[i] = i + 2;

            i++;
        }

        i = 0;
        while (i<array.length){
            System.out.println("Array'in " + i + ". indexsinin değeri " + array[i]);
            i++;
        }
    }
}
