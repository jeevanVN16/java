package Playground;


public class stringFunctions {
	
	public static void main(String[] args) {
		
	String s1= "Dell";
	String s2="Laptop";
	
	//String length
	System.out.println( "lenght of string one is:"  + s1.length());
	
	
	//string compare
	System.out.println( "compare output of two string is:"  + s1.compareTo(s2));
	
	//string Concat
	System.out.println( "joined two string is:"  + s1.concat((s2)));
	
	
	//string Lower case 
	System.out.println( "Lower case of string is:"  + s1.toLowerCase());
	
	//string Upper case  
	System.out.println( "upper case of string is:"  + s1.toUpperCase());
	
	
	//string replace
	System.out.println( "replace char in string :"  + s1.replace('l','z'));
	
	//string contains
		System.out.println( "contains func: \t"  + s1.contains(s2));
		
	}

}
