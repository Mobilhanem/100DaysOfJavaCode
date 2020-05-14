package encapsulation;

public class Abone {
    //yanlis olanin ornegini yapmadım....
    //dogru calisma mantigi olan

    private String isim;
    private int bakiye = 120;
    private String sehir;

    public Abone(String isim, int bakiye, String sehir) {
        this.isim = isim;
        if (bakiye > 0 && bakiye <= 120) {
            this.bakiye = bakiye;
        }
        this.sehir = sehir;
    }

    public void bakiyeOgren() {
        System.out.println("Bakiye :" + bakiye);
    }
}
