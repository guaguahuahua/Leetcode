package com.xjtuse.easy;

import java.util.Arrays;

public class RotateArray {
	//���ַ���ת��Ϊ�ַ���ʱ�����������Ԫ���Ǹ�������ô�ᵼ�´���
	public static void rotate(int []nums,int k){
		String r1="";//������ת��Ϊ�ַ�������
		for(int i=0;i<nums.length;i++){
			r1=r1+nums[i]+"";
		}
		k=k%nums.length;
		System.out.println(k);
//		System.out.println(r1.length());
		String r2=r1.substring(k+1,nums.length);
		System.out.println("r2:"+r2);
		String r3=r1.substring(0,k+1);
		System.out.println("r3:"+r3);
		String r4=r2.concat(r3);
		System.out.println(r4);
		//���ַ������ת��Ϊ����
		for(int i=0;i<r4.length();i++){
			nums[i]=r4.charAt(i)-'0';
		}
		//test
		for(int j:nums){
			System.out.print(j+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,2,3,4,5,6,7};
//		int k=3;
		int []nums={-1};
		int k=2;
		rotate(nums,k);
	}

}
