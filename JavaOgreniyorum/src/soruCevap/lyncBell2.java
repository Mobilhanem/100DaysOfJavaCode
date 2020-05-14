package soruCevap;

public class lyncBell2 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 99999; i++) {
            basamakDeger(i);
        }
    }

    public static void basamakDeger(int sayi) {
        int anaSayi = sayi;
        int birler, onlar, yuzler, binler, onbinler;
        birler = sayi - ((sayi / 10) * 10);
        sayi = sayi / 10;
        onlar = sayi - ((sayi / 10) * 10);
        sayi = sayi / 10;
        yuzler = sayi - ((sayi / 10) * 10);
        sayi = sayi / 10;
        binler = sayi - ((sayi / 10) * 10);
        sayi = sayi / 10;
        onbinler = sayi;

        try {
            if(onbinler!=0 && binler!=0 && yuzler!=0 && onlar!=0 && birler!=0){
                if ((sayi % onbinler) == 0 && (sayi % binler) == 0 && (sayi % yuzler) == 0 && (sayi % onlar) == 0 && (sayi % birler) == 0) {
                    System.out.println(" Lyn-Bell sayısı : " + anaSayi);
                }
            }

        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }
}
