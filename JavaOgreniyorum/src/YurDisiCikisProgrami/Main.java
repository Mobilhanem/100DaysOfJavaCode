package YurDisiCikisProgrami;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz....");
        String sartlar = "Yurtdışı Çıkış Kuralları..\n"
                + "Herhangi bir ülkeye çıkış yasağınız bulunmamalıdır..\n"
                +"15 TL harç bedelini tam olarak yatırılması gerekmektedir...\n"
                + "Gideceğiniz ülkeye vize almanız gerekmektedir....";
        String mesaj = "Şartlardan hepsini sağlamanız gerekiyor...";
        while(true) {
            System.out.println("*******************************************");
            System.out.println(sartlar);
            System.out.println("*******************************************");


            Yolcu yolcu = new Yolcu();

            System.out.println("Harç Bedeli Kontrol Ediliyor...");

            Thread.sleep(3000);
            if (yolcu.yurtdisiHarciKontrol() == false) {

                System.out.println(mesaj);
                continue;
            }

            System.out.println("Yurtdışı Çıkış Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);

            if (yolcu.cikisYasagiKontrol() == false) {
                System.out.println(mesaj);
                continue;
            }
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);

            if (yolcu.vizeDurumuKontrol() == false){
                System.out.println(mesaj);
                continue;
            }
            System.out.println("İşlemleriniz Tamam ! Yurtdışına çıkabilirsiniz...");
            break;


        }

    }
}
