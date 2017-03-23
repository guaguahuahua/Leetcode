package com.xjtuse.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	/**
	 * @param args
	 */
    public static int[] twoSum(int[] nums, int target) {
        int []sum=new int[2];//����ֵ����
        Map map=new HashMap();
        for(int i=0;i<nums.length;i++){
        
        	if(map.containsKey(target-nums[i])){
        		sum[1]=i;
        		sum[0]=(Integer) map.get(target-nums[i]);
        		return sum;
        	}
        	map.put(nums[i], i);//��ÿ��Ԫ��ѹջ�����������Ļ�ֻҪ����Ĳ���ڵ�ǰ��ֵ����Ѱ�ҵ��˶�Ӧ����
        }        
    	return sum;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={2,7,11,15};
		int target=9;
		int [] r=twoSum(nums,target);
		for(int i=0;i<r.length;i++){
			System.out.println(r[i]);
		}
		

	}

}
