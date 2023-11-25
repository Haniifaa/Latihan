//Haniifa Aliila Faudyta

public class Persegi{
public static void main(String args [])
{
	int p,l,luas,keliling;
	p=15;l=5;
	luas=p*l;
	keliling=2*(p+l);
	System.out.println("~~~ Persegi ~~~");
	System.out.println("Panjang     : "+p);
	System.out.println("Lebar       : "+l);
	System.out.println("Luas        : "+luas);
	System.out.println("Keliling    : "+keliling);
	
	//segitiga
	
	int a,b,c,t,luasegitiga,kelilingsegitiga;
	a=18;b=15;c=8;t=6;
	luasegitiga=a*t/2;
	kelilingsegitiga=a+b+c;
	System.out.println("~~~ Segitiga ~~~");
	System.out.println("Luas        : "+luasegitiga);
	System.out.println("Keliling    : "+kelilingsegitiga);
	
	//lingkaran
	int r=14;
	float phi=3.14f;
	float luaslingkaran=phi*(r*r);
	float kelilinglingkaran=2*phi*r;
	System.out.println("~~~ Lingkaran~~~");
	System.out.println("Jari     : "+r);
	System.out.println("Luas     : "+luaslingkaran);
	System.out.println("Keliling : "+kelilinglingkaran);
	
	//kubus
	int s=7;
	float luaskubus=6*(s*s);
	float kelilingkubus = 12*s;
	System.out.println("~~~ Kubus ~~~");
	System.out.println("Luas      : "+luaskubus);
	System.out.println("Keliling  : "+kelilingkubus);
	}
}	