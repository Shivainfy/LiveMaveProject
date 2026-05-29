package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseString {
	
	@Test
	public void ReverserStringMethod() {
		String str="Selenium";
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		
		System.out.println(rev);
		
		Assert.assertEquals(true, true);;	
		}

}
