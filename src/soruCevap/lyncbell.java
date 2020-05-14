package soruCevap;

import java.util.Scanner;

public class lyncbell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birler,onlar,yuzler,binler,onbinler;
        System.out.println("5 basamaklı bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        birler=sayi-((sayi/10)*10);
        sayi=sayi/10;
        onlar=sayi-((sayi/10)*10);
        sayi=sayi/10;
        yuzler=sayi-((sayi/10)*10);
        sayi=sayi/10;
        binler=sayi-((sayi/10)*10);
        sayi=sayi/10;
        onbinler = sayi;
        System.out.println( "OnBinler: " + onbinler +"\n"+ "Binler: "+binler+"\n"+"Yüzler: "+yuzler+"\n"+"Onlar: "+onlar+"\n"+"Birler: "+birler);
        if((sayi%onbinler)==0 && (sayi%binler)==0  && (sayi%yuzler)==0 && (sayi%onlar)==0 && (sayi%birler)==0 ){
            System.out.println("Sayı Lyn-Bell sayısıdır...");
        }


    }
}
