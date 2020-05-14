package array;

import java.util.Scanner;

public class Main {
    public static void arrayi_bastir(int [] array){
        for(int i=0; i<array.length;i++){
            System.out.println("Değerler :" + array[i]);
        }
    }
    public static void main(String[] args) {
        int[] a = new int[10];
//        a[0] = 30;
//        System.out.println(a[0]);

        int [] b = new int[5]; //bellekte 5 adet yer belirlendi b referansı için
        System.out.println("Array uzunluğu : " + b.length);
        Scanner scanner = new Scanner(System.in);

       /* for (int i = 0; i < 10; i++) {
            System.out.println( i +". Değeri Giriniz :");
            a[i] = scanner.nextInt();
        }*/

        System.out.println("----Girilenn Değerler-----");

        /*for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }*/

        int [] c = {10,32,56,78,98};
        arrayi_bastir(c);

        double [] f = {2,6,4,10};
        System.out.println("Ortalama :" + ortalamaBul(f));

    }
    public static double ortalamaBul (double [] array){
        double toplam = 0;
        for (int i=0;i<array.length;i++){
            toplam +=array[i];
        }
        return toplam/array.length;
    }
}
