package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class KeyBoardRow {

	public static String[] findWords(String[] words){
		String s1="qwertyuiop",s2="asdfghjkl",s3="zxcvbnm";
		List<String> list=new ArrayList<String>();
		int count1=0,count2=0,count3=0;
		for(int i=0;i!=words.length;i++){
			for(int j=0;j!=words[i].length();j++){
				if(s1.indexOf(words[i].toLowerCase().charAt(j))!=-1 ){
					count1++;
				}
				if(s2.indexOf(words[i].toLowerCase().charAt(j))!=-1){
					count2++;
				}
				if(s3.indexOf(words[i].toLowerCase().charAt(j))!=-1){
					count3++;
				}
			}
			if(count1==words[i].length() || count2==words[i].length() || count3==words[i].length()){
				list.add(words[i]);
			}
			count1=0;
			count2=0;
			count3=0;
		}
		//output 
		for(String K:list.toArray(new String[0])){
			System.out.print(K+" ");
		}
		return list.toArray(new String[0]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []words={"Hello","Alaska","Dad","Peace"};
		findWords(words);
//		String s="asdfghjkl";
//		System.out.println(s.contains("alaska"));
	}

}
