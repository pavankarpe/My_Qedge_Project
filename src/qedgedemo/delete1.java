package qedgedemo;

import java.util.ArrayList;

public class delete1 {

	public static void main(String[] args) {
		
		ArrayList<String> carlist = new ArrayList<>();
		carlist.add("BMW");
		carlist.add("Audi");
		carlist.add("Honda");
		carlist.add("Maruti");
		int count = carlist.size();
		System.out.println("count of the element :"+count);
		
		System.out.println(carlist.get(0));
		System.out.println(carlist.get(1));
		System.out.println(carlist.get(2));
		System.out.println(carlist.get(3));
		
		carlist.set(0,"Tesla");
		System.out.println("after replacing");
		System.out.println(carlist.get(0));
		
		carlist.remove(3);
		System.out.println(carlist.size());
		
		System.out.println(carlist.contains("Audi"));
		
	}

}
