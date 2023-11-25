import java.util.Scanner;
class KaryawanKontrak extends Karyawan{
    int totalupah, harimasuk, jmlanak;
    int upahharian=100000;
    KaryawanKontrak(String nama, int harimasuk, int jmlanak){
        super(nama);
        this.harimasuk=harimasuk;
        this.jmlanak=jmlanak;
        
    }
    
    void isiData(){
        
		System.out.println("Nama: ");nama=sc.next();
		System.out.println("Hari Masuk: ");harimasuk=sc.nextInt();
        System.out.println("Jumlah Anak: ");jmlanak=sc.nextInt();
    }
    void TotalUpah(){
        totalupah=(upahharian*harimasuk)+(jmlanak*tunjangan);
    }

    void cetak(){
        System.out.println("Karyawan Kontrak");
        System.out.println("Nama: "+nama);
        System.out.println("Total Upah: "+totalupah);
    }
}