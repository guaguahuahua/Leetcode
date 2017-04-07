package com.xjtuse.easy;

public class LongestPalindromicSubstring_3 {
/*	算法来自leetcode社区，不从两端寻找对应相同的字符，而是从字符串出发寻找，“对于每个字符，判断它两侧的字符是不是对称的，”
 * 如果是，则记录，否则判断下个字符，这样就减少了一层循环，非常快速
 */
	private static int l=0;
	private static int r=0;
	public  static String longestPalindrome(String s) {
		
		if(s=="" || s.length()==1){//只有一个字符或者空串时，直接返回本身
			return s;
		}
		int start,left,right;
		for(start=0;start<s.length();start++){//start指针可以遍历所有的字符
			right=start+1;
			left =start-1;//获得该字符两侧指针
			judgePalindrome(s,left,right);
			judgePalindrome(s,start,start+1);//解决cbbc这种情形，前面的从字符两侧开始无法检测到这种可能性
		}
		return s.substring(l,r+1);
	}
	
	public static void judgePalindrome(String s,int left,int right){
		while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right)){//判断字符是否越界，并且两侧字符要想等
			left--;
			right++;//不断的将两侧的指针向两边扩散
		}
		left++;
		right--;
		if(left>=0 && right<=s.length()-1 && (right-left)>(r-l)){//如果新的字符串比之前的串要长，那么用新串代替旧串
//			result=s.substring(left,right+1);
			l=left;
			r=right;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="banana";
//		String s="babad";
//		String s="string";
//		String s="cbbd";
//		String s="";
//		String s="a";
//		String s="babadada";
		String s="bb";
		String r=longestPalindrome(s);
		System.out.println(r);
	}
}
