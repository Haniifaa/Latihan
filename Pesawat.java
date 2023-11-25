public class Pesawat {
    int sayap=2,ekor=1;
    Pesawat(){
        System.out.println("object Pesawat dibuat...");
    }
    void terbang(){
        System.out.println("terbang...");
    }
    void mendarat(){
        System.out.println("mendarat...");
    }
    void nama(String nama){
        System.out.println("..."+nama+"...");
    }
}