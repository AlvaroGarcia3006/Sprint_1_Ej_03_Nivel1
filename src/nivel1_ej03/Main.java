package nivel1_ej03;

import java.util.Scanner;
import java.io.*;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, String> hsCountries = new HashMap<String, String>();
		String txtInput = "C:/Users/alvar/eclipse-workspace/Sp1_ej03_GarciaAlvaro/src/nivel1_ej03/Countries.txt";
		String user = createUser();
		String rCountries = readCountries(txtInput);
		genHsCountries(rCountries, hsCountries);
		System.out.println(rCountries.split("\n").toString());
		
	}
	public static String createUser() {
		
		System.out.println("Introduzca su nombre de usuario:");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	public static String readCountries(String txtInput){
		
		StringBuilder sb = new StringBuilder();	
		File inputCountries = new File(txtInput);
		
		try(Scanner sc = new Scanner(inputCountries)){
			sc.useDelimiter("\n");
			while(sc.hasNext()) {
				sb.append(sc.next()).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
	public static HashMap<String, String> genHsCountries(String rCountries, HashMap <String, String> hsCountries){
		
		return hsCountries;
	}
}
