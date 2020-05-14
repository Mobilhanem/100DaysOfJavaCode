package main;

import java.util.Scanner;

public class Day2OfJava {
    public static void main(String[] args) {

        int followers= 10000;
        System.out.println("Merhaba mobilhanem takipçileri " + followers);

        int sayi1 = 4;
        int sayi2 = 100;
        int sayi3= 250;
         // en büyük sayıyı bul

        if(sayi1>sayi2 && sayi1>sayi3){
            System.out.println("en büyük sayı :" + sayi1);
        }else if (sayi2>sayi1 && sayi2>sayi3){
            System.out.println("en büyük sayı :" +sayi2);
        }else if(sayi3>sayi1 && sayi3>sayi2){
            System.out.println("en büyük sayı :" + sayi3);
        }else{
            System.out.println("sayılar eşit");
        }
        System.out.println("Tanımlanan sayılar :" + sayi1 + " " + sayi2 + " " + sayi3);

        // diğer yöntem

        int buyukSayi = sayi1;
        if(buyukSayi<sayi2)
            buyukSayi=sayi2;
        if (buyukSayi<sayi3)
            buyukSayi=sayi3;
        System.out.println("Kısa yoldan büyük sayi :" +buyukSayi);

        char grade = 'A';
        switch (grade){
            case 'A':
                System.out.println("Mükemmel");
                break;
            case 'B':
                System.out.println("Güzel");
                break;
            case 'C':
                System.out.println("İdare Eder");
                break;
            case 'F' :
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Grade Sonuçları");
                break;
        }

        //döngüler
        for (int i =0; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("While");
        int i=1;
        while (i<10){
            System.out.println(i);
            i++;
        }

        do{
           i+=2;
           System.out.println("Do While Örnek" + i);
        }while (i<10);

        System.out.println("-----Değişkenler------");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz :");
        int age = scanner.nextInt();
        System.out.print("Girilen yaş :" + age);


        System.out.print("\nCinsiyet giriniz :");
        char cinsiyet = scanner.next().charAt(0);
        System.out.print("\nGirilen cinsiyet :" + cinsiyet);

        //Kullanıcıdan kilo ve boy'unu alarak beden kitle indeksi ölç
        // İndeks = kilo / boy * boy

        System.out.println("\n---Beden Kitle İndeksi---");
        System.out.println("Kilonuzu giriniz : ");
        double kilo = scanner.nextDouble();
        System.out.println("Boyunuzu giriniz :");
        double boy=scanner.nextDouble();

        double indeks = kilo / (boy*boy);
        System.out.println("Kitle İndeks Oranınız :" + indeks);

        //dik üçgen hipotenüs hesaplama

        int a,b ;
        System.out.println("a degeriniz giriniz :");
        a=scanner.nextInt();
        System.out.println("b degerini giriniz :");
        b = scanner.nextInt();
        double hesap =  Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs sonucu :" + hesap);

        //faktoriyel hesaplama
        System.out.println("Hesaplanacak deger :");
        int deger = scanner.nextInt();
        int faktoriyel=1;
        for (int g=1;g<=deger;g++){
            faktoriyel = faktoriyel*g;
        }
        System.out.println("Sonuc : " + faktoriyel);

    }
}
