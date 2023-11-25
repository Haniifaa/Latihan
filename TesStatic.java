public class TesStatic {
    int a=10;
    static int b=20;
    protected int c=30;
    public int d=40;
    private int e=50;
    void satu(){
        dua();
        System.out.println("Satu...................."+a);
        System.out.println("Satu...................."+b);
        System.out.println("Satu...................."+c);
        System.out.println("Satu...................."+d);
        System.out.println("Satu...................."+e);
    }
    static void dua(){
        System.out.println("Dua...................."+b);
    }
    public static void main(String[] args) {
        dua();
    }
}
