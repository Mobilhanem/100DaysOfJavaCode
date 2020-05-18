package ArrayList;

import java.util.ArrayList;

public class MainArray {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Yazılım Günlüğü");
        arrayList.add("Mobilhanem");

        System.out.println(arrayList.get(0) + " " + arrayList.get(1));
        System.out.println("Boyut :" + arrayList.size());

        arrayList.remove(arrayList.get(1));

        System.out.println("************************");
        for (String a: arrayList) {
            System.out.println(a);
        }
        arrayList.add("Java Programlama");
        System.out.println(arrayList.indexOf("Java Programlama"));
        arrayList.set(1, "aybukeka");
        System.out.println("Güncellenen :" + arrayList.get(1));


    }
}
