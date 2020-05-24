package StringSinifi;

public class Main {
    public static void main(String[] args) {
        String a = "Mobilhanem";
        String b = new String("Mobilhanem");

        System.out.println(b);
        System.out.println("Harf Sayisi :" + b.length());
        System.out.println("0. indeksi : " + b.charAt(0));
        System.out.println("Son Elemamn : " + b.charAt(b.length()-1));

        for (int i=0; i<b.length();i++){
            System.out.println(b.charAt(i));
        }

        System.out.println(b.startsWith("Mo"));
        System.out.println(b.endsWith("ke"));
        System.out.println(b.indexOf('h'));
        System.out.println(b.lastIndexOf('m'));

        System.out.println(b.toUpperCase());
        System.out.println(b.toLowerCase());

        String a1 = "1996";
        int b1 = Integer.parseInt(a1);
        System.out.println(b1);

        if(a==b){
            System.out.println("Eşittir....");
        }else{
            System.out.println("Eşit Değildir....");
        }

        if(a.equals(b)){
            System.out.println("İçerikler Eşittir");
        }else{
            System.out.println("İçerik Eşit Değildir");
        }

        String s  = new String("mobilhanem");
        String f = new String("mobilhanem");
        if (s == f)
            System.out.println("Eşittir");
        else
            System.out.println("Eşit Değildir");



    }
}
