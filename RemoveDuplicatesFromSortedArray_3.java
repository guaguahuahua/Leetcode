package com.xjtuse.easy;

public class RemoveDuplicatesFromSortedArray_3 {
	//�㷨������leetcode����
	public static int removeDuplicates(int []nums){
		
		int i=0;
		for(int n:nums){//i��ֵ����ѭ��ÿ�θı䣬�������������ı䣬���������Ż�䶯��
			//���е������ź�˳��ģ�ǰ����ֱ��д��ԭλ�ã���������ʱ��i=2,ȡ����3��Ԫ��
			//��ǰ�������бȽϣ���Ϊ�ǵ����ģ�������ڣ�����ȣ�����ô�;ͽ���Ԫ��д�룬����
			//��Ϊ����������ȡn ���ʼ������Ԫ�رȽ�
			if(i<2 || n>nums[i-2]){
				nums[i]=n;
				i++;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		int []nums={1,1,1,2,2,3};
		removeDuplicates(nums);
	}
/*	public static int removeDuplicates(int []nums){
		//���㷨���޸����ģ�ÿ��Ԫ�ض���Ψһ��
		int i=0;
		for(int n:nums){
			if(i<1 || n>nums[i-1]){
				nums[i]=n;
				i++;
			}
		}
		return i;
	}*/
}
