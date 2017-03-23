package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveElements {
	//算法：使用list 将nums中非val的元素存入，然后在通过循环将过滤后的list元素放入到nums中，返回值为list的长度
    public static int removeElement(int[] nums, int val) {
        List list=new ArrayList();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                list.add(nums[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            nums[i]=(Integer)list.get(i);
        }
        //测试段代码
        for(int i=0;i<list.size();i++){
        	System.out.print(nums[i]+" ");
        }
        System.out.println();
        return list.size();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={3,2,2,3};
		int val=3;
		int length=removeElement(nums,val);
		System.out.println(length);
	}

}
