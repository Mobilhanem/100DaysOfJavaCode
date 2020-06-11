package StaticOlmayanInnerClass;

public class Main {
    public static void main(String[] args) {

        /*1. Statik olmayan inner classlar
        * 2. Statik inner classlar
        * 3. Lokal(Yeni) inner classlar
        * 4. Anonim inner classlar*/

        Matematik.faktoriyel faktoriyel = new Matematik().new faktoriyel();
        faktoriyel.faktoriyel();

        Matematik.Asal asal = new Matematik().new Asal();
        if(asal.asal_mi(83)){
            System.out.println("asaldır");
        }else
            System.out.println("asal değildir");
        Matematik.Alan alan = new Matematik().new Alan();
        alan.daire_alan(20);

    }
}
