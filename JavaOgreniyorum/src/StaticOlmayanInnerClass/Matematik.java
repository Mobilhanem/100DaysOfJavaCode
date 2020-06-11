package StaticOlmayanInnerClass;

import java.util.Scanner;

public class Matematik {

    private double PI = Math.PI;

    public class faktoriyel{ //inner class matematik sınıfının içerisinde

        public void faktoriyel(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bir sayı giriniz : ");
            int sayi  =scanner.nextInt();
            int fak = 1;
            for (int i=2;i<=sayi;i++){
                fak *=i;
            }
            System.out.println("faktoriyel : " + fak);

        }

    }
    public class Asal{
        public boolean asal_mi(int sayi){
            int i=2;
            while (i< sayi){
                if (sayi%i ==0)
                    return false;
                i++;
            }
            return false;
        }
    }

    public  class Alan{
        public void daire_alan(int yaricap){
            System.out.println("Dairenin alanı : " + yaricap*yaricap*PI); //private olmasına rağmen inner class olduğu için kullanabiliyoruz
        }
    }
}
