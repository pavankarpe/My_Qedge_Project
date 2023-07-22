package qedgedemo;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {

		String course;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the course");
		course = sc.nextLine();
		
		switch (course.toLowerCase())
		{
		
		  case "s": 
			  System.out.println("Selenium");
			  break;
			  
		  case "q":
		      System.out.println("QTP");
		      break;
		  case "l":
		      System.out.println("LoadRunner");
		      break;
		      
		}
	}

}
