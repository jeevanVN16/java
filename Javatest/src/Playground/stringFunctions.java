// This class deals all about string functions
public class stringFunctions {
	
	public static void main(String[] args) {
		
		//Initializing String in two types
	String s1= "Dell";
	String s2="Laptop";                // This is string literal method
	String s3= new String ("Model");   // This is using new keyword
	String s4= new String ("");
	
	String s5= new String ("Model");
	String s6= new String ("MODEL");
	
	//String length
	System.out.println( "Lenght of string one is : \t"  + s1.length());
	
	
	//string compare- Doesnt return Boolean - compares and returns +ve or -ve number or 0 
	System.out.println( "Compare output of two string is: \t"  + s1.compareTo(s2));
	
	//string Concat
	System.out.println( "Joined two string is: \t"  + s1.concat((s2)));
	
	
	//string Lower case 
	System.out.println( "Lower case of string is:\t"  + s1.toLowerCase());
	
	//string Upper case  
	System.out.println( "upper case of string is:\t"  + s1.toUpperCase());
	
	
	//string replace
	System.out.println( "replace char in string: \t"  + s1.replace('l','z'));
	
	//string contains
	System.out.println( "contains func: \t"  + s1.contains(s2));
				
	//string empty function
	System.out.println( "String is empty ? "   +s4.isEmpty());
	
	//string EqualsignoreCase function, Returns boolean
	System.out.println( "String is Equal ? "   +s5.equalsIgnoreCase(s6));
	
	//string Equals function, Returns boolean
	System.out.println( "String is Equal ? "   +s5.equals(s6));
	
	//string Trim function
		String trimString= "Model    ";
	String trimString1= "  Model    ";
	System.out.println( "Trim functions removes the spaces \t"
	+trimString.trim() + "\t" +trimString1.trim());
	
	
	//function "Value of" is used to concatenate
	String s9=String.valueOf(5); 
	System.out.println("Value of \t" +s9+10);
	
	
	//Function toCharArray()
	String s10="HP Laptop";
	char[] laptopType=s10.toCharArray();
	for(int i=0;i<laptopType.length;i++){
			System.out.print( laptopType[i]);
		} 
	System.out.print( "\n" + laptopType[4]);
	
	//Function StringGetBytes()
	byte[] byte1="Sachin".getBytes();
	for(int i=0;i<byte1.length;i++){ 
		System.out.println("\t" + byte1[i]);
		}

	//String functions endswith() 
	System.out.println("Ends with given substring ?" +s1.endsWith("l") +"\t" + s1.endsWith("M"));
	
	
	}

}
