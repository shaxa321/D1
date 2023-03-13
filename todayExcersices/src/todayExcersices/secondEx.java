package todayExcersices;
import java.util.Scanner; 

public class secondEx {
	public static void main(String args[]) {
		String[] result = new String[3];
		Scanner myObj = new Scanner(System.in);  
		System.out.println("Inserisci la prima stringa");
		String firstString=myObj.nextLine();
		System.out.println("Inserisci la seconda stringa");
		String secondString=myObj.nextLine();
		System.out.println("Inserisci la terza stringa");
		String thirdString=myObj.nextLine();
		result[0]=firstString;
		result[1]=secondString;
		result[2]=thirdString;
		for(int i=0;i<3;i++) {
		System.out.print(result[i]);
		System.out.print(" ");
		}
		
		
	}
}
