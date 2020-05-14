package main;

public class DiziOrnekler {
    public static void main(String[] args) {
        String [] ogrenciler = new String[3];
        ogrenciler[0] = "Aybüke";
        ogrenciler[1] ="Tuğba";
        ogrenciler[2] = "Ayşe";
        for (int i=0; i<ogrenciler.length; i++){
            System.out.println("Öğrenciler :" + ogrenciler[i]);
        }
        System.out.println("----- For Dizi Diğer Yazım Şekli -----");
        for(String ogrenci : ogrenciler){
            System.out.println("Diğer :" + ogrenci);
        }

        double [] numbers = new double[4];
        numbers[0] = 2.1;
        numbers[1] = 1.1;
        numbers[2] = 5.6;
        numbers[3] = 0.7;
        double maxNum = numbers[0];
        for(double  num : numbers){
            if (maxNum<num){
                maxNum = num;
            }
            System.out.println("Numbers of :" + num);
        }
        System.out.println("------------");
        System.out.println("Max Number :" + maxNum);


    }
}
