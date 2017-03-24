package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray_2 {
	//使用list来存储符合条件的元素，长度为1，或者长度截短为2存放，最后将筛好的元素放回原数组中去
	public static int removeDuplicates(int []nums){
			if(nums.length==0){
				System.out.print(0);
				return 0;
			}
			List<Integer> list=new ArrayList<Integer>();
			int i=0;
			int j=1,len=1;
			for(;j<nums.length;j++){
				if(nums[j]==nums[i]){//两数相等了，游标后移
					len++;
					continue;
				}else{
					if(len<2){//两数不等，并且前者为孤立点，
						list.add(nums[i]);
					}else{//前者至少有2个副本，那么去掉多余的副本，直接存储2个
						list.add(nums[i]);
						list.add(nums[i]);
						len=1;
					}
					i=j;
				}
			}
			if(i==j-1){//最后一个元素是孤立点，前面都是有副本的元素，那么最后i游标直接会跑到length-1处，
				list.add(nums[j-1]);
			}
			if(len>=2){//结尾元素含有多个副本，最后跳出了循环，这样需要将最后元素添加进去
				list.add(nums[i]);
				list.add(nums[i]);
			}
			System.out.println(list.size());
			for(int i1=0;i1!=list.size();i1++){
				nums[i1]=list.get(i1);
			}
		
			for(int K:nums){
				System.out.print(K+" ");
			}
			return list.size();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,1,1,2,2,3};
//		int []nums={1,1,1,2,2,2};
//		int []nums={1,2};
//		int []nums={1,1,1,2};
//		int []nums={1,1,1,1,1,1,1,1,1};
		int []nums={1,1,1,1,3,3};
		removeDuplicates(nums);
	}

}
