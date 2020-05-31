package soruCevap;

import java.util.Scanner;

public class MukemmelSayiMain {
    public static void main(String[] args) {
        MukemmelSayi mukemmelSayi = new MukemmelSayi();

        Scanner girilendeger = new Scanner(System.in);
        System.out.println("Araligin Ust Limitini Giriniz:");
        int sayi = girilendeger.nextInt();

        System.out.println("1 ile " + sayi + " arasindaki Mukemmel Sayilar:");
        if (sayi <= 6)
            System.out.println("Mukemmel sayi yoktur.");
        else
            for (int n = 2; n < sayi; n++)
                if (mukemmelSayi.deger(n)) {
                    System.out.println(n +  " mukemmel sayidir.");
                }

    }
}
