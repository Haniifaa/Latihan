import java.util.Scanner;
public class Mhs{
public static void main(String[] args){
String jwb="Y";
Scanner sc = new Scanner(System.in);
System.out.print("Jumlah Mahasiswa : ");
int n = sc.nextInt();
Nilai[] b = new Nilai[n];
for (int i=0;i<n;i++){
System.out.println("Mahasiswa ke : "+ (i+1));
b[i] = new Nilai();
b[i].isiData();

4
Pemrogaman Berbasis Objek

b[i].cetakNilai();
}
b[0].judul();
for(int i=0;i<n;i++){
b[i].daftarNilai();
}
}
}