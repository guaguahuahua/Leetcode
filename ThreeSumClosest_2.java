package com.xjtuse.easy;

import java.util.Arrays;

public class ThreeSumClosest_2 {
	//这个算法的问题就是要求的是最接近的值而非最小的距离，因此，到最后就会求的最小的距离，
	//但是这不是题目要求的，通过最小的距离和target是无法求得的，因为最终将无法确定最小距离是位于点的左侧还是右侧，左侧为- 右侧为 +
	public static int threeSumClosest(int []nums, int target){
		
		Arrays.sort(nums);
		int delta=0,delta1=Math.abs(nums[0]+nums[1]+nums[2]-target),min=0;
		for(int i=0;i!=nums.length-2;i++){
			for(int left=i+1,right=nums.length-1;left<right;){
				delta=Math.abs(nums[i]+nums[left]+nums[right]-target);
				if(delta==0){
					return nums[i]+nums[left]+nums[right];
				}else if(nums[i]+nums[left]+nums[right]-target<0){
					while(left<right && nums[i]+nums[left]+nums[right]-target<0){
						left++;
					}
					
					if(delta<delta1){
						delta1=delta;
						min=nums[i]+nums[left]+nums[right];
					}
//					left++;
				}else if(nums[i]+nums[left]+nums[right]-target>0){
					while(left<right && nums[i]+nums[left]+nums[right]-target>0){
						right--;
					}
					
					if(delta<delta1){
						delta1=delta;
						min=nums[i]+nums[left]+nums[right];
					}
//					right--;
				}
			}
		}
//		System.out.println(delta1+target);
		System.out.println("min:"+min);
		return delta1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={-1,2,1,-4};//1
//		int []nums={0,0,0};//1,0
//		int []nums={0,1,2};//3
//		int []nums={1,1,-1,-1,3};//-1
		int target=1;
		int r=threeSumClosest(nums,target);
		System.out.println("r:"+r);
	}
}
