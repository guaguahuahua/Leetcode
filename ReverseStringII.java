package com.xjtuse.easy;

public class ReverseStringII {
	//算法思想来自于leetcode社区，
	public static String reverseStr(String s,int k){
		StringBuffer sb=new StringBuffer();//用来存放结果
		int start=0,end;
		while(start<s.length()){
			//前k个元素进行逆置
			end=start+k>s.length()?s.length():start+k;//对于前k个需要逆置的元素，如果超出了字符长度，那么直接取字符长度为逆置的对象
			sb.append(new StringBuffer(s.substring(start,end)).reverse());
			if(end>=s.length()){//如果前面k个元素，就是整个字符串的长度，那么逆置结束，退出。
				break;
			}
			start=end;//将开始指针向后移动到k位置，
			end=start+k>s.length()?s.length():start+k;//从上次的断点处，重新取k个元素
			sb.append(s.substring(start,end));
			start=end;
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="abcdefg";
		String s="ab";
		int k=2;
		String r=reverseStr(s,k);
		System.out.println(r);
//		StringBuffer sb=new StringBuffer();
//		System.out.println(sb.append(s).reverse());
	}

}
