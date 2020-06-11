package LokalInnerClasslar;

import StaticInnerClass.Matematik;

public class Main {
    public static void main(String[] args) {
        class Alan {
            public void daire_alan(int yaricap){ //lokal inner
                System.out.println("Dairenin alanı : " + (yaricap*yaricap*Math.PI));
            }
        }

        Alan alan = new Alan();
        alan.daire_alan(5);
        Alan alan2 = new Alan();
        alan2.daire_alan(3);

    }
    /*public static void deneme(){
        Alan alan = new Alan();
    }*/ //ulaşamıyoruz
}
