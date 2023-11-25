public class PenjualanDemo{
    public static void main(String args[]) {

	Penjualan penjualan=new Penjualan();
    penjualan.setData("001","Lila",7,40000);
    penjualan.getTotalPembelian();
	penjualan.cetakNota();
	}
}
