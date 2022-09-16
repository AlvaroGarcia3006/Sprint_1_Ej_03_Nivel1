package nivel1_ej01;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		ArrayList<Month> monthList = new ArrayList<Month>();
		
		
		generateMonthList(monthList);
		printMonths(monthList);
		monthList.add(7, new Month("Agosto"));
		System.out.println("Se ha añadido 'Agosto' en su lugar correspondiente."+"\n");
		printMonths(monthList);
		
		HashSet<Month> hsMonths = new HashSet<Month>(monthList);
		printHsMonths(hsMonths);
		
		addMonth(hsMonths);
		printHsMonths(hsMonths);
		
		
	}

	public static void printMonths(ArrayList<Month> monthList) {
		int i=1;
		for (Month m : monthList) {
			System.out.print(i++ + "·");
			System.out.println(m.getName());
		}
		System.out.println();
	}
	public static void printHsMonths(HashSet<Month> hsMonths) {
		int i=1;
		for (Month m : hsMonths) {
			System.out.print(i++ + "·");
			System.out.println(m.getName());
		}
		System.out.println();
		
	}
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
	
	public static void addMonth(HashSet<Month> hsMonths) {
		hsMonths.add(new Month("Junio"));
		if(hsMonths.add(new Month("Junio"))) {
			System.out.println("Añadido");
		}else {
			System.out.println("No se ha podido añadir porque ya se encuentra en la lista.");
		}
	}

}
