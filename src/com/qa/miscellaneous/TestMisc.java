package com.qa.miscellaneous;

public class TestMisc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome p=new palindrome();
		p.checkPalindrome("aabbag");
		
		firstRepeatedCharacter fp=new firstRepeatedCharacter();
		fp.checkFirstRepeatedChar("abvcfbtyda");
		
		firstNonrepeatedCharacter obj=new firstNonrepeatedCharacter();
		obj.firstunique("abacvbfdcggty");
	}

}
