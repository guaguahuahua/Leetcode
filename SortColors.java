package com.xjtuse.easy;

import java.util.Arrays;

public class SortColors {
	
	public static void sortColors(int []nums){
		
		boolean f1=false,f2=false;
		int left=0,right=nums.length-1;
		for(int i=0;i!=3;i++){//因为所有的颜色只有三种，并且按照从小到大的顺序排列
			while(left<right){//每次循环都从左指针和右指针的位置同时开始，将左边不是i的位置找到，在右侧找到为i的元素，调换位置
				while(left<right){//移动left指针到非i的位置
					if(nums[left]==i){//如果是是该指针，那么往后再移一位判断
						left++;
						f1=true;
					}else{//如果该位就不是当前排序的i元素，那么left指针定位到该点
						f1=true;
						break;
					}
				}
				while(left<right){//移动right指针到为i的位置
					if(nums[right]!=i){
						right--;
						f2=true;
					}else{
						f2=true;
						break;
					}
				}
				if(f1 && f2){//确保两个定位指针都在位置上了，直接交换
					int tmp=nums[left];
					nums[left]=nums[right];
					nums[right]=tmp;
					f1=f2=false;
				}
			}
			left=left;//指针移动到前面排好序的元素的后边去。
			right=nums.length-1;
		}
//		Arrays.sort(nums);
		for(int K:nums){
			System.out.print(K+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={0,1,2,2,2,2,1,1,0,0,1,2};
//		int []nums={0,1,2,0,1,2,0,1,2,0,1,2};
//		int []nums={1,0};
		sortColors(nums);
	}

}
