package com.xjtuse.easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindDuplicate_1 {
	//ʹ��set���ϣ����Թ�����ͬԪ�أ�Ȼ��ȽϺ�nums�Ĵ�С�������
	public static boolean containsDuplicate(int []nums){
		Set s=new HashSet();
		for(int i:nums){
			s.add(i);
		}
		if(s.size()<nums.length){
			return true;
		}
		return false;
		
/*		Iterator it=s.iterator();
		while(it.hasNext()){//�鿴�����е�Ԫ��
			System.out.print(it.next()+" ");
		}*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums={1,2,3,4,5,6,4};
		boolean r=containsDuplicate(nums);
		System.out.println(r);
	}

}
