import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {

Dokumentasi PBO – Devi Prasetyoningrum 19
Scanner input = new Scanner(System.in);
ArrayList<Integer> nilai1 = new ArrayList<Integer>();
ArrayList<Integer> nilai2 = new ArrayList<Integer>();
ArrayList<Integer> hasil = new ArrayList<Integer>();
void tambahArray(){
int jumlah;
System.out.print("Masukkan jumlah elemen array : ");
jumlah = input.nextInt();
nilai1 = new ArrayList<Integer>();
nilai2 = new ArrayList<Integer>();
hasil = new ArrayList<Integer>();
System.out.println("Masukkan elemen array pertama : ");
for (int i = 0; i < jumlah; i++) {
nilai1.add(input.nextInt());
}
System.out.println("Masukkan elemen array kedua : ");
for (int i = 0; i < jumlah; i++) {
nilai2.add(input.nextInt());
}
System.out.println("Hasil penjumlahan array : ");
for (int i = 0; i < jumlah; i++) {
hasil.add(nilai1.get(i) + nilai2.get(i));
System.out.print(hasil.get(i) + " ");
}
}
void kurangArray(){
int jumlah;
System.out.print("Masukkan jumlah elemen array : ");
jumlah = input.nextInt();
nilai1 = new ArrayList<Integer>();
nilai2 = new ArrayList<Integer>();
hasil = new ArrayList<Integer>();
System.out.println("Masukkan elemen array pertama : ");
for (int i = 0; i < jumlah; i++) {
nilai1.add(input.nextInt());
}
System.out.println("Masukkan elemen array kedua : ");
for (int i = 0; i < jumlah; i++) {
nilai2.add(input.nextInt());
}
System.out.println("Hasil pengurangan array : ");
for (int i = 0; i < jumlah; i++) {

Dokumentasi PBO – Devi Prasetyoningrum 20

hasil.add(nilai1.get(i) - nilai2.get(i));
System.out.print(hasil.get(i) + " ");
}
System.out.println();
}
void kaliArray(){
int jumlah;
System.out.print("Masukkan jumlah elemen array : ");
jumlah = input.nextInt();
nilai1 = new ArrayList<Integer>();
nilai2 = new ArrayList<Integer>();
hasil = new ArrayList<Integer>();
System.out.println("Masukkan elemen array pertama : ");
for (int i = 0; i < jumlah; i++) {
nilai1.add(input.nextInt());
}
System.out.println("Masukkan elemen array kedua : ");
for (int i = 0; i < jumlah; i++) {
nilai2.add(input.nextInt());
}
System.out.println("Hasil perkalian array : ");
for (int i = 0; i < jumlah; i++) {
hasil.add(nilai1.get(i) * nilai2.get(i));
System.out.print(hasil.get(i) + " ");
}
System.out.println();
}
void bagiArray(){
int jumlah;
System.out.print("Masukkan jumlah elemen array : ");
jumlah = input.nextInt();
nilai1 = new ArrayList<Integer>();
nilai2 = new ArrayList<Integer>();
hasil = new ArrayList<Integer>();
System.out.println("Masukkan elemen array pertama : ");
for (int i = 0; i < jumlah; i++) {
nilai1.add(input.nextInt());
}
System.out.println("Masukkan elemen array kedua : ");
for (int i = 0; i < jumlah; i++) {
nilai2.add(input.nextInt());
}

Dokumentasi PBO – Devi Prasetyoningrum 21
System.out.println("Hasil pembagian array : ");
for (int i = 0; i < jumlah; i++) {
hasil.add(nilai1.get(i) / nilai2.get(i));
System.out.print(hasil.get(i) + " ");
}
System.out.println();
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
ArrayListDemo demo = new ArrayListDemo();
int pilihan;
do {
System.out.print("\n");
System.out.println("==========================================

==================");

System.out.println("= ----------- Pilihan Operasi Array

----------- =");

System.out.println("= 1. Penjumlahan

Array =");

System.out.println("= 2. Pengurangan

Array =");

System.out.println("= 3. Perkalian

Array =");

System.out.println("= 4. Pembagian

Array =");
System.out.println("= 5.

Exit =");

System.out.println("==========================================

==================");

System.out.print("Masukkan pilihan: ");
pilihan = input.nextInt();
switch (pilihan) {
case 1:
demo.tambahArray();
break;
case 2:
demo.kurangArray();
break;
case 3:
demo.kaliArray();
break;
case 4:
demo.bagiArray();
break;
case 5:
System.out.println("Terima kasih");
break;
default:
System.out.println("Pilihan tidak ada");

Dokumentasi PBO – Devi Prasetyoningrum 22

break;
}
} while (pilihan != 5);
}
}