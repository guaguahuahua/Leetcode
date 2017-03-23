package com.xjtuse.easy;

public class PlusOne {
	public static int[] plusOne(int []nums){
		int incre=1;
		int []digits=new int[nums.length+1];
		for(int i=nums.length-1;i>=0;i--){//从个位加到十位
			nums[i]+=incre;
			if(nums[i]>=10){
				incre=nums[i]-9;//计算进位
				nums[i]=nums[i]-10;//计算进位后是多少
			}else{
				incre=0;
			}
		}
		if(incre==1){//说明最后一位溢出了，需要统一右移一位
			digits[0]=1;
//			for(int i=1;i<nums.length;i++){
//				digits[i]=nums[i-1];
//			}
			return digits;
		}
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={5,8,3,2,6};
		int []nums={0};
		int []result=plusOne(nums);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

}
