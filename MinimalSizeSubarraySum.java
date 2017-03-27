package com.xjtuse.easy;
public class MinimalSizeSubarraySum {
	
	public static int minSubArrayLen(int s, int []nums){
		
		if(nums.length==0){
			return 0;
		}
		int i=0;//游标1
		int j=1;//游标2
		int min=2147483647,total=nums[i];
		for(;i<nums.length;){
			if(total<s){//首先判断一个数的时候是否满足条件
				if(j>=nums.length){
					break;
				}
				total+=nums[j];
				j++;
			}else{//如果满足条件，那么判断子列长度，如果子列长度小于之前的长度，重置min，
				int len=j-i;
				min=len<min?len:min;
				i++;//重新开始寻找子列
				if(i<nums.length){
					j=i+1;
					total=nums[i];
//					System.out.println(min);
				}
				
			}
		}
//		System.out.println(min);
		if(min==2147483647){//如果min没有被重置过，那么返回0说明所有的元素之和都无法满足s
			System.out.println(0);
			return 0;
		}
		System.out.println(min);
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={2,3,1,2,4,7};
//		int []nums={7,77,7,7,7,7};
//		int []nums={1,1,1,1,1,1,1};
//		int []nums={1,1,1,1,1};
//		int []nums={};
		int []nums={1,1,7,1,1};
		int s=7;
		minSubArrayLen(s,nums);
	}

}
