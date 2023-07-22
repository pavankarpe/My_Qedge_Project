package testing23;

import java.util.Arrays;
import java.util.Collections;

public class arraysort {
	public static void main(String[] args) {
	
		Integer[]array = {1,4,6,7,8,0,2,3,9,};
		// applying the sort method over the above array
		//passing the argument 
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("Modified arr[] :" + Arrays.toString(array));
		
	}

}
