package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray_2 {
	//ʹ��list���洢����������Ԫ�أ�����Ϊ1�����߳��Ƚض�Ϊ2��ţ����ɸ�õ�Ԫ�طŻ�ԭ������ȥ
	public static int removeDuplicates(int []nums){
			if(nums.length==0){
				System.out.print(0);
				return 0;
			}
			List<Integer> list=new ArrayList<Integer>();
			int i=0;
			int j=1,len=1;
			for(;j<nums.length;j++){
				if(nums[j]==nums[i]){//��������ˣ��α����
					len++;
					continue;
				}else{
					if(len<2){//�������ȣ�����ǰ��Ϊ�����㣬
						list.add(nums[i]);
					}else{//ǰ��������2����������ôȥ������ĸ�����ֱ�Ӵ洢2��
						list.add(nums[i]);
						list.add(nums[i]);
						len=1;
					}
					i=j;
				}
			}
			if(i==j-1){//���һ��Ԫ���ǹ����㣬ǰ�涼���и�����Ԫ�أ���ô���i�α�ֱ�ӻ��ܵ�length-1����
				list.add(nums[j-1]);
			}
			if(len>=2){//��βԪ�غ��ж�����������������ѭ����������Ҫ�����Ԫ����ӽ�ȥ
				list.add(nums[i]);
				list.add(nums[i]);
			}
			System.out.println(list.size());
			for(int i1=0;i1!=list.size();i1++){
				nums[i1]=list.get(i1);
			}
		
			for(int K:nums){
				System.out.print(K+" ");
			}
			return list.size();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,1,1,2,2,3};
//		int []nums={1,1,1,2,2,2};
//		int []nums={1,2};
//		int []nums={1,1,1,2};
//		int []nums={1,1,1,1,1,1,1,1,1};
		int []nums={1,1,1,1,3,3};
		removeDuplicates(nums);
	}

}
