package com.sunbeam;
import java.util.*;
public class StringLengthCheak {

	public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a string");
	String input = sc.nextLine();
	
	try {
		if (input.length()> 80) {
			throw new Exception();
		}else {
			System.out.println("String length: " + input.length());
			 System.out.println("String is within limit");
		}       
    
}
    catch (ExceptionLineTooLong e) {
    System.out.println(e.getMessage());
}

sc.close();
	

	}

}
