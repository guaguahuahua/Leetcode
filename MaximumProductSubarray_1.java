package com.xjtuse.easy;

public class MaximumProductSubarray_1 {

	public static int maxProduct(int []nums){
		int index=0;//find the last negative nums position
		int count=0;//count the negative appearing times
		int n=nums.length;
		int result=1,M=0;
		
		if(n==1){//if only one element exist
			return nums[0];
		}
		for(int i=0;i<n;i++){
			if(nums[i]<0){
				count++;
				index=i;
			}
			if(nums[i]==0){//if negative numbers appeared times%2==0 then return this array itself multiply
				M=M>result?M:result;
				result=1;
				continue;
			}
			result*=nums[i];
		}
		if(count%2==0){
			return (result>M?result:M);
		}else{//if negative numbers appeared times%2!=0,
			
			int t=1;
			int temp=1,max=1;
			for(int i=index+1;i<n;i++){
				if(nums[i]==0){
					max=max>t?max:t;
					t=1;
					continue;
				}
				t*=nums[i];
			}
			temp=result/(t*nums[index]);
			return (temp>t?temp:t);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={-2};
//		int []nums={-3,-4};
//		int []nums={-5,0,2};
//		int []nums={-5,0,2,3,0,9};
//		int []nums={-2,0,-1};
//		int []nums={-3,0,1,-2};
		int []nums={-3,0,1,-2,-4,-6};
		int r=maxProduct(nums);
		System.out.println(r);
	}

}
