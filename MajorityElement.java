package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement {

	/**
	 * @param args
	 */
	//�㷨˼�룺��������Ȼ��ͳ�Ƴ��ִ�������Ԫ�أ������г����ߣ�����ǰ������ݣ�������󸲸ǵ�����
	public static int majorityElement(int []nums){
		//�����������������
		Arrays.sort(nums);
		if(nums.length==1){
			return nums[0];
		}		
		int i=0;
		int length=1;//ĳ��Ԫ�صĳ���
		int max=0;//����Ԫ�������ĳ���
		int temp=nums[i];
		int element=nums[i];
		List list=new ArrayList();
		for(int j=1;j<nums.length;j++){
			if(temp==nums[j]){
				length++;
			}else{//�����
				if(max<length){
					element=temp;//�ҵ�һ����Ԫ��
					max=length;//����max
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
