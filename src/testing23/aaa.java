package testing23;

import java.util.ArrayList;

public class aaa 
{
	public static void main(String[] args)
	{
		ArrayList<String> carlist = new ArrayList<>();
		
		carlist.add("BMW");
		carlist.add("Audi");
		carlist.add("Honda");
		
		int count = carlist.size();
		System.out.println("count of element :"+count);
		
		System.out.println(carlist.get(0));
		System.out.println(carlist.get(1));
		System.out.println(carlist.get(2));
		
		
	}
	

} 
