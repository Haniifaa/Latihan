public class MatematikaDemo{
	public static void main(String[]args){
		//objek
		Matematika math = new Matematika();
		
		//pertambahan
		math.pertambahan(20,20);
		System.out.println("Pertambahan : "+
		math.pertambahan(20.8f,9.9f));
		math.pengurangan(10,5);
		System.out.println("Pengurangan : "+
		math.pengurangan(20.8f,9.9f));
		math.perkalian(10,20);
		System.out.println("Perkalian : "+
		math.perkalian(20.8f,9.9f));
		math.pembagian(20,2);
		System.out.println("Pembagian : "+
		math.pembagian(20.8f,9.9f));
	}
}
		