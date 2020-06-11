package StaticAnahtarKelimesi;

public class Main {
    public static void main(String[] args) {
        Seyirci seyirci1 = new Seyirci("Mobilhanem");
        Seyirci seyirci2 = new Seyirci("Aybüke");

        seyirci1.oyunSeyret();
        System.out.println("seyirci sayisi : " + Seyirci.seyirci_sayisi);
        System.out.println("seyirci sayisi : " + seyirci1.seyirci_sayisi);


        //private olan seyirci sayısını yazdırma
        System.out.println("private seyirci sayısı : " + seyirci1.getSeyirciSayisi());



        //selamla(); static olmadan static olan methodda çağrılamaz

    }

    public void selamla(){
        System.out.println("selamlar");
    }
}
