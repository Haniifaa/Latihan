import java.util.Scanner;
public class Queue {
Scanner input = new Scanner(System.in);
int jumlah;
int[] queue = new int[10];
int head = 0;

Dokumentasi PBO – Devi Prasetyoningrum 23
int tail = 0;
void tambahQueue(){
System.out.print("Masukkan jumlah elemen queue : ");
jumlah = input.nextInt();
for (int i = 0; i < jumlah; i++) {
System.out.print("Masukkan elemen queue ke-" + (i+1) + " : ");
queue[tail] = input.nextInt();
tail++;
}
}
void hapusQueue(){
System.out.print("Masukkan jumlah elemen queue yang akan dihapus :
");
jumlah = input.nextInt();
for (int i = 0; i < jumlah; i++) {
System.out.println("Elemen queue ke-" + (i+1) + " : " +

queue[head]);
head++;
}
}
void tampilQueue(){
System.out.println("Elemen queue : ");
for (int i = head; i < tail; i++) {
System.out.print(queue[i] + " ");
}
System.out.println();
}
void peekQueue(){
System.out.println("Elemen queue terdepan : " + queue[head]);
}
void isEmptyQueue(){
if (head == tail) {
System.out.println("Queue kosong");
} else {
System.out.println("Queue tidak kosong");
}
}
void isFullQueue(){
if (tail == queue.length) {
System.out.println("Queue penuh");
} else {
System.out.println("Queue tidak penuh");
}
}

Dokumentasi PBO – Devi Prasetyoningrum 24
void clearQueue(){
head = 0;
tail = 0;
System.out.println("Queue berhasil dikosongkan");
}
void sizeQueue(){
System.out.println("Jumlah elemen queue : " + (tail - head));
}
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Queue queue = new Queue();
int pilihan;
do {
System.out.println();
System.out.println(" ====== Menu ======");
System.out.println("1. Tambah queue");
System.out.println("2. Hapus queue");
System.out.println("3. Tampil queue");
System.out.println("4. Peek queue");
System.out.println("5. Cek apakah queue kosong");
System.out.println("6. Cek apakah queue penuh");
System.out.println("7. Kosongkan queue");
System.out.println("8. Cek jumlah elemen queue");
System.out.println("9. Keluar");
System.out.println("===========================");
System.out.print("Masukkan pilihan : ");
pilihan = input.nextInt();
switch (pilihan) {
case 1:
queue.tambahQueue();
break;
case 2:
queue.hapusQueue();
break;
case 3:
queue.tampilQueue();
break;
case 4:
queue.peekQueue();
break;
case 5:
queue.isEmptyQueue();
break;
case 6:
queue.isFullQueue();
break;
case 7:

Dokumentasi PBO – Devi Prasetyoningrum 25

queue.clearQueue();
break;
case 8:
queue.sizeQueue();
break;
case 9:
System.out.println("Terima kasih");
break;
default:
System.out.println("Pilihan tidak tersedia");
break;
}
} while (pilihan != 9);
}
}