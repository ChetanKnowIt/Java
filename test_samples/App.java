package test_samples;
public class App{
	int var;
	App(double var) { this.var = (int)var; }
	App(int var) { this("hello"); }
	App(String s) { this();System.out.println(s); }
	App() { System.out.println("good-bye"); }
	public static void main(String[] args){
		App t = new App(5);	
	}
}