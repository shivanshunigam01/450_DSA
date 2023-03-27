package Strings;

public class Special_char {
 
    
class GFG1 {

	
	static String moveAllSC(String str)
	{
		
		int len = str.length();

		String regx = "[a-zA-Z0-9\\s+]";

		// traverse string
		String res1 = "", res2 = "";
		for (int i = 0; i < len; i++) {
		
			char c = str.charAt(i);

			// check char at index i is a special char
			if (String.valueOf(c).matches(regx))
			res1 = res1 + c;
			else
			res2 = res2 + c;
		}
		return res1 + res2;
	}

	public static void main(String args[])
	{
		String str = "He-l-low-@world";
		System.out.println(moveAllSC(str));
	}


}

}