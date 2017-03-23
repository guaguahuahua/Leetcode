package com.xjtuse.easy.Leetcode;

public class AddBinary {

	public static String addBinary(String a, String b){
		
		String result="";
		int len_a=a.length(),len_b=b.length();
		int sum=0;
		while(len_a>0 || len_b>0){//当有一个串不为空时，一直进行计算，直到所有串为空
			sum/=2;//这块是为了保证进位
			if(len_a>0){
				sum+=a.charAt(len_a-1)-'0';
				len_a--;
			}
			if(len_b>0){
				sum+=b.charAt(len_b-1)-'0';
				len_b--;
			}
			result=sum%2+result;//二进制当然对2取余
		}
		if(sum/2==1){//这块是为了防止最后的计算溢出，比如 1111 和 1
			result='1'+result;
		}
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="11111";
		String b="1";
		System.out.println(Math.sqrt(10));
		addBinary(a,b);
	}

}
