package com.xjtuse.easy;

public class ValidPerfectSquare_1 {

	//�㷨�����ٶȺ��������У���һ�����ַ����ƽ�������㷨��
	public static boolean isPerfectSquare(int num){
		
		int i;
		for(i=0;i*i<num;i++){
		}
		System.out.println(i*i);
		return i*i==num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		boolean r=isPerfectSquare(n);
		System.out.println(r);
	}

}
