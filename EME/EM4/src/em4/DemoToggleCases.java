package em4;

public class DemoToggleCases{

    public static void main(String[] args){
//String mystr = "For our case, we need a pattern";
try{
	if(args.length>1)
	{
		for(int i=0;i<args.length;i++)
		{
			System.out.println(toggleCases(args[i]));
		}
	}
	else
		System.out.println("Insufficient Arguments");
}

catch(Exception e){
	e.printStackTrace();
}
    }

    public static String toggleCases(String str){
        char[] arr = new char[str.length()];
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>=65 && ch<=90)
                ch=(char)(ch+32);
            else if(ch>=97 && ch<=122)
                ch=(char)(ch-32);
            arr[i] = ch;
            }
        return new String(arr,0, arr.length);
}
}