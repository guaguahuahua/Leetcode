package com.xjtuse.easy;

public class PowerOfTwo_1 {

	//�����㷨��ʹ�ð�λ���������Ϊ�κ�2���ݽ�����һ��1�������Ϊ0
	
	public static boolean isPowerOfTwo(int x){
		
		int count=0;
		for(int i=0;i!=32;i++){
			count+=x&1;//�жϸ�λ�Ƿ�Ϊ1����λ���ʱ��1�������Ҷ����⣬����0�����ԣ����һ���������Ҷ�Ϊ1����ô���Ϊ1������Ϊ0
			System.out.println(count);
			x=x>>1;//���ƣ�
		}
		System.out.println(count);
		return count==1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		boolean result=isPowerOfTwo(x);
		System.out.println(result);
	}

}
