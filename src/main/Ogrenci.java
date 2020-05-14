package main;

public class Ogrenci {

    String ad;
    String soyad;
    OgrenciBilgisi ogrenciBilgisi = new OgrenciBilgisi();

    public class  OgrenciBilgisi{
        int okulNo;
        String bolum;
    }

    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.ad= "Aybüke";
        ogrenci.soyad = "Kaleli";
        ogrenci.ogrenciBilgisi.okulNo = 490;
        ogrenci.ogrenciBilgisi.bolum = "Bilişim";

    }

}
