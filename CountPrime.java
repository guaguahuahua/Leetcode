package com.xjtuse.easy;

public class CountPrime {
	//思想，首先判断某个数是不是素数，如果是，则i++,并且将它的所有倍数置为0
	public static int countPrime(int n){
		int []nums=new int[n];// put all elements int array
		int count=0;//count the numbers of prime number
		if(n<=2){
			return count;
		}
		for(int i=0;i<n;i++){//initiate array
			nums[i]=i;
		}
		for(int j=nums[2],l=2;j*l<n;l++){//set the 2's multiple to zero
			nums[j*l]=0;
		}
		boolean tag=true;
		count=1;
		
		for(int i=3;i<nums.length;i++){//judge and count
			if(nums[i]!=0){
				for(int j=2;j<nums[i];j++){
					if(nums[j]!=0){
						int temp=nums[i]%nums[j];
						if(temp==0){
							tag=false;
							break;
						}
					}
				}
				if(tag){
					count++;
					for(int j=nums[i],l=2;j*l<n;l++){
						nums[j*l]=0;
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		int r=countPrime(n);
		System.out.println(r);
	}

}
