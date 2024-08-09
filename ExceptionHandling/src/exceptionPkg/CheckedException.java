package exceptionPkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws FileNotFoundException {
	/*
	 * Two types of exception
	 * 1 checked exception
	 * 2 unchecked exception
	 * checked exception-it says i will checked the exception or code failure at compile time
	 * compile time means before running your code
	 * checked exception-filenotfound ,IOexception,SQLexception
	 */
    FileInputStream input= new FileInputStream("c.//a.txt");
    //throws means throws the exception that comes on met hod
	}

}
