package soruCevap;

import java.util.Scanner;

public class matematiksel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N değerini giriniz :");
        int n = scanner.nextInt();
        System.out.println("K değerini giriniz :");
        int k = scanner.nextInt();
        int sonuc=0;

        for(int i=k;i<=n;i++){
                sonuc = (int) (k*(Math.pow(2,k)));
        }
        System.out.println("Sonuc :" + sonuc);

    }
}
