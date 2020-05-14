package main;

import java.util.Scanner;

public class Classes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz :");
        int x = scanner.nextInt();
        System.out.println("İkinci Sayiyi giriniz :");
        int y = scanner.nextInt();
        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.toplam(x,y);
        dortIslem.cikarma(x,y);
        dortIslem.bolme(x,y);
        dortIslem.carpma(x,y);
        System.out.println("Sonuç :" + sonuc);
    }
}
