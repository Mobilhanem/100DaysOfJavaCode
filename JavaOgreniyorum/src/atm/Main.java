package atm;

public class Main {
    public static void main(String[] args) {
        Atm atm = new Atm();
        Hesap hesap = new Hesap("mobilhanem","123",15000);
        atm.calis(hesap);
        System.out.println("Programdan çıkış yapılıyor...");
    }
}
