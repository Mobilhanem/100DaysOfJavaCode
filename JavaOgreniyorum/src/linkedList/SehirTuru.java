package linkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class SehirTuru {


    public static void sehirleriTurla(LinkedList<String> sehirler){
        ListIterator<String> iterator = sehirler.listIterator();
        int islem;

        islemleriBastir();
        Scanner scanner = new Scanner(System.in);
        if (!iterator.hasNext()){
            System.out.println("Her hangi bir işlem seçilmedi");
        }
        boolean cikis = false;
        boolean ileri = true;

        while (!cikis){
            System.out.print("Bir işlem seçiniz : ");
            islem = scanner.nextInt();
            switch (islem){
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    if (!ileri) {
                        if (iterator.hasNext()) {

                            iterator.next();

                        }
                        ileri = true;

                    }

                    if (iterator.hasNext()){
                        System.out.println("Bir sonraki şehre gidiliyor : " + iterator.next());
                    }else
                        System.out.println("Gidilecek şehir kalmadı....");
                    break;
                case 2:
                    if (ileri){
                        if (iterator.hasPrevious()) {
                            iterator.previous();

                        }
                        ileri = false;

                    }
                    if (iterator.hasPrevious()){
                        System.out.println("Bir önceki şehre dönülüyor :" + iterator.previous());
                    }else
                        System.out.println("Dönülecek şehir kalmadı....");
                    break;
                case 3:
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor...");
                    break;
            }

        }

    }

    public static void islemleriBastir(){

        System.out.println("0- İşlemleri Görüntüle");
        System.out.println("1- Bir sonraki şehre git");
        System.out.println("2- Bir önceki şehre dön");
        System.out.println("3- Uygulamadan çık");

    }

    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<>();
        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("İstanbul");

        sehirleriTurla(sehirler);
    }
}
