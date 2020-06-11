package StaticAnahtarKelimesi;

public class Seyirci {

    private String isim;

    public static int seyirci_sayisi =0;
    private static int seyircisayisi = 0 ;

    public Seyirci(String isim) {
        this.isim = isim;
        seyirci_sayisi++;
        seyircisayisi++;

    }

    public int getSeyirciSayisi (){
        return seyircisayisi;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void oyunSeyret(){
        System.out.println(getIsim() + " oyun seyrediyor....");
    }
}
