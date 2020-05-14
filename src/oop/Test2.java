package oop;

public class Test2 {
    public static void main(String[] args) {
        //Account account = new Account();
        Account account2 = new Account("12345",10000,"mobilhanem","mobilhanem@mobilhanem.com","12321321321");
        account2.paraYatir(500);
        System.out.println("Toplam bakiye :" + account2.getBakiye());
    }
}
