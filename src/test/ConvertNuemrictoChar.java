package test;
public class ConvertNuemrictoChar {
		
public static void convertNuemrictoChar(String s)	{
	for (int i=0;i<s.length();i++) {
		
		if (Character.isAlphabetic(s.charAt(i))) {
			
			System.out.print(s.charAt(i));
		}
		else {
			int a=Character.getNumericValue(s.charAt(i));
			for (int j=1;j<a;j++) {
				System.out.print(s.charAt(i-1));
			}
		}
	}

	}

public static void main(String[] args) {
	String str="a3b4c5";
	convertNuemrictoChar(str);
	
}
}