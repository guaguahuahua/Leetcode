package com.xjtuse.easy;

public class RemoveDuplicates_1 {
	public static int removeDuplicates(int [] nums){
		int i=0;//��Ϊ���ȱ�
		int j=1;//��Ϊ�����α�
		for(;j<nums.length;j++){
			if(nums[j]==nums[i]){//��������ˣ��α����
				continue;
			}else{//����ȵ�ʱ�򣬳��ȱ���Ƹ���һλ����
				i++;
				nums[i]=nums[j];
			}
		}
		return i+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums={1,2,2,5,6,6,7};//Դ����
//		int []nums={1,1,2};
		int result=removeDuplicates(nums);
		System.out.println(result);
	}

}
