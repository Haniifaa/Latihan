public class TestPesawat {
    public static void main(String[] args) {
        Pesawat a=new Pesawat();
        PesawatTempur b=new PesawatTempur();
        a.nama("airbus");
        a.terbang();
        a.mendarat();
        b.nama("f16");
        b.terbang();
        b.manuver();
    }
}