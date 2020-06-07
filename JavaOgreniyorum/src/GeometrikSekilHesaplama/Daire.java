package GeometrikSekilHesaplama;

public class Daire extends Sekil {
    private int yarıcap;
    public Daire(String isim, int yaricap) {
        super(isim);
        this.yarıcap  =yaricap;
    }

    @Override
    void alanHesapla() {
        System.out.println(getIsim() + "alanı " + Math.PI *(yarıcap * yarıcap)+ " dır.");
    }
}
