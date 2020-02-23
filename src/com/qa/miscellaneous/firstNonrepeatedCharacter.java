package com.qa.miscellaneous;

import java.util.HashMap;

public class firstNonrepeatedCharacter {
	public void firstunique(String S) {
		int len=S.length();
		HashMap<Character,Integer> seen=new HashMap<Character,Integer>();
		int i=0;
		for(i=0;i<len;i++) {
			if(!seen.containsKey(S.charAt(i)))
				seen.put(S.charAt(i), 1);
			else
				seen.put(S.charAt(i),seen.get(S.charAt(i))+1);
			}	
		for(i=0;i<len;i++) {
			if(seen.get(S.charAt(i))==1) {
				System.out.println(S.charAt(i)+" is the first non repearting character");
				break;
			}
		}
	}

}
