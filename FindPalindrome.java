package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class FindPalindrome {
	//可以使用list.add list.remove两个函数，最后判断最后的list是否只有一个元素，
	//算法可以，超时溢出
	public static List<List<Integer>> palindromePairs(String []words){
		
		List<List<Integer>>out=new ArrayList<List<Integer>>();
		for(int i=0;i!=words.length;i++){
			
			for(int j=0;j!=words.length;j++){
				List<Integer>in=new ArrayList<Integer>();
				if(i==j){
					continue;
				}
				String s=words[i].charAt(0)+"";
				if(!words[j].endsWith(s) ){
					continue;
				}
				
				String t=words[i]+words[j];
				int l=0,r=t.length()-1;
				boolean flag=true;
				while(l<=r){//judging is palindrome or not
					if(t.charAt(l)==t.charAt(r)){
						l++;
						r--;
						continue;
					}else{
						flag=false;
						break;
					}
				}
				if(flag){
					in.add(i);
					in.add(j);
					out.add(in);
				}
			}
		}
		System.out.println(out);
		return out;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String []words ={"bat","tab", "cat"};
//		String []words = {"abcd", "dcba", "lls", "s", "sssll"};
//		String []words={"a","abc","aba",""};
		String []words={"a",""};
		palindromePairs(words);
		
//		String t1=words[0].substring(0, 0);
//		String t2=words[0].substring(0);
//		System.out.println(t1+" \t"+t2);
	}

}
