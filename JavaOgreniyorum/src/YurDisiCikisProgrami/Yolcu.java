package YurDisiCikisProgrami;

import java.util.Scanner;

public class Yolcu implements YurtDisiKurallari{
    private  int harc;
    private boolean cikisYasagi;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatırdığınız harc bedeli");
        harc = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Herhangi bir ülkeye yasağınız bulunuyor mu ? (evet - hayır)");
        String cevap = scanner.nextLine();
        if(cevap.equals("evet")){
            this.cikisYasagi = true;
        }else{
            this.cikisYasagi=false;
        }
        System.out.println("Vizeniz bulunuyor mu ? (evet - hayır)");
        String cevap2 = scanner.nextLine();
        if(cevap2.equals("evet"))
            this.vizeDurumu = true;
        else
            this.vizeDurumu = false;
    }

    @Override
    public boolean yurtdisiHarciKontrol() {
        if(this.harc<15){
            System.out.println("Lütfen 15 den fazla yükleyin");
            return false;
        }else{
            System.out.println("Harç kontrolü tamam");
            return true;
        }
    }

    @Override
    public boolean cikisYasagiKontrol() {
        if(this.cikisYasagi == true){
            System.out.println("yasağınız bulunuyor yurtdışına çıkamazsınız");
            return false;
        }
        else{
            System.out.println("yasağınız bulunmuyor...");
            return true;
        }



    }

    @Override
    public boolean vizeDurumuKontrol() {
        if(this.vizeDurumu == true){
            System.out.println("Vize işlemleri tamam");
            return true;
        }else{
            System.out.println("vize işleminiz tamamlanmamıştır");
            return false;
        }
    }
}
