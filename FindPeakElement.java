package com.xjtuse.easy;

public class FindPeakElement {
	public static int findPeakElement(int []nums){

		int len=nums.length;
		if(len==1){
			return 0;
		}
		if(nums[len-1]>nums[len-2]){//the right end
			return len-1;			
		}
		if(nums[0]>nums[1]){//the left end 
			return 0;
		}
		int i=0;
		for(int j=1;j<nums.length;j++){//the middle part
			if(nums[i]<nums[j]){
				i=j;
				j++;
				if(nums[i]>nums[j]){
					return i;
				}
				j--;//if not return ,there'll be an extra plus on j,
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,2,3,1};
//		int []nums={1,2,3,4};
//		int []nums={3};
		int []nums={1,2};
		int r=findPeakElement(nums);
		System.out.println(r);
	}

}
