package com.xjtuse.easy;

public class ValidParentheses_1 {

	public static boolean isValid(String s){
		
		char []original=s.toCharArray();//转化 为字符串处理
		char []writein=new char[original.length];//写入一个新字符数组
		int pointer=0; //用来控制写入以及对比位置
		for(int i=0;i!=original.length;i++){//当碰到括号的一半的时候，写入括号的另一半
			if(original[i]=='('){
				writein[pointer++]=')';
			}else if(original[i]=='['){
				writein[pointer++]=']';
			}else if(original[i]=='{'){
				writein[pointer++]='}';
				//指针后移到最后写入位置，如果当前的括号和写入的不相同，说明不匹配。画画就出来了。
			}else if(pointer==0 || writein[--pointer]!=original[i]){
				//pointer主要是针对开始给定的)]}这种情形，如果直接--pointer会出现溢出
				System.out.println(false);
				return false;
			}
		}
		//当所有的括号都匹配上的时候，pointer又会回到原位，
		System.out.println(pointer==0);
		return pointer==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="()[]{}";
//		String s="(]{}";
//		String s="([)]";
//		String s="{";
//		String s="";
		String s="}";
		isValid(s);
	}

}
