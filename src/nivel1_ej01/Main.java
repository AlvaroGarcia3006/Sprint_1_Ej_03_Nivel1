package nivel1_ej01;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		ArrayList<Month> monthList = new ArrayList<Month>();
		
		
		generateMonthList(monthList);
		printMonths(monthList);
		
		//Se añade Agosto en la posicion 7 del Array (corresponde al mes 8).
		monthList.add(7, new Month("Agosto"));
		System.out.println("Se ha añadido 'Agosto' en su lugar correspondiente."+"\n");
		printMonths(monthList);
		
		//Conversión del ArrayList a HashSet.
		HashSet<Month> hsMonths = new HashSet<Month>(monthList);
		printHsMonths(hsMonths);
		
		/*addMonth(hsMonths);
		printHsMonths(hsMonths);*/
		
		
	}
	//For-each que muestra por pantalla todos los elementos del ArrayList.
	public static void printMonths(ArrayList<Month> monthList) {
		int i=1;
		for (Month m : monthList) {
			System.out.print(i++ + "·");
			System.out.println(m.getName());
		}
		System.out.println();
	}
	//Iterador que muestra por pantalla todos los elementos del HashSet.
	public static void printHsMonths(HashSet<Month> hsMonths) {
		int i = 1;
		Iterator<Month> itMonths = hsMonths.iterator();
		while(itMonths.hasNext()) {
			System.out.print(i++ +".");
			System.out.println(itMonths.next().getName());
		}
		System.out.println();
		
	}
	//Rellenar ArrayList de meses omitiendo Agosto.
	public static void generateMonthList(ArrayList<Month> monthList) {
		
		monthList.add(new Month("Enero"));
		monthList.add(new Month("Febrero"));
		monthList.add(new Month("Marzo"));
		monthList.add(new Month("Abril"));
		monthList.add(new Month("Mayo"));
		monthList.add(new Month("Junio"));
		monthList.add(new Month("Julio"));
		monthList.add(new Month("Septiembre"));
		monthList.add(new Month("Octubre"));
		monthList.add(new Month("Noviembre"));
		monthList.add(new Month("Diciembre"));
	}
	
	/*public static void addMonth(HashSet<Month> hsMonths) {
		if(hsMonths.add("Junio")){
			System.out.println("Añadido");
		}else {
			System.out.println("No se ha podido añadir porque ya se encuentra en la lista.");
		}
	}*/

}
