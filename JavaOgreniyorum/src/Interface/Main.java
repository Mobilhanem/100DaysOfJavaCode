package Interface;

public class Main {
    public static void main(String[] args) {

        PCMuhendisi muhendis = new PCMuhendisi(true,false);
        muhendis.askerlik_sorgulama();
        muhendis.adli_sicil_sorgulama();
        System.out.println(muhendis.mezuniyet_ortalamasi(3.4));
        String [] tecrube = {"a bilişim", "b bilişim"};
        muhendis.is_tecrubesi(tecrube);

    }
}
