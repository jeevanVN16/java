package Playground;

public class ReverseString {

	public static void main(String[] args) {
		String original="Jeevan";
		String reverse="";
		int length = original.length();
		for(int i=length-1;i>=0;i--) {
			reverse= reverse+original.charAt(i);
			
		}
		System.out.println("reverse String= "+reverse );
		//Check For Plandrome
		if(original.equals(reverse)) {
		System.out.println("Given string is Palindrome");
		}
		else {
        System.out.println("Given string is not Palindrome");			
		}
	}

}
