package com.xjtuse.easy;

public class RemoveDuplicatesFromSortedArray {
	//Ԫ���ظ����ֵ�������Ϊ2��
	public static int removeDuplicates(int []nums){
		
		int length=0,count=1;
		int i=0,j;
		for(j=1;j!=nums.length;j++){
			if(nums[i]==nums[j]){//��ȵ�������
				count++;
			}else{//����,��ôͳ���ܵ�Ԫ�ظ���
				length+=count>=2?2:count;
				count=1;
//				System.out.println(length);
				i=j;
			}
		}
		System.out.println("count"+count+"j"+j);
		if(count==1 && i==nums.length-1 && j==nums.length){//ԭ���������ǵ���Ԫ��
			length+=1;
		}
		if(count!=1 && i<nums.length && j==nums.length){//���������һ����ͬԪ��
			length+=count>=2?2:count;
		}
		System.out.println(length);
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,1,1,2,2,3};
//		int []nums={1,1,1,2,2,2};
		int []nums={1,2};
		removeDuplicates(nums);
	}
}
