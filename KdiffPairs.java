package com.xjtuse.easy;

import java.util.Arrays;

public class KdiffPairs {
	
	//�����뷨�ǽ�����������������������С�Ŀ�ʼһ�����һ��������kֵ����ôѸ�٣���ͷ��ʼ������
	public static int findPairs(int []nums, int k){
		
		Arrays.sort(nums);
		int compare,count=0;
		
		for(int j=0;j<nums.length-1;){
			
			if(nums[j]==nums[j+1]){
				j+=1;
				continue;
			}
			compare=nums[j];
//			System.out.println("compare:"+compare);
			for(int i=j+1;i<nums.length;i++){
				if(nums[i]-compare==k){
					count++;
				}
			}
			j++;
		}
		//k==0
		int i=0;
		for(int j=1;j<nums.length;){
			if(nums[i]==nums[j]){
				j++;
				continue;
			}else{
				count++;
			}
			i=j;
			j++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={3,1,4,1,5};
//		int []nums={1,2,3,4,5};
//		int []nums={1,1,1,2,1};
		findPairs(nums, 0);
	}

}
