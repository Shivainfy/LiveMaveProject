package testClasses;

import java.util.HashMap;

import org.testng.annotations.Test;

public class StringOccurances {
	

@Test
	public void PrintingStringChar() {
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
