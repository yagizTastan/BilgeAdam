public class stringler {

    public static void main(String[] args) {

        String jv = "Merhaba Java";

        String a = new String("Merhaba Java");

        /*String a ="Merhaba Java";*/

        System.out.println(jv);
        System.out.println(a);

        System.out.println("jv değişkeninin boyutu : " + jv.length());
        System.out.println("a değişkeninin boyutu : " + a.length());


        if (jv == a){

            System.out.println("eşit");
        }else
            System.out.println("iki farklı adresi refere ettiği için eşit değil");

        if (jv.equals(a)){
            System.out.println("Değerine baktığı için Equals ile eşit");
        }

    }

}
