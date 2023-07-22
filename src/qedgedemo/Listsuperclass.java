package qedgedemo;

import java.util.ArrayList;
import java.util.List;

public class Listsuperclass {
	public static void main(String[] args) {
		
		List<String> carlist = new ArrayList<>();
		
		carlist.add("car1");
		carlist.add("car2");
		carlist.add("car3");
		carlist.add("car4");
		
		for(String car : carlist)
		{
			System.out.println(car);
		}
		
	}

}
