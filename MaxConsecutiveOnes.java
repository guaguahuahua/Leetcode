package com.xjtuse.easy;

public class MaxConsecutiveOnes {
	//ֻ��¼Ԫ��Ϊ1��ʱ���ۼӵĳ��ȣ�����Ķ����ܡ�
	public static int findConsecutiveOnes(int []nums){
		int i=0;
		int length=0;
		int max=0;
		while(i<nums.length){
			if(nums[i]==0){//���Ϊ�㣬��ôֱ�ӽ����ȸ�ֵ��max�����������
				max=max>length?max:length;
				length=0;
				i++;
				continue;
			}
			if(nums[i]==1){//���Ϊ1����ô�������ӣ��α�����
				i++;
				length++;
			}
		}
		return max>length?max:length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={1,1,0,0,1,1,1,1};
		int max=findConsecutiveOnes(nums);
		System.out.println(max);
	}

}
