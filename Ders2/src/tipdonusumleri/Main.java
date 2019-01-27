package tipdonusumleri;

public class Main {
    /**
     * @param args
     * @throws NullPointerException
     */
    public static void main(String[] args) {
        byte bytea = 127;
        int intb;
        intb = bytea;

        intb = 125;
        bytea = (byte) intb;

        System.out.println(bytea);

        String x = "123";

        intb = Integer.parseInt(x);
        System.out.println("String parse = " + x);

        Integer xInt = 12;
        String xString;
        xString = xInt.toString();
        System.out.println(xString);

    }
}
