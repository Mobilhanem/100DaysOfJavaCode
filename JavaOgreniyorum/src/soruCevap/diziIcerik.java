package soruCevap;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class diziIcerik {
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }
    public static void diziOlustur(int uzunluk){
        Random rnd = new Random();
        String [] dizi1 = new String[uzunluk];
        String [] dizi2 = new String[uzunluk];
        for (int i=0;i<dizi1.length;i++){
            dizi1[i]= randomAlphaNumeric(uzunluk);
            System.out.println("Dizi1 Elemanları : " + dizi1[i]);
        }
        for (int i=0;i<dizi2.length;i++){
            dizi1[i]= randomAlphaNumeric(uzunluk);
            System.out.println("Dizi2 Elemanları : " + dizi1[i]);
        }
        double benzerlik = 0;
        int counter =0;
        if(Arrays.equals(dizi1,dizi2)){
            System.out.println("%100 benzer...");
        }else{
            for (int i =0 ; i<dizi1.length;i++){
                if(dizi1[i].equals(dizi2[i])){
                    counter++;
                }
            }
            benzerlik = (counter/dizi1.length)/100;
            System.out.println("Benzerlik Oranı :" + benzerlik);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizi uzunluğunu giriniz :");
        int k = scanner.nextInt();
        diziOlustur(k);
    }
}
