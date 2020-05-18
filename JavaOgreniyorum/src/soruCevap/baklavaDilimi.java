package soruCevap;

import java.util.Scanner;

public class baklavaDilimi {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("yükseklik kaç satır olsun?");
        int yukseklik=klavye.nextInt(); //yükseklik hep tek sayi olacaktir
        int yariyukseklik=(int)(yukseklik/2)+1;

        for(int i=1;i<=yariyukseklik;i++)
        {
            for(int j=1;j<=yariyukseklik-i;j++)
                System.out.print(" ");

            for(int j=1;j<=2*i-1;j++)
                System.out.print("/");

            System.out.println();
        }
        //üst yarısı tamam
        for(int i=yariyukseklik-1;i>=1;i--)
        {
            for(int j=1;j<=yariyukseklik-i;j++)
                System.out.print(" ");

            for(int j=1;j<=2*i-1;j++)
                System.out.print("\\");

            System.out.println();
        }
    }
}
