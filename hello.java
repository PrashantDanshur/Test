package hello;

import java.util.Scanner;


public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a char");
		
		char ch = sc.nextLine().charAt(0);
		
		
		
		if( ch >= 'a' && ch <= 'z' ) {
			System.out.println("Small");
		}else if( ch >= 'A' && ch <= 'Z') {
			System.out.println("Capital");
		}else
			System.out.println("Something else");
		
		
		
	}
}
