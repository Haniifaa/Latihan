import java.util.Scanner;

public class AgenDemo{
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int pilihan,jumlah;
        String namaAgent;

        System.out.print("Nama Agen      : ");
        namaAgent = input.nextLine();
        System.out.print("Jumlah Inputan : ");
        jumlah = input.nextInt();

        Agen[] produk = new Agen[jumlah];
        for (int i = 0; i < jumlah; i++) {
            produk[i] = new Agen(namaAgent);
            produk[i].setNota();
            produk[i].inputJumlah();
            produk[i].inputJenis();
            produk[i].cetak();
        }
        System.out.println("NamaAgen - "+namaAgent);
        String leftAlignFormat = "| %-2s | %-6s | %-13s | %-9s | %-8s | %-11s | %-8s | %-8s | %-9s | %-15s | %-34s |%n";
        System.out.format("+----+--------+---------------+-----------+----------+-------------+----------+----------+-----------+-----------------+------------------------------------+%n");
        System.out.format("| No | Nota   | Nama Produk   | Jual      | Jml      | TJual       | Tempo    | Bunga    | PPN       | Total Bayar     | Souvenir                           |%n");
        System.out.format("+----+--------+---------------+-----------+----------+-------------+----------+----------+-----------+-----------------+------------------------------------+%n");
        for (int i = 0; i < jumlah; i++) {
            System.out.format(leftAlignFormat, (i+1) , produk[i].noNota, produk[i].nmProduk, produk[i].hrgJual , produk[i].jmlJual, produk[i].getHargaJual(), produk[i].tempo, produk[i].bunga, String.format("%.2f", 0.11*produk[i].getHargaJual()), String.format("%.2f", produk[i].hitungJual()), produk[i].getSouvenir());
        }
        System.out.format("+----+--------+---------------+-----------+----------+-------------+----------+----------+-----------+-----------------+------------------------------------+%n");
        input.close();
    }
}
