package nivel1_ej02;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
	
	static ArrayList<Integer> nums = new ArrayList<Integer>();
	static ArrayList<Integer> reverseNums = new ArrayList<Integer>();
	

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			addNumber(nums);
		}
		System.out.println(nums);
		
		ListIterator<Integer> numsIterator = nums.listIterator(nums.size());
		
		while(numsIterator.hasPrevious()) {
			reverseNums.add(numsIterator.previous().intValue());
		}
		System.out.println(reverseNums);
		
	}
	public static void addNumber(ArrayList<Integer> nums) {
		nums.add(generateNumber());
	}
	public static int generateNumber() {
		int number = (int)(Math.random()*50+1);
		return number;
	}
}
