package AbstractClass;

public class Main {
    public static void main(String[] args) {
        Sekil sekil = new Daire("daire" , 2);
        sekil.alanHesapla();
        //sekil.cevreHesapla();  sekil sınıfımızda cevre hesapla metodu yoktur. upcasting - downcasting olayı


        Kare kare1 = new Kare("kare" , 5);
        Daire daire1 = new Daire("Daire", 3);

        kare1.alanHesapla();
        daire1.alanHesapla();

        kare1.cevreHesapla();
    }
}
