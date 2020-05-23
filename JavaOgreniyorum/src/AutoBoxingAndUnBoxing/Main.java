package AutoBoxingAndUnBoxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Wrapper Class

        boolean ------> Boolean
        char ---------> Character
        byte ---------> Byte
        short --------> Short
        int ----------> Integer
        long ---------> Long
        float --------> Float
        double -------> Double


        */
        ArrayList<String> arraylist = new ArrayList<String>();

        //ArrayList<double> arraylist2 = new ArrayList<double>();

        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();


       /* for (int i = 0; i < 10;i++) {

            arraylist2.add(Integer.valueOf(i*4)); // Autoboxing

        }
        for (int i = 0; i< arraylist2.size() ; i++) {
            System.out.println(arraylist2.get(i).intValue()); // Unboxing

        }*/

        for (int i = 0; i < 10;i++) {

            arraylist2.add(i*4); // Integer.valueOf(i*4)


        }
        for (int i = 0; i< arraylist2.size() ; i++) {
            System.out.println(arraylist2.get(i)); // Unboxing arraylist2.get(i).intValue()


        }
    }
}
