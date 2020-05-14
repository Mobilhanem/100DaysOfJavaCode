package main;

public class StringOrnekler {
    public static void main(String[] args) {
        String str = "Bugün 23 Nisan Neşe Doluyor İnsan.";
        System.out.println("Cümleniz : " + str + " toplam" + str.length() + "karakter");
        System.out.println(str.concat("Yaşasın.."));

        System.out.println("==============================================");
        System.out.println("=                                            =");
        System.out.println("=                                            =");
        System.out.println("=            * * * * *                       =");
        System.out.println("=          *          *                      =");
        System.out.println("=        *             *                     =");
        System.out.println("=       *                    *               =");
        System.out.println("=      *                   *   *             =");
        System.out.println("=       *                    *               =");
        System.out.println("=        *             *                     =");
        System.out.println("=         *           *                      =");
        System.out.println("=           * * * * *                        =");
        System.out.println("=                                            =");
        System.out.println("=                                            =");
        System.out.println("==============================================");



        String a = new String("Merhaba Dünya");
        String b = new String("Merhaba Dünya");
        String c = "Merhaba Dünya";
        String d= "Merhaba Dünya";
        System.out.println(a==b);
        System.out.println(c==a);
        System.out.println(c.equals(a));
    }
}
