package exceptionPkg;

public class UncheckedException {

	public static void main(String[] args) {
		/*
		 * Unchecked Exception-it is a run time ,this will check code failure 
		 *  while running your code
		 *  * que-
	   * 1.can we create catch without try?//no,it is not possible
	   * 2.can we create only try without catch?//no,it is not possible
	   * 3.can we have a try and multiple catch?//yes,it is possible 
	   * 4.can we create try/catch within try?//yes,it is possible
	   * 5.can we create try/catch within catch?//yes,it is possible
	   * 6.can we have only finally without try?//no
	   * 7.can we execute only catch and finally without try?//no
	   * 8.can we execute only try and fianlay wtihout catch?//yes
	   * 9.can we have try/catch/finally within finally?//yes
	   */
		 
		int [] arr= {2,5,7,10};
		int index=3000;
		System.out.println(arr.length);
		
        try {
        	//protected code
			System.out.println(arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// Triggered the action of failure
			if(index>=arr.length) {
				System.out.println("your index is bigger take necessary action");
			}
			for(int i=index;i>=arr.length-1;i--) {
				index=i;
			}
			
			System.out.println(arr[index]);
			
		
		}
	}

}
