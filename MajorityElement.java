package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement {

	/**
	 * @param args
	 */
	//算法思想：进行排序，然后统计出现次数最多的元素，后面有超出者，覆盖前面的数据，返回最后覆盖的数据
	public static int majorityElement(int []nums){
		//将整个数组进行排序
		Arrays.sort(nums);
		if(nums.length==1){
			return nums[0];
		}		
		int i=0;
		int length=1;//某个元素的长度
		int max=0;//所有元素中最大的长度
		int temp=nums[i];
		int element=nums[i];
		List list=new ArrayList();
		for(int j=1;j<nums.length;j++){
			if(temp==nums[j]){
				length++;
			}else{//不相等
				if(max<length){
					element=temp;//找到一个主元素
					max=length;//重置max
				}
				temp=nums[j];
				length=1;
			}
		}
		if(length>max){
			return temp;
		}
		return element;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={5,3,4,5,6,5,5};
		int []nums={3,2,3};
		int r=majorityElement(nums);
		System.out.println(r);
//		System.out.println(nums.length);
	}

}
