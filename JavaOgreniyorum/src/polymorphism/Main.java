package polymorphism;

class Hayvan {
    String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return "Hayvan Konusuyor...";
    }
}

class Kedi extends Hayvan {
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor...";
    }
}

class Kopek extends Hayvan {
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor...";
    }
}

class At extends Hayvan {
    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kişniyor...";
    }
}

public class Main {

    public static void konustur(Object object){
        if(object instanceof Kopek){
            Kopek kopek = (Kopek) object;
            kopek.konus();
        }else if(object instanceof  Kedi){
            System.out.println(((Kedi) object).konus());
        }
    }

   /* public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
    */
    public static void main(String[] args) {
       // Hayvan hayvan = new Hayvan("Aslan");
      /*  Hayvan hayvan = new Kedi("Tekir"); //polymorphism
        System.out.println(hayvan.konus());

        System.out.println("--------");
        konustur(new Kopek("Karabaş"));


        //instance of

        if(hayvan instanceof Kedi){
            System.out.println("Bu nesne kedi sınıfındandır");
        }*/

        Kopek kopek = new Kopek("Bogi");
        Kedi kedi = new Kedi("Pamuk");
        konustur(kopek);
        konustur(kedi);

    }
}
