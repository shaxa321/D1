package todayExcersices;

public class HelloWorld {

	public static int moltiplica(int num1,int num2) {
		System.out.println("BHo");
		return (num1*num2);
	}
	
	static String concatena(String stringa,int num) {
		String result;
		result=stringa+num;
		return (result);
		
	}
	
	static String[] inserisciNElementi(String[] arr,String st) {
		String[] result= new String[5];
		result[0]=arr[0];
		result[1]=arr[1];
		result[2]=st;
		result[3]=arr[2];
		result[4]=arr[3];
		System.out.println(result[1]);
		return (result);
		
	}
	
	public static void main(String args[]) {
		
		String[] myString= {"Ciao","bau","miao","Cacao","baubau"};
		
		System.out.println("Hello World");
		System.out.println(moltiplica(5,4));
		System.out.printf(concatena("io Ho ",5));
		System.out.println(" gatti");
		System.out.println(inserisciNElementi(myString,"MAGIC"));
	}
}
