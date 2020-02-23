package com.qa.miscellaneous;

import java.util.HashSet;

public class firstRepeatedCharacter {
	public void checkFirstRepeatedChar(String S) {
		int i;
		HashSet<Character> seen=new HashSet<Character>();
		for(i=0;i<S.length();i++) {
			if(seen.contains(S.charAt(i)))
			break;	
			else 
				seen.add(S.charAt(i));
		}
		System.out.println(S.charAt(i));	
	}

}
