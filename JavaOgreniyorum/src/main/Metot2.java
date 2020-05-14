package main;

import java.util.Scanner;

public class Metot2 {

    public static int topla(int a, int b){
        int sonuc = a+b;
        System.out.println("Toplam :" + a +"+" + b + " =" + sonuc);
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci sayi :");
        int a = scanner.nextInt();
        System.out.println("İkinci sayi :");
        int b = scanner.nextInt();
        topla(a,b);

        Metot2 metot = new Metot2();
        int sonuc = metot.cikarma(3,2);
        System.out.println("Çıkarma Sonucu :"+ sonuc);


    }

    int cikarma(int a, int b){
        return a-b;
    }

}
