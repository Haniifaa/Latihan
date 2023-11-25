class KaryawanTetap extends Karyawan{
    int gajipokok, jmlanak, total;
    KaryawanTetap(String nama, int jmlanak, int gajipokok){
        super(nama);
        this.jmlanak=jmlanak;
        this.gajipokok=gajipokok;
    }
    
    void isiData(){
        System.out.println("Karyawan Tetap");
		System.out.println("Nama: ");nama=sc.next();
		System.out.println("Gaji Pokok: ");gajipokok=sc.nextInt();
        System.out.println("Jumlah Anak: ");jmlanak=sc.nextInt();
    }
    void TotalGaji(){
        total=gajipokok+(jmlanak*tunjangan);
    }

    void cetak(){
        System.out.println("Karyawan Tetap");
        System.out.println("Nama: "+nama);
        System.out.println("Total Gaji: "+total);
    }
}