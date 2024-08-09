package exceptionPkg;

public class UncheckedException1 {

	public static void main(String[] args) {
	
		
		try {
			int a = 5/0;
		} catch (ArithmeticException a) {
			
			a.printStackTrace();
			//System.out.println(a);//give all exception info
		}
		System.out.println("hello");
		
//		try {
//			int i=10/0;
//		} catch (Exception i) {
//			// TODO Auto-generated catch block
//			i.printStackTrace();
//			
//		}finally {
//		System.out.println("always exicute");
//		}
	}

}
