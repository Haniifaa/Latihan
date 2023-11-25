import java.util.Scanner;
public class KaryawanDemo{
    public static void main(String[] args){
        KaryawanTetap x=new KaryawanTetap("Grace",2,4000000);
        x.TotalGaji();
        x.cetak();

        KaryawanKontrak y=new KaryawanKontrak("Jeje",20,3);
        y.TotalUpah();
        y.cetak();
    }
}