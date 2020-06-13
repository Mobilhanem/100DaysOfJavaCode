package MatematikveFizikProblemleri;

import java.util.Scanner;

public class Main {
    /* basit matematik ve fizik problemler, daire alan - matematik, üçgen çevresi - matematik, 3 boyutlu vektörün iç çarpımı-fizik */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik ve Fizik Problemleri Programına Hoşgeldiniz...");

        String islemler = "İşlemler...\n"
                + "1. Daire Alanı Hesaplama\n"
                + "2. Üçgen Çevresi Hesaplama\n"
                + "3. 2 Vektörün İç Çarpımını Hesaplama\n"
                + "Çıkış :  q";

        while(true) {
            System.out.println(islemler);
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;

            }
            else if (islem.equals("1")){

                System.out.print("Dairenin Yarıçapı : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                Problem.Matematik.daireAlani(yaricap);

            }
            else if (islem.equals("2")){
                System.out.print("Kenar  1: ");
                int kenar1 = scanner.nextInt();
                System.out.println("Kenar 2 : ");
                int kenar2 = scanner.nextInt();
                System.out.println("Kenar 3 : ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                Problem.Matematik.ucgenCevresi(kenar1, kenar2, kenar3);

            }
            else if (islem.equals("3")){
                Vec vec1 = new Vec("Vektör1");
                Vec vec2 = new Vec("Vektör2");

                Problem.Fizik.icCarpim(vec1, vec2);

            }
            else {
                System.out.println("Geçersiz işlem...");

            }
        }
    }


}
