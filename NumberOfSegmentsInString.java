package com.xjtuse.easy;

public class NumberOfSegmentsInString {
	//第一个想法是直接使用正则表达式split完成
	public static int countSegments(String s){
		
		if(s.length()==0){
			return s.length();
		}
		String [] tmp=("x "+s).split("\\s+");//使用空格将字符串分割成多个独立的单词
//		for(int i=0;i<tmp.length;i++){
//			System.out.println(tmp[i]);
//		}
		return tmp.length-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="hello my name is john";
		String s=", , , ,        a, eaefa";
//		String s="    foo    bar";
		int r=countSegments(s);
		System.out.println(r);
		
	}

}
