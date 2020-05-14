package soruCevap;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        int sayac;
        int[] dizi = new int[500];
        for (int i = 0; i < 500; i++) {
            dizi[i] = r.nextInt(1000);
            System.out.println("Dizi elemanları :" + dizi[i]);
        }
        for (int x = 1; x < dizi.length; x++) {
            sayac = 0;
            for (int j = 1; j <= dizi[x]; j++) {
                if ((dizi[x] % j) == 0) {
                    sayac++;
                }
            }
            if (sayac == 2) {
                System.out.println("Asal Sayıdır :" + dizi[x]);
            }
        }


    }

}
