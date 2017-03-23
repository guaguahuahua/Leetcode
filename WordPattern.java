package com.xjtuse.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	//思路：将两个串转化为同一种形式，比如说两个数组，只要数组中所有元素均相等，那么认为两个串匹配
	public static boolean wordPattern(String pattern,String str){
		String[] sp=str.split(" "); //split str into parts
		if(sp.length!=pattern.length()){// judge length
			return false;
		}
		int length=sp.length;
		byte []tablep=new byte[length];//transform the two string into the same pattern:array
		byte []tables=new byte[length];
		byte k=1;
		for(int i=0;i!=length;i++){
			char t=pattern.charAt(i);
			String te=sp[i];
			for(int j=i;j!=length;j++){
				if(pattern.charAt(j)==t){
					if(tablep[j]==0){
						tablep[j]=k;
					}	
				}
				if(sp[j].equals(te)){
					if(tables[j]==0){
						tables[j]=k;
					}
				}
			}
			k++;
		}
		
		for(int K:tablep){
		System.out.print(K+"　");
		}System.out.println();
		for(int K:tables){
		System.out.print(K+"　");
		}

		for(int i=0;i!=length;i++){//if two arrays are not same,the two strings are not same 
			if(tables[i]!=tablep[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		String pattern="abba";
//		String str="dog cat cat dog";
//		String str= "dog cat cat fish";
		String str = "dog cat cat dog";
//		String str = "dog dog dog dog";
		boolean r=wordPattern(pattern,str);
		System.out.println(r);	
		
	}
}
//for(String K:sp){
//System.out.print(K+"　");
//}System.out.println();

//for(int K:tablep){
//System.out.print(K+"　");
//}System.out.println();
//for(int K:tables){
//System.out.print(K+"　");
//}
//Map<Character,String> map=new HashMap<Character,String>();
//String []sp=str.split(" ");
//if(pattern.length()!=sp.length){
//	return false;
//}
//int length=sp.length;
//for(int i=0;i!=length;i++){
//	if(!map.containsKey(pattern.charAt(i))){
//		map.put(pattern.charAt(i), sp[i]);
//	}else{
//		if(map.get(pattern.charAt(i)).equals(sp[i])){
//			continue;
//		}else{
//			return false;
//		}
//	}
//}
//return true;
