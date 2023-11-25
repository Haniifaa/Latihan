import java.util.Scanner;
public class NilaiDemo{
public static void main(String args[]) {
	// Nilai nilaiku=new Nilai("A11.2021.13820","Haniifa Aliila Faudyta",100,90,87);
	// nilaiku.hitungNilai();
	// nilaiku.cetakNilai();
	
	Nilai nilaimu=new Nilai();
	nilaimu.isiData();
	nilaimu.hitungNilai();
	nilaimu.cetakNilai();
	
/*
	    nilaimu.judul();
        nilaimu.daftarNilai();

        Scanner input=new Scanner (System.in);
        System.out.print("Jumlah Mahasiswa : ");
        int n=input.nextInt();
        Nilai[] nilaibyk=new Nilai[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Mahasiswa ke : "+(i+1));
            nilaibyk[i]=new Nilai();
            nilaibyk[i].isiData();
            nilaibyk[i].hitungNilai();
            nilaibyk[i].cetakNilai();
        }
        nilaibyk[0].judul();
        for(int i=0;i<n;i++)
        {
            nilaibyk[i].daftarNilai();
        }*/
}
}