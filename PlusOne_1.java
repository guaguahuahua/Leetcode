package com.xjtuse.easy;

public class PlusOne_1 {
	//�����Ľ��������Ψ����̵Ķ���������⣬�����������ŵķ�����
	public static int[] plusOne(int []nums){
		for(int i=nums.length-1;i>=0;i--){
			if(nums[i]<9){
				nums[i]++;
				return nums;//ֻҪ�Ǹ�λ����С��9�ģ���ôֻҪ��λ��һ�������
			}
			nums[i]=0;//������һλ��С��9����ô���Ƿ����˽�λ��
		}
		int []newNums=new int[nums.length+1];
		newNums[0]=1;
		return newNums;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums={1,9};
		int []result=plusOne(nums);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]);
		}
		System.out.println();
	}

}
