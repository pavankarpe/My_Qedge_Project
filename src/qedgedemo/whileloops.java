package qedgedemo;

import java.util.Scanner;

public class whileloops {
	public static void main(String[] args) {
		
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		x = sc.nextInt();
		
		while(x<=10)
		{
			System.out.println("continue...");
			System.out.println("Enter a Number");
			x= sc.nextInt();
			}
		System.out.println("End of the code");
	}

}
