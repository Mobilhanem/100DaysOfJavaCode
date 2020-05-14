package main;

import java.util.Scanner;

public class Metot3 {
    public static  int topla(int... sayilar){
        int toplam = 0;
        for (int sayi : sayilar)
            toplam +=sayi;

        System.out.println("toplam:" + toplam);
        return toplam;
    }
    public static void main(String[] args) {
        topla(2,4,5,6,7,8,9,10);
        faktoriyel();
        System.out.println("Çıktı :" + toplama(3,2,1));
    }

    public static void faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz :");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;
        while (sayi>0){
            faktoriyel *=sayi;
            sayi--;
        }
        System.out.println("Sonuç : " + faktoriyel);

    }

    public static int toplama (int a, int b, int c){
        int sonuc = a+b+c;
        return sonuc;
    }

}
