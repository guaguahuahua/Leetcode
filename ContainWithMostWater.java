package com.xjtuse.easy;

public class ContainWithMostWater {
	//算法存在问题,思路有问题.
	public static int maxArea(int []height){
		
		int s=0,ds=0;
		int h0=height[0],w=0;
		for(int i=0,j=i+1;i<height.length-1;i++,j++){
			
			s=Math.min(height[i],height[j]);
			ds=Math.min(h0,height[j])*(j-w);
			System.out.println("s:"+s);
			System.out.println("ds:"+ds);
			if(ds<s){
				h0=height[i];
				w=i;
			}
		}		
		System.out.println(ds);
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []height={3,2,5,6,7};//max=12
		int []height={2,9,8,9};
		maxArea(height);
	}

}

