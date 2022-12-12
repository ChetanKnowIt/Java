package exp3;
//PRIME NUMBER UPTO 'N' USING ARRYLIST
import java.util.*;

public class ListPrime {
	public static ArrayList primeFinder(int n) {
		ArrayList<Integer> integerArray = new ArrayList<Integer>();
		
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				integerArray.add(i);
			}
		}
		return integerArray;
	}

	public static void main(String[] args) {
		System.out.println(primeFinder(25));
	}

}
