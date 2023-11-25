import java.util.Scanner;
public class Array1 {
    Scanner input = new Scanner(System.in);
    int n;
    int x[];

    public Array1(){}

    void isiData(){
    System.out.print("Jumlah data : ");
    n = input.nextInt();
    x = new int[n];
    for(int i=0; i<n; i++){
        System.out.print("Data ke-"+(i+1)+" : ");
        x[i] = input.nextInt();
        }
    }
    void tampilData(){
    for(int i=0; i<n; i++){
        System.out.println("Hasil nilai["+i+"] : " + x[i]);
        }
    }
}