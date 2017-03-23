package com.xjtuse.easy;

public class PlusOne_1 {
	//超简洁的解决方案，唯有深刻的对问题域理解，才能做出最优的方案。
	public static int[] plusOne(int []nums){
		for(int i=nums.length-1;i>=0;i--){
			if(nums[i]<9){
				nums[i]++;
				return nums;//只要是个位数是小于9的，那么只要个位加一即可完成
			}
			nums[i]=0;//如果最后一位不小于9，那么就是发生了进位，
		}
		int []newNums=new int[nums.length+1];
		newNums[0]=1;
		return newNums;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums={1,9};
		int []result=plusOne(nums);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]);
		}
		System.out.println();
	}

}
