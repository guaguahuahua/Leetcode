package com.xjtuse.easy;

public class NthDigit {
	//朴素想法：使用StringBuffer 方法不断的追加字符串，直到满足n为止。
	//然后再使用get方法，得到对应的字符
	//想法可以，但是超时溢出，太慢
	public static int findNthDigit(int n){
		
		StringBuffer sb=new StringBuffer();
		for(int i=1;i<=n;i++){
			sb.append(i);
		}
		System.out.println(sb);
		System.out.println(sb.charAt(n-1));
		return sb.charAt(n-1)-48;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		findNthDigit(n);
	}

}
