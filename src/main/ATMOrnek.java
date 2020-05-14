package main;

import java.util.Scanner;

public class ATMOrnek {
    public static void main(String[] args) {
        int toplamBakiye = 10000;
        String islemler = " 1 : Bakiye Öğrenme \n 2 : Para Çekme \n 3: Para Yatırma \n 4: Çıkış için q ya basınız. ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("------");
        System.out.println("Yapılabilir işlemler");
        System.out.println(islemler);
        System.out.println("------");
        System.out.print("Yapılacak İşlem Türünü Seçiniz :");
        String secilen = scanner.nextLine();
        switch (secilen){
            case "1":
                System.out.println("Toplam bakiyeniz : " + toplamBakiye);
                break;
            case "2":
                System.out.println("Çekilecek Tutarı Giriniz :");
                int cekilecekTutar = scanner.nextInt();
                if (cekilecekTutar>toplamBakiye){
                    System.out.println("Bakiye Yetersiz");
                }else{
                toplamBakiye = toplamBakiye - cekilecekTutar;
                }
                System.out.println("Cekilen Tutar :" + cekilecekTutar + " Kalan Bakiye :" + toplamBakiye);
                break;
            case "3":
                System.out.println("Yatırılacak Tutarı Giriniz :");
                int yatirilan = scanner.nextInt();
                toplamBakiye +=yatirilan;
                System.out.println("Toplam Bakiyeniz :" +toplamBakiye);
                break;
            case "4":
                System.out.println("Çıkış Başarılı");
                break;
            default:
                System.out.println("Yanlış Seçim Türü");
                break;
        }
    }
}
