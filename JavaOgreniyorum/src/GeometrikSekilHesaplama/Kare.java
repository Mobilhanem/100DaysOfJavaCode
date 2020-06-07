package GeometrikSekilHesaplama;

public class Kare extends Sekil {
    private int kenar;
    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim() + "alanı " + (kenar*kenar) + " dır.");
    }
}
