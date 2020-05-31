package soruCevap;

public class MukemmelSayi {

    public boolean deger(int n) {
        int toplam = 1;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i * i != n)
                    toplam = toplam + i + n / i;
                else
                    toplam = toplam + i;
            }
        }
        // n bir mükemmel sayidir
        if (toplam == n && n != 1)
           return true;
        else
          return false;


    }

}
