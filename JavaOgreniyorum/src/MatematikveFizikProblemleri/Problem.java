package MatematikveFizikProblemleri;

public class Problem {

    //inner class

    public static class Matematik{

        public static void daireAlani (int yaricap){
            System.out.println("Dairenin alanı : " + yaricap*yaricap*Math.PI);
        }
        public static void ucgenCevresi(int kenar1, int kenar2, int kenar3){
            System.out.println("Üçgen çevresi : " + (kenar1+kenar2+kenar3));
        }


    }

    public static class Fizik{
        public static void icCarpim(Vec vec1, Vec vec2){
            int icCarpim = vec1.getI() * vec2.getI() + vec1.getJ()*vec2.getJ()+vec1.getK()*vec2.getK();
            System.out.println("Vektör iç çarpım sonucu : " + icCarpim);
        }

    }

}
