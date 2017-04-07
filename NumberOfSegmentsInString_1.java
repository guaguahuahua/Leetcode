package com.xjtuse.easy;

public class NumberOfSegmentsInString_1 {

	public static int countSegments(String s){
		
		int word=0;//统计单词的个数
		int space=0;
		if(!s.equals("")){
			for(int i=0;i<s.length();i++){//根据空格来统计字数，如果当前字符是空格并且前一个字符不是空，那么word+1
				
				if((i==0 || s.charAt(i-1)==' ')&& s.charAt(i)!=' '){
					word++;
				}
//				}else if(s.charAt(i)==' '){
//					space++;
//				}
			}
//			return word==0?0:word+1;//这种情况是为了克服下面的情形，防止出现多个空格时返回1，但是针对于“hello”这种不含有空格的用例，就无法通过了
//			if(space==s.length()){//区别全部是空格的串和没有空格的串
//				return 0;
//			}
			return word;//如果使用这种形式那么，如果是由多个空格组成的串，将返回1，结果是0
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="hello my name is john";
//		String s="             ";
//		String s=", , , ,        a, eaefa";
//		String s="    foo    bar";
		String s="hello";
		int r=countSegments(s);
		System.out.println(r);
	}

}
