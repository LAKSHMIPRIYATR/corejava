
public class WithoutException {
	public static void main(String args[]) {
		int d = 0;
		try
		{
			int a =42/d;
			System.out.println("priya");
		}catch(ArithmeticException e)
		{
			System.out.println("success"+e.getMessage());
		}
		System.out.println("will not be printed");
	}

}

