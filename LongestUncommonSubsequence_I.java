package com.xjtuse.easy;

public class LongestUncommonSubsequence_I {

	public static int findLUSlength(String a,String b){
		
		
		if(a.length()==0 || b.length()==0){//如果其中一个字符串为空串，那么直接退出；
			return a.length()==0?b.length():a.length();
		}
		int []table=new int[26];//使用hash表实现
		int negative=0,positive=0;//分别统计正数和负数
		for(int i=0;i<a.length();i++){//第一个字符串写表
			table[a.charAt(i)-'a']++;
		}
		for(int i=0;i<b.length();i++){
			table[b.charAt(i)-'a']--;
		}
		for(int i=0;i<table.length;i++){//统计hash表中字符分布情况
			if(table[i]<0){
				negative+=table[i];
			}
			if(table[i]>0){
				positive+=table[i];
			}
		}
		if(negative==0 && positive==0){//"aaa" "aaa"的这类测试用例
			return -1;
		}
		return (-negative)>positive?(-negative):positive;//返回最长的子串
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a="aba";
//		String b="cdc";
//		String a="avl";
//		String b="alavmling";
		String a="aaa";
		String b="aaa";
		int r=findLUSlength(a,b);
		System.out.println(r);
	}

}
