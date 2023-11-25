import java.util.Scanner;
public class DetikDemo
{
	public static void main(String args[])
	{
		String jawab="Y";
		Scanner key = new Scanner(System.in);
		Detik detikku = new Detik();
		
		do
		{
			System.out.println("Detik : ");
			detikku.d = key.nextInt();
			detikku.konversi();
			detikku.cetak();
			System.out.println("Jawab [Y/N] : ");
			jawab = key.next();
		}
		while(jawab.equalsIgnoreCase("Y"));
	}
}