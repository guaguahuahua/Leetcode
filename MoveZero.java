package com.xjtuse.easy;

public class MoveZero {
	//�㷨˼�룺����0Ԫ�أ�ֱ�ӽ���0Ԫ�ش�����Ŀ�ʼ��β���ΰڷţ���i���Ժ������Ԫ����Ϊ0�������
	public static void moveZeroes(int []nums){
		int i=0;//�����α�
		for(int j=0;j<nums.length;j++){//�����α�
			if(nums[j]!=0){
				nums[i++]=nums[j];
			}
		}
		//�������֮��ʼ�ӷ���Ԫ�غ��濪ʼ������Ԫ��
		for(;i<nums.length;i++){
			nums[i]=0;
		}
		//���Զ�
		for(int k:nums){
			System.out.print(k+" ");
		}
	}
	//Ҫ�󣺣���Ҫ���Ƴ�����һ�����������ֻ��ԭ����������в���������Ҫ�����ƶ��Ĳ�������������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={0,1,0,3,12};
		int []nums={5,8,7,10};
		moveZeroes(nums);
	}

}
