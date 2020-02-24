package com.qa.miscellaneous;

public class palindrome {
	public void checkPalindrome(String S) {
		String Name;
		int len=S.length();
		int mid=(len-1)/2;
		if(len%2==0) 
			expand(S,mid,mid+1);
		else
			expand(S,mid,mid);
	}
	public static void expand(String S,int left,int right) {
		while(left>=0 && right<S.length() && S.charAt(left)==S.charAt(right)) {
			left--;
			right++;
		}
		if(right-left-1==S.length())
			System.out.println(S+" is palindrome");
		else
			System.out.println(S+" is not a palindrome");
	}
	
}
