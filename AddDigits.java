package com.xjtuse.easy;

public class AddDigits {

	public static int addDigits(int num){
		
		int sum=0;
		while(num/10!=0){
			
			sum=0;
			while(num!=0){//������num�ĸ�λ���ֽ������
				sum+=num%10;
				num/=10;
			}
			num=sum;
		}
		System.out.println(num);
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		addDigits(num);
	}

}
