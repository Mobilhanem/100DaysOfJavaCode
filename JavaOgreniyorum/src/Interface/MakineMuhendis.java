package Interface;

public class MakineMuhendis implements IMuhendis, ICalisma {

    private boolean askerlik;
    private boolean adli_sicil;

    public MakineMuhendis(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_sorgulama() {
        if (askerlik)
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
        if(array.length ==0){
            System.out.println("iş tecrübem bulunmuyor");
        }else{
            System.out.println("Makina mühendisi olarak şu şirketşerde çalıştım");
            for (String is: array) {
                System.out.println(is);
            }
        }
    }

    public void referans_getir(String [] referans){
        if(referans.length==0){
            System.out.println("referans bulunmuyor");
        }else{
            System.out.println("Referanslarım....");
            for (String ref:referans) {
                System.out.println(ref);
            }
        }
    }

    @Override
    public void calis() {
        System.out.println("çalış metodu ICalisma interfacinde yer almaktadır.");
    }
}
