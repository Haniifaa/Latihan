import Transportasi.Mobil;
public class TransportasiDemo{
public static void main(String[] args){
		Mobil avanza=new Mobil();
		Mobil xenia=new Mobil();
		avanza.hidupkanMobil("Avanza Silver");
		avanza.ubahGigi("Avanza Silver");
		avanza.maju();
		avanza.mundur();
		avanza.belok();
		System.out.println("Roda Avanza		: "+avanza.roda);
		System.out.println("Roda Xenia		: "+xenia.roda);
		xenia.roda=4;
		xenia.mesin=2;
		xenia.hidupkanMobil("Xenia putih");
		xenia.ubahGigi("xenia putih");
		System.out.println("Mesin Avanza	: "+avanza.mesin);
		System.out.println("Mesin Xenia		: "+xenia.mesin);
	}
}
