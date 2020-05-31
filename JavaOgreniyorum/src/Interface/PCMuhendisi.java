package Interface;

public class PCMuhendisi implements IMuhendis {

    private boolean askerlik ;
    private boolean adli_sicil;

    public PCMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_sorgulama() {

        if(askerlik)
            System.out.println("askerliğimi yaptım");
        else
            System.out.println("askerliğimi henüz yapmadım");

    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalamam : " + derece;
    }

    @Override
    public void adli_sicil_sorgulama() {
        if (adli_sicil)
            System.out.println("adli sicil kaydım bulunuyor");
        else
            System.out.println("adli sicil kaydım bulunmuyor");
    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("Bilgisayar mühendisi olarak şu şirketlerde çalıştım...");
        for (String is : array){
            System.out.println(is);
        }
    }
}
