package com.xjtuse.easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {

	/**
	 * @param args
	 */
//	���ַ��������ԭ������ʹ����set����Ԫ�����е�˳�򱻴����ˣ���������
	public static int removeDuplicates(int []nums){
		Set set=new HashSet();//����set���ϣ��������ظ���Ԫ��
		for(int i=0;i<nums.length;i++){
			set.add(nums[i]);
//			set.add(nums[i+1]);//չ������ǰ�������ģ�����֮һ���������ż�����У�����������������ѭ�����ھͻ����Խ�����
		}
		Iterator it=set.iterator();
		int i=0;
		while(it.hasNext()){
			nums[i++]=(Integer) it.next();//����Ǹ���nums����Ϊ�ύ��ϵͳֻ��nums
		}
//		���Զ�
		for(int j=0;j!=nums.length;j++){
			System.out.print(nums[j]+" ");//���������������ڣ�nums����������ǰ���������������ˣ����滹�����������ԭ�����е�Ԫ�ء�
		}
		System.out.println();
		return set.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[]nums={1,2,2,5,6,6,7};//Դ����
		int []nums={1,1,2};
		int result=removeDuplicates(nums);
		System.out.println(result);
	}

}
