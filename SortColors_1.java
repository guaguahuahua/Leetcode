package com.xjtuse.easy;

public class SortColors_1 {
	//�㷨˼������leetcode���������ˣ���һ�ˣ�ͳ��������ɫ���Գ��ֵ�Ƶ�ʣ�Ȼ����Ƶ��ֱ������д��ԭ������ȥ
	public static void sortColors(int []nums){
		
		int red=0,white=0,blue=0;
		for(int i=0;i!=nums.length;i++){//��һ��ͳ��Ƶ��
			if(nums[i]==0){
				red++;
			}else if(nums[i]==1){
				white++;
			}else{
				blue++;
			}
		}
		System.out.println("red:"+red);
		System.out.println("white:"+white);
		for(int i=0;i!=nums.length;i++){//�ڶ�������д������
			if(i<red){
				nums[i]=0;
			}else if(i<white+red){
				nums[i]=1;
			}else{
				nums[i]=2;
			}
		}
		for(int K:nums){//test para
			System.out.print(K+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={0,1,2,2,2,2,1,1,0,0,1,2};
//		int []nums={0,1,2,0,1,2,0,1,2,0,1,2};
//		int []nums={1,0};
		sortColors(nums);
	}

}
