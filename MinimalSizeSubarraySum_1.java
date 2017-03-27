package com.xjtuse.easy;

public class MinimalSizeSubarraySum_1 {

	public static int minSubArrayLen(int s, int []nums){
		
		int i=0,j=0;//两个游标
		int min=Integer.MAX_VALUE;//初始化最小长度
		int total=0;//求和对比项
		while(j<nums.length){//使用slide window 进行实现
			if(total<s){//当不满足条件的时候，不断的求和
				total+=nums[j];
				j++;
			}
			while(total>=s){//滑窗动作,不断的移动左端的边，在满足条件下，不断靠近右侧
				min=(j-i)<min?(j-i):min;//重置min值
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
