package com.xjtuse.easy.Leetcode;

public class AddBinary {

	public static String addBinary(String a, String b){
		
		String result="";
		int len_a=a.length(),len_b=b.length();
		int sum=0;
		while(len_a>0 || len_b>0){//����һ������Ϊ��ʱ��һֱ���м��㣬ֱ�����д�Ϊ��
			sum/=2;//�����Ϊ�˱�֤��λ
			if(len_a>0){
				sum+=a.charAt(len_a-1)-'0';
				len_a--;
			}
			if(len_b>0){
				sum+=b.charAt(len_b-1)-'0';
				len_b--;
			}
			result=sum%2+result;//�����Ƶ�Ȼ��2ȡ��
		}
		if(sum/2==1){//�����Ϊ�˷�ֹ���ļ������������ 1111 �� 1
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
