import java.util.Scanner;
public class Nilai{
	String nim,nama,predikat,nHuruf;
	float tgs, uts,uas, ptgs,puts, puas, na;
	Scanner sc = new Scanner(System.in);
	public Nilai(String nim, String nama, float tgs, float uts, float uas)
	{
		this.nim=nim;
		this.nama=nama;
		this.tgs=tgs;
		this.uas=uas;
		this.uts=uts;
	}
	public Nilai(){}

	String getNilHuruf(float nilai)
	{
		if(nilai>=85)
		nHuruf="A";
		else if(nilai>=85)
		nHuruf="AB";
		else if(nilai>=70)
		nHuruf="B";
		else if(nilai>=65)
		nHuruf="BC";
		else if(nilai>=60)
		nHuruf="C";
		else if(nilai>=40)
		nHuruf="D";
		else
		nHuruf="E";
		return nHuruf;
	}

	String getPredikat (String huruf)
	{
		switch(huruf)
		{
			case "A":predikat="Apik";
			break;
			case "AB":predikat="Apik Baik";
			break;
			case "B":predikat="Baik";
			break;
			case "BC":predikat="Baik Cukup";
			break;
			case "C":predikat="Cukup";
			break;
			case "D":predikat="Dablek";
			break;
			case "E":predikat="Elek";
		}
		return predikat;

	}

	void isiData()
	{
		System.out.println("Nim   : ");nim=sc.next();
		System.out.println("Nama  : ");nama=sc.next();
		System.out.println("Tugas : ");tgs=sc.nextFloat();
		System.out.println("UTS   : ");uts=sc.nextFloat();
		System.out.println("UAS   : ");uas=sc.nextFloat();
	}
	
	void hitungNilai(){
		ptgs=0.2f*tgs;
		puts=0.35f*uts;
		puas=0.45f*uas;
		na=ptgs+puts+puas;
	}
	void cetakNilai()
	{
		System.out.println("Nim         : "+nim);
		System.out.println("Nama        : "+nama);
		System.out.println("Nilai Tugas : "+tgs+" 20% : "+ptgs);
		System.out.println("Nilai UTS   : "+uts+" 35% : "+puts);
		System.out.println("Nilai UAS   : "+uas+" 45% : "+puas);
		System.out.println("Nilai Akhir : "+na);
		System.out.println("Nilai Huruf : "+getNilHuruf(na));
		System.out.println("Predikat : "+getPredikat(nHuruf));
	}
/*
	void judul() {
        System.out.println("Daftar Nilai PBO");
        System.out.println("-----------------");
        System.out.println("Nim\tNama\tN.Tgs\tN.Uts\tN.Uas\tN.Akhir"+"\tN.Huruf\tN.Predikat");
        
    }
    void daftarNilai()
    {
        System.out.println(nim + "\t" + nama + "\t" + ptgs +"\t" + puts + "\t" + puas + "\t" + na + "\t" + nHuruf + "\t" + predikat);
    }*/
}