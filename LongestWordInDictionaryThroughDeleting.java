package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class LongestWordInDictionaryThroughDeleting {
	//算法思想，并通过两层for循环来寻找比较串
	public static String findLongestWord(String s, List<String> d){
		
		String r="";
		for(String K:d){//遍历所有的字典元素
			
			//可以两边一起遍历，暂时先做成一边开始的
			int j=0;//标记字典单词是否存在于s中
			for(int i=0;i<s.length();i++){
				if(j<K.length() && s.charAt(i)==K.charAt(j)){
					j++;
				}
			}
			if(j==K.length()){//j==K.length说明 单词的所有位均被遍历过，如果s中存在字典单词，那么比较谁长，将长单词保存在r
				if(r!=""){
					if(K.length()>r.length()){//如果K长度大于r，直接赋值
						r=K;
					}else if(K.length()==r.length()){ //长度相等时候，那么比较字典序
						r=r.charAt(0)>K.charAt(0)?K:r;
					}
				}else{//当r为空时候，直接比较字符串长度，不比较字典序
					r=K.length()>r.length()?K:r;//原始判断
				}
				
			}
		}
		System.out.println(r);
		return r;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> d=new ArrayList<String>();
//		d.add("ale");
//		d.add("apple");
//		d.add("monkey");
//		d.add("plea");
		
//		d.add("a");
//		d.add("b");
//		d.add("c");
		
		d.add("m");
		d.add("n");
		d.add("o");
		String s="abpcplea";
		
//		d.add("ba");
//		d.add("ab");
//		d.add("a");
//		d.add("b");
//		String s="bab";
		findLongestWord(s,d);
	}

}
