package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveElements {
	//�㷨��ʹ��list ��nums�з�val��Ԫ�ش��룬Ȼ����ͨ��ѭ�������˺��listԪ�ط��뵽nums�У�����ֵΪlist�ĳ���
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
        //���Զδ���
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
