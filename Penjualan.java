public class Penjualan{
    String kode,nama;
    int jumlah,harga,totalPembelian;
    public void setData(String kode, String nama, int jumlah,int harga)
    {
        this.kode=kode;
        this.nama=nama;
        this.jumlah=jumlah;
        this.harga=harga;
    }
    public void getTotalPembelian()
    {
        totalPembelian=jumlah*harga;
    }
    public void getBonus()
    {
        if(totalPembelian>=500000 && jumlah>5)
        {
            System.out.println("Mendapatkan bonus setrika");
        }
        else if(totalPembelian>=100000 && jumlah>3)
        {
            System.out.println("Mendapatkan bonus payung");
        }
        else if(totalPembelian>=500000 && jumlah>2)
        {
            System.out.println("Mendapatkan bonus ballpoint");
        }
        else
        {
            System.out.println("Tidak dapat bonus");
        }
    }

    public void cetakNota()
    {
        System.out.println("============NOTA============");
        System.out.println(nama);
        System.out.println("Harga Rp "+harga);
        System.out.println("Jumlah: "+jumlah);
        System.out.println("Total harga: "+totalPembelian);
        getBonus();
        System.out.println("============================");
    }
}