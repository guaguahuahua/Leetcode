package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers_1 {
	//�߶˽ⷨ���������е�Ԫ�ض�����1����n�ķ�Χ�����Ը��ݸ����Խ�nums���е�Ԫ�ؽ��б������Ϊ��Ӧ���෴������һ��ѭ�����
	//�ڶ���ѭ������0��ʼ�ٴα������е�Ԫ�أ���ôδ����ǹ���Ԫ�ص���������ȱʧ��Ԫ�أ�
	public static List<Integer>findDisappearedNumbers(int []nums){
		List <Integer>list =new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++){
			int val=Math.abs(nums[i])-1;//���ȱʧ�ͻᵼ��ȡ����Ԫ�ؽ��в���
			if(nums[val]>0){  //���ȱʧ�ᵼ�½�������Ϊ��
				nums[val]=-nums[val];
			}
		}
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]>0){
				list.add(i+1);
			}
		}
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={4,3,2,7,8,2,3,1};
		findDisappearedNumbers(nums);
	}

}
