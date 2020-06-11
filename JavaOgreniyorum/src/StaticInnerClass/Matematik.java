package StaticInnerClass;

public class Matematik {


    private double PI = Math.PI;

    public static class Alan{ //static inner class
        public void daire_alan(int yaricap){  //static yaparsan da değişen bir şey olmaz
            System.out.println("Dairenin alanı : " + (yaricap*yaricap*Math.PI));

        }
    }

}
