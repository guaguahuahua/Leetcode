package com.xjtuse.easy;

import java.util.HashSet;
import java.util.Set;

public class KdiffPairs_2 {
	//leetcode �����㷨
	public static int findPairs(int []nums, int k){
		
		//ʹ��set��Ҫ��Ϊ�˽��ظ���Ԫ�ع��˵���
		Set<Integer> diff=new HashSet<Integer>();//�������������Ϊk��Ԫ��
		Set<Integer> unique=new HashSet<Integer>();//��Ź��˺������Ԫ��
		for(int i=0;i!=nums.length;i++){
			//ÿ�ζ����unique���Ƿ���ڱ�������߱���Сk��Ԫ�ء������ھ���ӽ�diff��ȥ
			if(unique.contains(nums[i]-k)){//���Ǵ����С��Ԫ��
				diff.add(nums[i]-k);
			}
			if(unique.contains(nums[i]+k)){
				diff.add(nums[i]);
			}
			unique.add(nums[i]);//���ÿ��Ψһ��nums[i]
		}
		System.out.println(diff.size());
		return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={3,1,4,1,5};//0,2
//		int []nums={1,2,3,4,5};//1
//		int []nums={1,1,1,2,1};
//		int []nums={1,1,1,1};//0
		findPairs(nums,2);
	}

}
