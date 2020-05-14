package main;

public class Metotlar {

    public static void sayiBul(){
        int [] numbers = {1,3,5,7,9};
        int searchNum = 6;
        boolean isNum = false;

        for (int number : numbers){
            if (number==searchNum){
                isNum=true;
                break;
            }
        }

        if (isNum)
            System.out.println("Sayı mevcut");
        else
            System.out.println("Sayı mevcut değil");
    }

    public static void main(String[] args) {
        sayiBul();
    }
}
