package testing23;

public class TestStringFormatter {
	public static void main(String[] args) {
		
	
	
	String str= "ABCD";
	String rev="";
	
	int len=str.length(); ///4
	
	for(int i=len-1;i>=0;i--)//
	{
		rev=rev+str.charAt(i);//DBCA
	}
	System.out.println("Reverse string is:"+rev);
}
}

	
