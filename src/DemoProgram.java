
public class DemoProgram {

	public static void main(String[] args) {
		LambdaInterface ob = (a,b) -> {return a+b;};
		System.out.println("Addition = "+ob.add(10, 5));

	}

}
