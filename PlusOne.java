package com.xjtuse.easy;

public class PlusOne {
	public static int[] plusOne(int []nums){
		int incre=1;
		int []digits=new int[nums.length+1];
		for(int i=nums.length-1;i>=0;i--){//�Ӹ�λ�ӵ�ʮλ
			nums[i]+=incre;
			if(nums[i]>=10){
				incre=nums[i]-9;//�����λ
				nums[i]=nums[i]-10;//�����λ���Ƕ���
			}else{
				incre=0;
			}
		}
		if(incre==1){//˵�����һλ����ˣ���Ҫͳһ����һλ
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
