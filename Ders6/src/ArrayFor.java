public class ArrayFor {

    public static void main(String[] args){

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++){
            array[i] = i+2;
        }

        for (int i=0;i<array.length;i++){
            System.out.println("Array'in " + i + ". indexinin değeri " + array[i]);
        }
    }
}
