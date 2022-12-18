package test_samples;
public class TestByte{
	public static void main(String[] args){
		byte var = 1;
		// var = (byte) var * 0; //line 1
		byte data = (byte) (var * 0); //line 2
		System.out.println(var);
	}
}

/*
Error: 
.\TestByte.java:5: error: incompatible types: possible lossy conversion from int to byte
                var = (byte) var * 0; //line 1
                                 ^
1 error
*/