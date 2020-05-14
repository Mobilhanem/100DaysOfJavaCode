package idmanProgrami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Idman Oluşturma Programı
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idman Programına Hoşgeldiniz...");

        String idmanlar = "Geçerli Hareketler...\n"
                + "Burpee\n"
                +"Pushup(Şınav)\n"
                +"Situp(Mekik)\n"
                +"Squat";
        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturun...");

        System.out.print("Burpee Sayısı : ") ;
        int burpee = scanner.nextInt();
        System.out.print("Pushup Sayısı : ") ;
        int pushup = scanner.nextInt();
        System.out.print("Situp Sayısı : ") ;
        int situp = scanner.nextInt();
        System.out.print("Squat Sayısı : ") ;
        int squat = scanner.nextInt();

        scanner.nextLine();


        Idman idman = new Idman(burpee, pushup, situp, squat);

        System.out.println("İdmanınız Başlıyor.....");


        while (idman.idmanBittiMi() == false){

            System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız ? : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);



        }
        System.out.println("Idmanını başarıyla bitirdin....");


    }
}
