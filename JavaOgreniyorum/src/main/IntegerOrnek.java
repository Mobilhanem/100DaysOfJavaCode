package main;

public class IntegerOrnek {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b=5;
        System.out.println(a==b);

        a= new Integer(5);
        b=new Integer(5);
        System.out.println(a==b);

        a=1000;
        b=1000;
        System.out.println(a==b);

        a=new Integer(1000);
        b=new Integer(1000);
        System.out.println(a==b);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);


    }
}
