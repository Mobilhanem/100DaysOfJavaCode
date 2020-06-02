package Interface;

public class Main {
    public static void main(String[] args) {

        PCMuhendisi muhendis = new PCMuhendisi(true,false);
       /* muhendis.askerlik_sorgulama();
        muhendis.adli_sicil_sorgulama();
        System.out.println(muhendis.mezuniyet_ortalamasi(3.4));
        String [] tecrube = {"a bilişim", "b bilişim"};
        muhendis.is_tecrubesi(tecrube);*/

        MakineMuhendis makineMuhendis =  new MakineMuhendis(true,false);
        String [] tecrube = {};
        String [] referans = {"aybuke kaleli"};
        makineMuhendis.askerlik_sorgulama();
        makineMuhendis.adli_sicil_sorgulama();
        makineMuhendis.is_tecrubesi(tecrube);
        makineMuhendis.referans_getir(referans);
        System.out.println(makineMuhendis.mezuniyet_ortalamasi(2.35));

        //Tür Dönüşümü örnek

        IMuhendis makine = new MakineMuhendis(true,false);
       ((MakineMuhendis)makine).referans_getir(referans);

       ((MakineMuhendis) makine).calis();


    }
}
