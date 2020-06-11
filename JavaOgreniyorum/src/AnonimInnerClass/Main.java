package AnonimInnerClass;

public class Main {
    public static void main(String[] args) {
        //herhangi bir class oluşturmadan direkt obje üretebiliyoruz buna anonim inner class denir

        IOgrenci ogrenci = new IOgrenci() {
            @Override
            public void ders_calis() {
                System.out.println("ders çalışıyorum...");
            }

            @Override
            public void derse_gir() {
                System.out.println("derse giriyorum...");
            }
        };

        ogrenci.ders_calis();
        ogrenci.derse_gir();

        System.out.println("******************");
        AOgrenci aOgrenci = new AOgrenci(){
            @Override
            void kayit_yaptir() {
                System.out.println("kayit yaptırıyorum....");
            }
        };
        aOgrenci.selamla();
        aOgrenci.kayit_yaptir();


    }
    public interface IOgrenci{
        void ders_calis();
        void derse_gir();

    }
    public abstract static class AOgrenci{
        abstract void kayit_yaptir();
        public void selamla(){
            System.out.println("selamlar....");
        }
    }
}
