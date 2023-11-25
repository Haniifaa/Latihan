public class Matematika{
	float hasil;
	int hsl;
	
	void pertambahan(int a, int b){
		hsl=a+b;
		System.out.println("Pertambahan : "+a+" + "+b+
		" = "+hsl);
	}
	float pertambahan(float a,float b){
		return a+b;
	}
	void pengurangan(int a, int b){
		hsl=a-b;
		System.out.println("Pengurangan : "+a+" - "+b+
		" = "+hsl);
	}
	float pengurangan(float a,float b){
		return a-b;
	}
	void perkalian(int a,int b){
		hsl=a*b;
		System.out.println("Perkalian : "+a+" x "+b+
		" = "+hsl);
	}
	float perkalian(float a,float b){
		return a*b;
	}
	void pembagian(int a,int b){
		hsl=a/b;
		System.out.println("Pembagian : "+a+" : "+b+
		" = "+hsl);
	}
	float pembagian(float a,float b){
		return a/b;
	}
}
		