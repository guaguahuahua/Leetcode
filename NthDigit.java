package com.xjtuse.easy;

public class NthDigit {
	//�����뷨��ʹ��StringBuffer �������ϵ�׷���ַ�����ֱ������nΪֹ��
	//Ȼ����ʹ��get�������õ���Ӧ���ַ�
	//�뷨���ԣ����ǳ�ʱ�����̫��
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
