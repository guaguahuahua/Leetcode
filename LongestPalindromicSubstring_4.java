package com.xjtuse.easy;

public class LongestPalindromicSubstring_4 {

//	private static int l=0;
//	private static int r=0;
public  static String longestPalindrome(String s) {
	if(s.length()<=1){
		return s; 
	}
	int l=0,r=0;
	for(int start=0;start<s.length();start++){
		int []tmp=judgePalindrome(s,start,start);// "aba" type palindrome
		int []temp=judgePalindrome(s,start,start+1); // "cbbc" type palindrome
                    // choose the max-length palindrome
		if((tmp[1]-tmp[0])>(temp[1]-temp[0]) ){
			if((tmp[1]-tmp[0])>r-l){
				l=tmp[0];
				r=tmp[1];
			}
		}else{
			if((temp[1]-temp[0])>r-l){
				l=temp[0];
				r=temp[1];
			}
		}
	}
	return s.substring(l,r+1);
}
public static int[] judgePalindrome(String s, int left,int right){
	int l=0,r=0;
	while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
		left--;
		right++;
	}
	if(right-left-1>r-l+1){//reset left and right if find a longer palindrome
		l=++left;
		r=--right;
	}
	int []result={l,r};
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="banana";
//		String s="babad";
//		String s="string";
//		String s="cbbd";
//		String s="";
//		String s="a";
//		String s="babadada";
//		String s="bb";
		String r=longestPalindrome(s);
		System.out.println(r);
	}

}
