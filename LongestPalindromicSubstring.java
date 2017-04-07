package com.xjtuse.easy;

public class LongestPalindromicSubstring {
	//思想：从两端逐一的对比，如果两端的字符相同，再进入段内对比
	public static String longestPalindrome(String s){
		
		if(s.length()==1 || s.length()==0){
			System.out.println(s);
			return s;
		}
		int start=0,end=s.length()-1;//定义两端的指针
		String r="";
		while(end>start){//每次都比较两个指针所对应的字符，如果相同，那么比较段内，否则start指针后移，当start指针和end指针相遇，end--，start从头开始
			while(start<end){
				if(s.charAt(start)==s.charAt(end)){//如果相等比较段内的字符
					System.out.println(s.substring(start,end+1));//test
					System.out.println(isPalindrome(s.substring(start,end+1)));
					if(isPalindrome(s.substring(start,end+1))){//可能会找到多条回文，但是选择最长的
						if(s.substring(start,end+1).length()>r.length()){
							r=s.substring(start,end+1);
						}						
					}				
				}
				//若不相等end--
				end--;
			}
			start++;
			end=s.length()-1;
		}
		System.out.println(r==""?s.charAt(start)+"":r);
		return r==""?s.charAt(start)+"":r;
	}
	public static boolean isPalindrome(String s){//判断是否为回文
		
		int left=0,right=s.length()-1;
		while(left<=right){
			if(s.charAt(left)!=s.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="banana";
//		String s="babad";
//		String s="string";
//		String s="cbbd";
//		String s="";
//		String s="a";
		String s="babadada";
		longestPalindrome(s);
	}

}
