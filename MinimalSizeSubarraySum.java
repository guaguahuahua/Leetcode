package com.xjtuse.easy;
public class MinimalSizeSubarraySum {
	
	public static int minSubArrayLen(int s, int []nums){
		
		if(nums.length==0){
			return 0;
		}
		int i=0;//�α�1
		int j=1;//�α�2
		int min=2147483647,total=nums[i];
		for(;i<nums.length;){
			if(total<s){//�����ж�һ������ʱ���Ƿ���������
				if(j>=nums.length){
					break;
				}
				total+=nums[j];
				j++;
			}else{//���������������ô�ж����г��ȣ�������г���С��֮ǰ�ĳ��ȣ�����min��
				int len=j-i;
				min=len<min?len:min;
				i++;//���¿�ʼѰ������
				if(i<nums.length){
					j=i+1;
					total=nums[i];
//					System.out.println(min);
				}
				
			}
		}
//		System.out.println(min);
		if(min==2147483647){//���minû�б����ù�����ô����0˵�����е�Ԫ��֮�Ͷ��޷�����s
			System.out.println(0);
			return 0;
		}
		System.out.println(min);
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={2,3,1,2,4,7};
//		int []nums={7,77,7,7,7,7};
//		int []nums={1,1,1,1,1,1,1};
//		int []nums={1,1,1,1,1};
//		int []nums={};
		int []nums={1,1,7,1,1};
		int s=7;
		minSubArrayLen(s,nums);
	}

}
