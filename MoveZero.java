package com.xjtuse.easy;

public class MoveZero {
	//算法思想：不管0元素，直接将非0元素从数组的开始到尾依次摆放，将i标以后的所有元素置为0即可完成
	public static void moveZeroes(int []nums){
		int i=0;//非零游标
		for(int j=0;j<nums.length;j++){//遍历游标
			if(nums[j]!=0){
				nums[i++]=nums[j];
			}
		}
		//遍历完毕之后开始从非零元素后面开始补齐零元素
		for(;i<nums.length;i++){
			nums[i]=0;
		}
		//测试段
		for(int k:nums){
			System.out.print(k+" ");
		}
	}
	//要求：：不要复制出另外一个数组出来，只在原数组上面进行操作，并且要求函数移动的操作数尽量的少
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={0,1,0,3,12};
		int []nums={5,8,7,10};
		moveZeroes(nums);
	}

}
