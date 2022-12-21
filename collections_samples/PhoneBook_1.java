import java.util.*;

class PhoneBook {

    public static void getItem(Map<String, String> m1){
        Formatter fmt = new Formatter();  
        fmt.format("%20s\t%10s\n", "Name", "Number");  
        for (Map.Entry<String, String> entry : m1.entrySet()){
            fmt.format("%5s\t%5s\n", entry.getKey(), entry.getValue()); 
        }  
        System.out.println(fmt);

	}
	
	public static void addItem(Map<String, String> m1, String s1, String i1){
	    m1.put(s1,i1);
	}
	
	public static void main(String[] args) {
    	Map<String, String> myphonebook = new HashMap<>();
    	System.out.println("Map Example\n");
     	addItem(myphonebook, "Sandeep", "9595951212");
     	addItem(myphonebook, "Kaustubh", "9595951212");
     	addItem(myphonebook, "Sri S", "9595951212");
     	addItem(myphonebook, "Prince", "9595951212");
     	addItem(myphonebook, "Chetan", "9595951212");
     	addItem(myphonebook, "AnnaSwamyMuttySwamiIyear", "9595951212");
     	getItem(myphonebook);
     	
    }
}
