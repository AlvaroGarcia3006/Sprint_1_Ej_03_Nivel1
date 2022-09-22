package nivel1_ej03;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		String txtInput = "C:/Users/alvar/eclipse-workspace/Sp1_ej03_GarciaAlvaro/src/nivel1_ej03/Countries.txt";
		String user = createUser();
		int score = randomCountry(user, readCountries(txtInput));
		ranking(user, score);
	}
	//Método para crear usuario
	public static String createUser() {
		
		System.out.println("Introduzca su nombre de usuario:");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	//Método para leer el fichero de paises y convertirlo en un HashMap
	public static HashMap<String, String> readCountries(String txtInput){
		
		HashMap<String, String> hmCountries = new HashMap<String, String>();
		File inputCountries = new File(txtInput);
		
		try(Scanner sc = new Scanner(inputCountries)){
			sc.useDelimiter("\n");
			while(sc.hasNext()) {
				String[] scLine = sc.next().split("\\s");
				hmCountries.put(scLine[0], scLine[1]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return hmCountries;
	}
	//Método que escoge un país al azar y pregunta al usuario su capital, contabiliza los aciertos totales del usuario.
	public static int randomCountry(String user, HashMap<String, String> hmCountries) {
		int points=0;
		String answer, rKey, capital;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		ArrayList<String> keys = new ArrayList<String>(hmCountries.keySet());
		
		System.out.println("Bienvenid@ "+user+", empecemos a jugar:");
		
		for(int i=0; i<10; i++) {
			rKey = keys.get(r.nextInt(keys.size()));
			capital = hmCountries.get(rKey);
			System.out.print("Capital de "+rKey+": ");
			answer = sc.nextLine();
			if(answer.equalsIgnoreCase(capital)) {
				points +=1;
			}
		}
		return points;
	}
	//Método que crea el fichero que almacena los puntos conseguidos por el usuario.
	public static void ranking(String user, int score) {
		String scoreboard = "C:/Users/alvar/eclipse-workspace/Sp1_ej03_GarciaAlvaro/src/nivel1_ej03/Clasificacion.txt";
		try {
			PrintWriter w = new PrintWriter(scoreboard);
			w.println(user+": "+score);
			w.close();
			System.out.println("La clasificación está disponible.");	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
