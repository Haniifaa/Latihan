import java.util.Scanner;
public class Matrix {
    int i, j, k, jumlah, baris1, kolom1, baris2, kolom2, matriks1[][],
    matriks2[][], hasil[][];
    Scanner sc = new Scanner(System.in);
    void jumlahMatriks() {
        System.out.print("Masukkan jumlah baris matriks: ");
        baris1 = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        kolom1 = sc.nextInt();
        matriks1 = new int[baris1][kolom1];
        matriks2 = new int[baris1][kolom1];
        hasil = new int[baris1][kolom1];
        System.out.print("\n");
        System.out.println("Masukkan elemen matriks pertama: ");
        for (i = 0; i < baris1; i++) {
            for (j = 0; j < kolom1; j++) {
                matriks1[i][j] = sc.nextInt();
            }
        }
        System.out.print("\n");
        System.out.println("Masukkan elemen matriks kedua: ");
        for (i = 0; i < baris1; i++) {
            for (j = 0; j < kolom1; j++) {
                matriks2[i][j] = sc.nextInt();
            }
        }
        System.out.print("\n");
        System.out.println("Hasil penjumlahan matriks: ");
        for (i = 0; i < baris1; i++) {
            for (j = 0; j < kolom1; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        }
    void kurangMatriks(){
        System.out.print("Masukkan jumlah baris matriks: ");
        baris1 = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        kolom1 = sc.nextInt();
        matriks1 = new int[baris1][kolom1];

        
        matriks2 = new int[baris1][kolom1];
        hasil = new int[baris1][kolom1];
        System.out.print("\n");
        System.out.println("Masukkan elemen matriks pertama: ");
        for (i = 0; i < baris1; i++) {
            for (j = 0; j < kolom1; j++) {
                matriks1[i][j] = sc.nextInt();
            }
        }
        System.out.print("\n");
        System.out.println("Masukkan elemen matriks kedua: ");
        for (i = 0; i < baris1; i++) {
            for (j = 0; j < kolom1; j++) {
                matriks2[i][j] = sc.nextInt();
            }
        }
        System.out.print("\n");
        System.out.println("Hasil pengurangan matriks: ");
        for (i = 0; i < baris1; i++) {
            for (j = 0; j < kolom1; j++) {
                hasil[i][j] = matriks1[i][j] - matriks2[i][j];
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    void kaliMatriks() {
        System.out.print("Masukkan jumlah baris matriks pertama: ");
        baris1 = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks pertama: ");
        kolom1 = sc.nextInt();
        matriks1 = new int[baris1][kolom1];
        System.out.print("\n");
        System.out.print("Masukkan jumlah baris matriks kedua: ");
        baris2 = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks kedua: ");
        kolom2 = sc.nextInt();
        System.out.print("\n");
        matriks2 = new int[baris2][kolom2];
        hasil = new int[baris1][kolom2];

        
        if (kolom1 != baris2) {
        System.out.println(
        "Jumlah kolom matriks pertama tidak sama dengan jumlah baris matriks kedua, matriks tidak dapat dikalikan\n");
        } else {
        System.out.println("Masukkan elemen matriks pertama: ");
        for (i = 0; i < baris1; i++) {
            for (j = 0; j < kolom1; j++) {
                matriks1[i][j] = sc.nextInt();
            }
        }
        System.out.print("\n");
        System.out.println("Masukkan elemen matriks kedua: ");
        for (i = 0; i < baris2; i++) {
            for (j = 0; j < kolom2; j++) {
                matriks2[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < baris1; i++) {
            for (j = 0; j < kolom2; j++) {
                for (k = 0; k < baris2; k++) {
                    jumlah = jumlah + matriks1[i][k] * matriks2[k][j];
                }
                hasil[i][j] = jumlah;
                jumlah = 0;
            }
        }
        System.out.print("\n");
        System.out.println("Hasil perkalian matriks: ");
        for (i = 0; i < baris1; i++) {
            for (j = 0; j < kolom2; j++) {
                System.out.print(hasil[i][j] + "\t ");
            }
            System.out.print("\n");
        }
        }
        System.out.print("\n");
    }
    void transposeMatriks(){
        System.out.print("Masukkan jumlah baris matriks: ");
        baris1 = sc.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        kolom1 = sc.nextInt();

        
        matriks1 = new int[baris1][kolom1];
        hasil = new int[kolom1][baris1];
        System.out.print("\n");
        System.out.println("Masukkan elemen matriks: ");
        for (i = 0; i < baris1; i++) {
            for (j = 0; j < kolom1; j++) {
                matriks1[i][j] = sc.nextInt();
            }
        }
        System.out.print("\n");
        System.out.println("Hasil transpose matriks: ");
        for (i = 0; i < kolom1; i++) {
            for (j = 0; j < baris1; j++) {
                hasil[i][j] = matriks1[j][i];
                System.out.print(hasil[i][j] + "\t");
            }
        System.out.print("\n");
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix tes = new Matrix();
        int pilih;
        do {
            System.out.println("==============================================================");

            System.out.println("= ----------- Pilihan Operasi Matriks ----------- =");

            System.out.println("= 1. Penjumlahan Matriks =");

            System.out.println("= 2. Pengurangan Matriks =");

            System.out.println("= 3. Perkalian Matriks =");

            System.out.println("= 4. Transpose Matriks =");
            System.out.println("= 5. Exit =");

            System.out.println("==============================================================");

            System.out.print("Masukkan Pilihan Anda : ");
            pilih = sc.nextInt();
            System.out.print("\n");
            switch (pilih) {

            

            case 1:
            tes.jumlahMatriks();
            break;
            case 2:
            tes.kurangMatriks();
            break;
            case 3:
            tes.kaliMatriks();
            break;
            case 4:
            tes.transposeMatriks();
            break;
            case 5:
            System.out.println("Terima Kasih");
            break;
            default:
            System.out.println("Pilihan tidak tersedia");
            break;
            }
        } while (pilih != 5);
        sc.close();
    }
}