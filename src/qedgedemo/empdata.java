package qedgedemo;

import java.util.ArrayList;
 

public class empdata {

	public static void main(String[] args) {

		ArrayList<Object> empdata;
		empdata = new ArrayList<>();
		
		empdata.add("E001");
		empdata.add("Richards");
		empdata.add(25);
		empdata.add("m");
		empdata.add(50000.50);
		empdata.add(true);
		
		System.out.println(empdata.size());
		System.out.println(empdata.get(0));
		System.out.println(empdata.get(1));
		System.out.println(empdata.get(2));
		System.out.println(empdata.get(3));
		System.out.println(empdata.get(4));
		System.out.println(empdata.get(5));

		
	}

}
