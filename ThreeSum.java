package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
	//先从右侧遍历一次，再从左侧遍历一次，使用两个指针，
	public static List<List<Integer>> threeSum(int []nums){
		
		List<List<Integer>> outer=new ArrayList<List<Integer>>();
		
		int left=0,right=nums.length-1;
		//先从右边到左边遍历
		while(left<=right){
			int r=(nums[right]+nums[left]);
			for(int t=left+1;t<right;t++){
				List<Integer> inner=new ArrayList<Integer>();
				if(nums[t]+r==0){
					//添加进去的元素必须是有序的					
					inner=sort(inner,nums[left],nums[t],nums[right]);
					if(!outer.contains(inner)){
						outer.add(inner);
					}
				}
			}
			right--;
		}
		//从左边到右边遍历
		right=nums.length-1;
		while(left<=right){
			int r=(nums[right]+nums[left]);
			for(int t=left+1;t<right;t++){
				List<Integer> inner=new ArrayList<Integer>();
				if(nums[t]+r==0){		
					inner=sort(inner,nums[left],nums[t],nums[right]);
					if(!outer.contains(inner)){
						outer.add(inner);
					}
				}
			}
			left++;
		}
		for(int i=0;i<outer.size();i++){
			System.out.println(outer.get(i));
		}
		return outer;
	}
	public static List<Integer> sort(List <Integer>inner,int l,int t,int r){

		if(l>t){
			int tmp=l;
			tmp=l;
			l=t;
			t=tmp;
		}
		if(t>r){
			int tmp=t;
			t=r;
			r=tmp;
		}
		if(l>t){
			int tmp=l;
			tmp=l;
			l=t;
			t=tmp;
		}
		inner.add(l);
		inner.add(t);
		inner.add(r);
		return inner;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={-1,0,1,2,3,-1,-4};
//		int []nums={-1,0,1,0};
		int []nums={1,-1,-1,0};
		threeSum(nums);
	}

}
