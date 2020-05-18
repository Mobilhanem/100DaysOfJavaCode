package soruCevap;

import java.util.Scanner;

public class Mod {
    public static void main(String[] args) {
        int m,k;
        Scanner scanner = new Scanner(System.in);
        System.out.println("M değerini giriniz :");
        m = scanner.nextInt();
        System.out.println("K değerini giriniz :");
        k = scanner.nextInt();
        int kalan =0;
        int bolum=1;
        for (int i = m; i >= k; i-=k)
        {
            kalan = i - k;
            if (kalan>=k)
                bolum += 1;

        }
        System.out.println("Bölünen: " + m + " Bölen :" + k + " Bölüm :" + bolum + " Kalan :" + kalan);


    }
}
