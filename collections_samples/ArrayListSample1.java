// ArrayList is most commonly used
package collections_samples;

import java.util.*;

class ArrayListSample1{
	public static void main(String[] args) {
	System.out.println("Array Example 1:");
	List<String> names = new ArrayList<>();
	names.add("Rahul");
	names.add("Aishwarya");
 	System.out.println(names.get(1));
	//System.out.println(((String)names.get(1)).toUpperCase());
	}

}