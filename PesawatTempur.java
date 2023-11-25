class PesawatTempur extends Pesawat{
    PesawatTempur(){
        System.out.println("object Pesawat tempur dibuat...");
    }
    void manuver(){
        super.mendarat();
        System.out.println("manuver...");
    }
    void terbang(){
        super.terbang();
        System.out.println("terbang ala tempur...");
    }
    void nama(String nama){
        super.nama(nama);
    }
}