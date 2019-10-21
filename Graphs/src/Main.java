
import java.io.File;
import java.util.Scanner;
public class Main {
	public static void main (String []args){
		Main main = new Main();
		main.leer_archivo();
	}
	private void leer_archivo(){
		try{
			File file = new File("Entrada.in");
			Scanner sc = new Scanner (file);
			int n_test_cases = sc.nextInt();
			while (sc.hasNextLine()){
				String []test_cases=leerTestCases(n_test_cases,sc);
				int n_forbidden_cases=sc.nextInt();
				String []forbidden_positions= forbidden_positions(n_forbidden_cases,sc);
				Grafo gr = new Grafo(test_cases,forbidden_positions);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	private String[] leerTestCases(int testCases,Scanner sc){
		String retorno [] = new String [testCases];
		for (int i=0;i<testCases;i++){
			retorno[i]=sc.nextLine();
		}
		return retorno;
	}

	private String[] forbidden_positions(int forbidden_positions,Scanner sc){
		String retorno [] = new String [forbidden_positions];
		for (int i=0;i<forbidden_positions;i++){
			retorno[i]=sc.nextLine();
		}
		return retorno;
	}




	private String forbiddenPositions(){
	return "";
	}
}

