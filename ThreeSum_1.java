package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum_1 {
	//算法TLE
	public static List<List<Integer>> threeSum(int []nums){
		
		List<List<Integer>> outer=new ArrayList<List<Integer>>();
		
		for(int i=0;i<nums.length-2;i++){
			if(i>0 && nums[i]==nums[i-1]){//相同元素跳过，但是从第一个元素之后开始
				continue;
			}
			for(int j=i+1;j<nums.length-1;j++){
				if(j>1 && nums[j]==nums[j-1]){
					continue;
				}
				for(int k=j+1;k<nums.length;k++){
//					if(k>2 &&nums[k]==nums[k-1]){
//						continue;
//					}
					if(nums[i]+nums[j]+nums[k]==0){
						List<Integer> inner=new ArrayList<Integer>();
						inner=sort(inner,nums[i],nums[j],nums[k]);
						if(!outer.contains(inner)){
							outer.add(inner);
						}
					}
				}
			}
		}
 		for(int i=0;i<outer.size();i++){
 			System.out.print(outer.get(i)+" ");
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
//		int []nums={-1,0,1,2,-1,-4};
		int []nums={-2,0,1,1,2};
		threeSum(nums);
	}

}
