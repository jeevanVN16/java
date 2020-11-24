package Playground;

public class RemoveAnycharfromString {

	public static void main(String[] args) {
		String s = "Iamgood$Boy";
		
		//Replacing with Null
		String replacedString = s.replace("$", "");
		System.out.println(replacedString);
		
		//using Index and delete with stringbuffer/builder
		
		StringBuilder sb = new StringBuilder("Iamgood$Boy");
		StringBuilder deleteCharAt = sb.deleteCharAt(7);
		System.out.println(deleteCharAt);
		
		
		//using array
		String s1 = "Iamgood$Boy";
		char[] charArray = s1.toCharArray();
		System.out.println(charArray[0]+""+charArray[1]+""+charArray[2]+""+charArray[3]+""+charArray[4]+""+charArray[5]+""+charArray[6]+""+charArray[8]+""+charArray[9]+""+charArray[10]);
		
		//Use regeular expression
		
		String s2="Iamgood$Boy";
		System.out.println(s2.replaceAll("[^a-zA-Z]",""));
		
				
	}

}
