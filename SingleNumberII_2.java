package com.xjtuse.easy;

public class SingleNumberII_2 {

	public static int singleNumber(int []nums){
		int length=nums.length;
		int count;//count elements appeared times 
		int x;
		int result=0;
		for(int i=0;i!=32;i++){//int type has 4B==32bit;
			count=0;
			x=1<<i;
			for(int j=0;j!=length;j++){
				int temp=x & nums[j];
				if(temp>0){
					count++;
				}
			}
			if(count%3==0){
				result|=x;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={-1,2,1,2,3,-1,1,3,6,1,3,2,-1};
		int r=singleNumber(nums);
		System.out.println(r);
	}

}
