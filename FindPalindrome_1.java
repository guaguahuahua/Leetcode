package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class FindPalindrome_1 {
//使用这种list不能解决，因为只要是偶数出现的非对称字符串都可以通过条件
	public static List<List<Integer>> palindromePairs(String []words){
		List<List<Integer>>out=new ArrayList<List<Integer>>();
		List <Character>judge=new ArrayList<Character>();
		for(int i=0;i!=words.length;i++){
			
			for(int j=0;j!=words.length;j++){
				List<Integer>in=new ArrayList<Integer>();
				if(i==j){
					continue;
				}
				String t=words[i]+words[j];
				for(int k=0;k!=t.length();k++){
					if(judge.contains(t.charAt(k))){
						judge.remove((Character)t.charAt(k));
					}else{
						judge.add(t.charAt(k));
					}
				}
				if(judge.size()==1 ||judge.size()==0){
					in.add(i);
					in.add(j);
					out.add(in);
				}
				judge.clear();
			}
		}
		System.out.println(out);
		return out;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String []words ={"bat","tab", "cat"};
		String []words = {"abcd", "dcba", "lls", "s", "sssll"};
//		String []words={"a","abc","aba",""};
		palindromePairs(words);
	}

}
