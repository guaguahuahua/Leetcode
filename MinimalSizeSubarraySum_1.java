package com.xjtuse.easy;

public class MinimalSizeSubarraySum_1 {

	public static int minSubArrayLen(int s, int []nums){
		
		int i=0,j=0;//�����α�
		int min=Integer.MAX_VALUE;//��ʼ����С����
		int total=0;//��ͶԱ���
		while(j<nums.length){//ʹ��slide window ����ʵ��
			if(total<s){//��������������ʱ�򣬲��ϵ����
				total+=nums[j];
				j++;
			}
			while(total>=s){//��������,���ϵ��ƶ���˵ıߣ������������£����Ͽ����Ҳ�
				min=(j-i)<min?(j-i):min;//����minֵ
				total-=nums[i];
				i++;
			}
		}
		System.out.println(min);
		return min==Integer.MAX_VALUE?0:min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={2,3,1,2,4,7};
//		int []nums={7,77,7,7,7,7};
//		int []nums={1,1,1,1,1,1,1};
//		int []nums={1,1,1,1,1};
//		int []nums={};
//		int []nums={1,1,7,1,1};
		int s=7;
		minSubArrayLen(s,nums);
	}

}
