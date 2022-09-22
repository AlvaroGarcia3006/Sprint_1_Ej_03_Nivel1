package nivel1_ej03;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		String txtInput = "C:/Users/alvar/eclipse-workspace/Sp1_ej03_GarciaAlvaro/src/nivel1_ej03/Countries.txt";
		String user = createUser();
		//readCountries(txtInput);
		randomCountry(user, readCountries(txtInput));
		
	}
	public static String createUser() {
		
		System.out.println("Introduzca su nombre de usuario:");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	public static HashMap<String, String> readCountries(String txtInput){
		
		HashMap<String, String> hmCountries = new HashMap<String, String>();
		File inputCountries = new File(txtInput);
		
		try(Scanner sc = new Scanner(inputCountries)){
			sc.useDelimiter("\n");
			while(sc.hasNext()) {
				String[] scLine = sc.next().split(" ");
				hmCountries.put(scLine[0], scLine[1]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return hmCountries;
	}
	public static void randomCountry(String user, HashMap<String, String> hmCountries) {
		int points=0;
		String answer, rKey, country;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		ArrayList<String> keys = new ArrayList<String>(hmCountries.keySet());
		
		System.out.println("Bienveni@ "+user+", empecemos a jugar:");
		
		for(int i=0; i<2; i++) {
			rKey = keys.get(r.nextInt(keys.size()));
			country = hmCountries.get(rKey);
			System.out.print("Capital de "+country+": ");
			answer = sc.nextLine();
			for(Entry<String, String> entry : hmCountries.entrySet()) {
				if(entry.getKey() == country) {
					if(answer == entry.getValue()) {
						points += 1;
					}
				}
			}
		}
		System.out.println(points);
	}
}
