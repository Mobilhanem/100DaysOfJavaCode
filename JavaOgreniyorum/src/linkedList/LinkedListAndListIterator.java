package linkedList;

import javax.swing.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListAndListIterator {

    public static void yerleriListele(LinkedList<String> yerler){
        for (String s : yerler){
            System.out.println(s);
        }
        System.out.println("--------------");
        ListIterator<String> listIterator = yerler.listIterator();

    }

    public static void siraliEkle (LinkedList<String> yerler, String yeni){
        ListIterator<String> iterator = yerler.listIterator();
        while (iterator.hasNext()){

            int karsilastir = iterator.next().compareTo(yeni);
            if (karsilastir == 0){
                System.out.println("Listenizde bu yer var");

                return;
            }else if(karsilastir<0){

            }
            else{
                iterator.previous();
                iterator.add(yeni);

                return;
            }


        }
        iterator.add(yeni);

    }

    public static void main(String[] args) {
        LinkedList<String> yerler = new LinkedList<>();
        siraliEkle(yerler, "Ankara");
        siraliEkle(yerler,"İzmir");
        siraliEkle(yerler,"İstanbul");
        siraliEkle(yerler,"Elazığ");

        yerleriListele(yerler);

        /*yerler.add("Ankara");
        yerler.add("İzmir");
        yerler.add("İstanbul");
        yerler.add("Elazığ");
        yerleriListele(yerler);
        yerler.remove(1);
        yerleriListele(yerler);*/



    }
}
