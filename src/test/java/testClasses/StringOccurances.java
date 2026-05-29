package testClasses;

import java.util.HashMap;

public class StringOccurances {

	public static void main(String[] args) {
		String str="Selenium";
		
		char ch[]=str.toCharArray();
		
		HashMap<Character, Integer> chararray = new HashMap<Character, Integer>();
		
		for(Character c:ch) {
			if(chararray.containsKey(c)) {
				chararray.put(c, chararray.get(c)+1);
			}else {
				chararray.put(c, 1);
			}
			
		}
		System.out.println(chararray);
	}

}
