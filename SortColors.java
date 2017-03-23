package com.xjtuse.easy;

import java.util.Arrays;

public class SortColors {
	
	public static void sortColors(int []nums){
		
		boolean f1=false,f2=false;
		int left=0,right=nums.length-1;
		for(int i=0;i!=3;i++){//��Ϊ���е���ɫֻ�����֣����Ұ��մ�С�����˳������
			while(left<right){//ÿ��ѭ��������ָ�����ָ���λ��ͬʱ��ʼ������߲���i��λ���ҵ������Ҳ��ҵ�Ϊi��Ԫ�أ�����λ��
				while(left<right){//�ƶ�leftָ�뵽��i��λ��
					if(nums[left]==i){//������Ǹ�ָ�룬��ô��������һλ�ж�
						left++;
						f1=true;
					}else{//�����λ�Ͳ��ǵ�ǰ�����iԪ�أ���ôleftָ�붨λ���õ�
						f1=true;
						break;
					}
				}
				while(left<right){//�ƶ�rightָ�뵽Ϊi��λ��
					if(nums[right]!=i){
						right--;
						f2=true;
					}else{
						f2=true;
						break;
					}
				}
				if(f1 && f2){//ȷ��������λָ�붼��λ�����ˣ�ֱ�ӽ���
					int tmp=nums[left];
					nums[left]=nums[right];
					nums[right]=tmp;
					f1=f2=false;
				}
			}
			left=left;//ָ���ƶ���ǰ���ź����Ԫ�صĺ��ȥ��
			right=nums.length-1;
		}
//		Arrays.sort(nums);
		for(int K:nums){
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
