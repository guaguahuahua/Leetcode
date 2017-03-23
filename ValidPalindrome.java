package com.xjtuse.easy;

public class ValidPalindrome {

	public static boolean isPalindrome(String s){
		
		if(s.length()==0){
			return true;
		}
		int l=0,r=s.length()-1;
		char cr,cl;
		while(l<=r){
			cl=s.charAt(l);
			cr=s.charAt(r);
			if(!('A'<=cl && cl<='Z') && !('a'<=cl && cl<='z') && !('0'<=cl && cl<='9')){
				l++;
				continue;
			}
			if(!('A'<=cr && cr<='Z') && !('a'<=cr && cr<='z') && !('0'<=cr && cr<='9')){
				r--;
				continue;
			}
			//大写的字符转化为小写的形式
			if(cl<97){
				cl+=32;
			}
			if(cr<97){
				cr+=32;
			}
			if(cr!=cl){
				System.out.println(false);
				return false;
			}
			l++;
			r--;
		}
		System.out.println(true);
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="A man, a plan, a canal:Panama";
//		String s="race a car";
//		String s="0P";
		String s="ab2a";
		boolean r=isPalindrome(s);
		System.out.println(r);
	}
}
