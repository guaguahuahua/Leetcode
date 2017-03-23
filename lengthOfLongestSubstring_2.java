package com.xjtuse.easy;

public class lengthOfLongestSubstring_2 {

	public static int lengthOfLongestSubstring(String s){
		
		int max=0,count=0;
		for(int i=0;i<s.length();i++){
			int []table=new int[256];
			count=0;
			for(int j=i;j<s.length();j++){//hash表的制作
				if(table[s.charAt(j)]!=0){
					break;
				}else{
					table[s.charAt(j)]=1;
				}
			}			
			for(int k=0;k<256;k++){//统计hash表非0元素
				if(table[k]!=0){
					count++;
				}
			}
//			System.out.println(count);
			if(max<count){
				max=count;
			}
		}
		System.out.println(max);
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="abcabcbb";
//		String s="bbbbb";
		String s="pwwkew";
		lengthOfLongestSubstring(s);
	}
}
