package todayExcersices;

public class LastEx {
	
	static float perimetroRettangolo(float base,float altezza) {
		return ((base+altezza)*2);
	}
	
	static String pariDispari(float n) {
		if(n%2==0) {
			return("Pari");
			
		}else {
			return("Dispari");
		}
	}
	
	static float AreaTriangolo(float n1,float n2,float n3) {
		float semiperimetro=(float)((n1+n2+n3)/2);
		float area = (float) Math.sqrt(semiperimetro*(semiperimetro-n1)*(semiperimetro-n2)*(semiperimetro-n3));
		return(area);
	}
	
	public static void main(String args[]) {
		float base=5.00f;
		float altezza=3.00f;
		float terzoElemento=4.30f;
		System.out.println("il Perimetro è");
		System.out.println(perimetroRettangolo(base,altezza));
		System.out.println(AreaTriangolo(base,altezza,terzoElemento));
	}
}
