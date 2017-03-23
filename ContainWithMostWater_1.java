package com.xjtuse.easy;

public class ContainWithMostWater_1 {
	//思想来自于leetcode社区
	//基本原理：使用两个指针分别指向左端和右端，计算当前指针对应的矩形面积值，如果大于max，那么更新max，
	//否则判断左端和右端的两个高度值，哪端小就移动指针。
	public static int maxArea(int []height){
		
		int left=0,right=height.length-1;
		int max=0;
		while(left<=right){
//			int area=(right-left)*Math.min(height[left],height[right]);
			int min=height[left]<height[right]?height[left]:height[right];
			int area=(right-left)*min;
			if(max<area){
				max=area;
			}
			if(height[left]<height[right]){
				left++;
			}else{
				right--;
			}
		}
		System.out.println(max);
		for(int K:height){//test para
			System.out.print(K+" ");
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []height={2,9,8,9};
		int []height={2,3,4,5,18,17,6};
		maxArea(height);
	}

}
