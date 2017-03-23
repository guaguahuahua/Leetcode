package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	//����֮������forѭ������Ƕһ������ͬʱ�ݽ������㷨
	public static List<List<Integer>> fourSum(int []nums, int target){
		
		List<List<Integer>> outer=new ArrayList<List<Integer>>();
		Arrays.sort(nums);//���Ƚ������򣬷���ʹ�������ƽ�����㷨
		for(int i=0;i<nums.length-3;i++){
			if(i>0 && nums[i]==nums[i-1]){//����������ͬԪ�أ�Ҳ����˵����ʼ�ڶ���Ԫ�ص�ʱ�������ǰ���Ԫ����ͬ����ôֱ������
				continue;
			}
			for(int j=i+1;j<nums.length-2;j++){
				if(j>i+1 && nums[j]==nums[j-1]){
					continue;
				}
				for(int left=j+1,right=nums.length-1;left<right;){//ʹ����������㷨�������ܱ�˫�� ��forѭ������ʱ�临�Ӷȣ�
					if(nums[i]+nums[j]==target-(nums[left]+nums[right])){
						//���outer ����û�и�Ԫ�ص�ʱ������ӽ�ȥ����Ҫ��Ϊ��������Ŀ��Ҫ���޸���
//						if(!outer.contains(Arrays.asList(nums[i],nums[j],nums[left],nums[right]))){
//							outer.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
//						}
						outer.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
						left++;//�����Ԫ�ط���Ҫ����ô���ҵ�ָ���������Եķ����ƽ�һλ
						right--;
					}else if(nums[i]+nums[j]<target-(nums[left]+nums[right])){//�����������㡣
						//����ǵ���ָ�벻������ָ��������£��ƶ�ָ�룬������С��ǰֵ��Ŀ��ֵ�ļ��
						while(left<right && nums[i]+nums[j]<target-(nums[left]+nums[right])){
							left++;
						}
					}else if(nums[i]+nums[j]>target-(nums[left]+nums[right])){
						
						while(left<right && nums[i]+nums[j]>target-(nums[left]+nums[right])){
							right--;
						}
					}
				}
			}
		}
		System.out.println(outer);
		return outer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={1,0,-1,0,-2,2};//0
//		int []nums={-3,-2,-1,0,0,1,2,3};//0
//		int []nums={-1,0,1,2,-1,-4};//-1
		int target=0;
		fourSum(nums,target);
	}

}
