package com.xjtuse.easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {

	/**
	 * @param args
	 */
//	这种方法错误的原因在于使用了set导致元素已有的顺序被打乱了，不合题意
	public static int removeDuplicates(int []nums){
		Set set=new HashSet();//导入set集合，不含有重复的元素
		for(int i=0;i<nums.length;i++){
			set.add(nums[i]);
//			set.add(nums[i+1]);//展开是有前提条件的，其中之一就是如果是偶数还行，但是若是奇数，在循环体内就会产生越界情况
		}
		Iterator it=set.iterator();
		int i=0;
		while(it.hasNext()){
			nums[i++]=(Integer) it.next();//这块是改造nums，因为提交后系统只认nums
		}
//		测试段
		for(int j=0;j!=nums.length;j++){
			System.out.print(nums[j]+" ");//输出结果的问题在于，nums定长，所以前面两个数被覆盖了，后面还是照样输出了原数组中的元素。
		}
		System.out.println();
		return set.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[]nums={1,2,2,5,6,6,7};//源数据
		int []nums={1,1,2};
		int result=removeDuplicates(nums);
		System.out.println(result);
	}

}
