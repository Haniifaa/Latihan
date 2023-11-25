import java.util.Scanner;
import java.io.*;
public class DeterminanDemo
{
    public static void main(String[] a) throws Exception
    {
        String jwb="Y",nama;
        Scanner key=new Scanner(System.in);
        InputStreamReader r= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        Determinan abc=new Determinan();
        do{
            System.out.print("Determinan siapa : ");
            nama=br.readLine();
            System.out.print("Nilai a : ");
            abc.a=key.nextFloat();
            System.out.print("Nilai b : ");
            abc.b=key.nextFloat();
            System.out.print("Nilai c : ");
            abc.c=key.nextFloat();
            abc.cetakDeterminan();
            System.out.print("Jawab [Y/T] : ");
            jwb=br.readLine();
        } while(jwb.equalsIgnoreCase("Y"));
    }
}