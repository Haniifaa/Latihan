import java.util.Scanner;
import java.util.Random;
public class Agen extends Produk{
    int noNota, jmlJual, tempo,jnsByr;
    double ppn,totJual,bunga;
    String ketByr,souvenir;
    Agen(String cabang){
        System.out.println("Agen Aksesoris HP - "+cabang);
    }

    void setNota(){
        Random rand = new Random();
        Scanner xNota = new Scanner(System.in);
        noNota = rand.nextInt(99999);
        System.out.println("No. Nota 	: "+noNota);
        inputProduk();
    }

    void inputJumlah(){
        Scanner iJumlah = new Scanner(System.in);
        System.out.print("Jml. Jual	: ");
        jmlJual = iJumlah.nextInt();
        getHargaJual();
        System.out.println("Total           : "+getHargaJual());
    }

    double getHargaJual(){
        return hrgJual * jmlJual; 
    }

    void inputJenis(){
        Scanner iJenis = new Scanner(System.in);
        System.out.println("(1. Cash , 2. Tempo)");
        System.out.print("Jenis                 : ");
        jnsByr = iJenis.nextInt();
        if(jnsByr == 1){
            System.out.println("Ket.Bayar	: Cash");
            bunga = 0;
            ppn = 0.11*getHargaJual();
            System.out.println("PPN	        : "+ppn);
        }else if(jnsByr == 2){
            System.out.println("Ket.Bayar	: Tempo");
            System.out.print("Waktu Tempo	: ");
            tempo = iJenis.nextInt();
            ppn = 0.11*getHargaJual();
            System.out.println("PPN	        : "+ppn);
            if(tempo>1){
                bunga = 0.05*getHargaJual();
            }
            System.out.println("Bunga           : "+bunga);
            
        }else{
            System.out.println("Masukan tidak tersedia mohon diulang kembali (pilih 1 atau 2)");
            inputJenis();
        }
        
        
    }

    double hitungJual(){
        totJual = getHargaJual()+ppn+bunga;
        return totJual;
    }

    

    void cetak(){
        System.out.println("Total Bayar	: "+hitungJual());
        if(jnsByr==1 && (totJual>=100000 && totJual<=500000)){
            souvenir = "Mug";
        }else if(jnsByr==1 && (totJual>500000 && totJual<=750000)){
            souvenir = "Payung";
        }else if(jnsByr==1 && (totJual>750000 && totJual<=1000000)){
            souvenir = "Tas Belanja";
        }else if(jnsByr==1 && (totJual>1000000)){
            souvenir = "Voucher 100rb";
        }else{
            souvenir = "Anda belum bisa mendapat Souvenir";
        }
        System.out.println("Souvenir	: "+souvenir);
    }

    String getSouvenir(){
        souvenir=souvenir;
        return souvenir;
    }

    
}