package ikiboyutluarray;

public class ornekikiboyut {

    public static void main(String[] args) {

        int[][] array = {{3,4,1},{2,5,10},{2,4,15}};

        int sagCapraz = array[0][2]+array[1][1]+array[2][0];
        int solCapraz = array[0][0]+array[1][1]+array[2][2];

        int sonuc = Math.abs(solCapraz-sagCapraz);
        System.out.println("Sonuç : " + sonuc);
    }
}
