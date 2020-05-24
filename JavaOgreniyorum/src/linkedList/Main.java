package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Kotlin");
        arrayList.add("C#");

        for (String diller:arrayList) {
            System.out.println(diller);
        }
        System.out.println("-------------------");
        arrayList.add(1,"C++");
        for (String diller : arrayList){
            System.out.println(diller);
        }
        System.out.println("-------------------");

        LinkedList<String> diller = new LinkedList<>();
        diller.add("Java");
        diller.add("PHP");
        diller.add("Python");
        diller.add("Kotlin");
        diller.add("C#");

        for (String s : diller){
            System.out.println(s);
        }
        System.out.println("-------------------");
        diller.add(1,"C++");
        for (String s :diller){
            System.out.println(s);
        }

        //maliyet olarak linkedlist daha avantajlıdır...
        //fakat linkedlistin dezavantajıda vardır buda objede kendisini ve farklı bir objenin
        // referans noktasını da tutmasıdır.


    }
}
