package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrayOrnek {

    public static  int [] arrayiDoldur(int sayi){
        Scanner scanner = new Scanner(System.in);
        int cikti[] = new int[sayi];
        for (int i=0;i<sayi;i++){
            System.out.println(i+ ". sayiyi giriniz : ");
            cikti[i] = scanner.nextInt();
        }
        return cikti;
    }
    public static void arrayiBasti(int [] array){
       for(int i=0;i<array.length;i++){
           System.out.println("Değerler :" + array[i]);
       }
    }

    public static void arraySort(int [] array){
        Arrays.sort(array);
        arrayiBasti(array);
    }

    public static void main(String[] args) {
        int [] a = arrayiDoldur(5);
        arrayiBasti(a);
        System.out.println("---------------------------");
        arraySort(a);
        System.out.println("----------------------------");

        int [] a1 = {1,2,3,4,5,6};
        int [] b1 = {1,2,3,4,5,6};
        if (a1 == b1)
            System.out.println("Eşittir");
        else
            System.out.println("Eşit Değildir");



        int [] a2 = {1,2,3,4,5,6};
        int [] b2 = {1,2,3,4,5,6};
        if (Arrays.equals(a2,b2))
            System.out.println("Eşittir");
        else
            System.out.println("Eşit Değildir");



    }
}
