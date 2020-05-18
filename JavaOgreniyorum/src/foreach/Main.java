package foreach;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Elma","Armut","Kiraz"};
        int[] array2  = {1,2,3,4,5,6,7};
        Isim[] array3 = {new Isim("Sevde"),new Isim("Aybüke"),new Isim("Kaleli")};

        for (Isim d : array3) {
            d.yaz();

        }
        for (int i: array2){
            System.out.println(i);
        }
        for (String a : array) {
            System.out.println(a);
        }
    }
}
