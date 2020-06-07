package AbstractClass;

public abstract class Sekil {

    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }
    public void isminiSoyle(){
        System.out.println("Bu obje " + isim + " objesidir.");
    }
    abstract void alanHesapla(); // alt sınıflar mutlaka bunu yazmak zorunda kalacaklar kare ve daire de farklı olarak hesaplanmalıdır bu nedenle metot içerisi boş bırakılmıştır


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
