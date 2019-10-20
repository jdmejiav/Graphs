
import java.io.file;
import java.util.Scanner;
public class Main {
	public static void main (String []args){
		leerArchivo();
	}
	private void leerArchivo(){
		try{
			File file = new File("Entrada.in");
			Scanner sc = new Scanner (file);
			int nTestCases = sc.nextInt();
			while (sc.hasNextLine()){
				String [] testCases=leerTestCases(nTestCases,sc);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	private []String leerTestCases(int testCases,Scanner sc){
		String retorno [] = new String [testC];
		for (int i=0;i<testCases;i++){
			retono[i]=sc.nextLine();
		}
		return retorno;
	}
	private String forbiddenPositions(){
		

	}
}

