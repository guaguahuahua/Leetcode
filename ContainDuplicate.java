package com.xjtuse.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
	//���ҵ�������ȵ�����Ȼ�����ж����������Ƿ�С�ڵ���k����
	//˫��ѭ������ʱ�临�Ӷȳ���������
	public static boolean containsNearbyDuplicate(int []nums,int k){
		
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]==nums[j]){
					if(j-i<=k){
						return true;
						}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,2,3,4,5,6,7,4,2};
//		int k=4;
		int []nums={1,2};
		int k=2;
		boolean r=containsNearbyDuplicate(nums,k);
		System.out.println(r);
	}

}
