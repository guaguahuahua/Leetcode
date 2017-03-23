package com.xjtuse.easy;

import java.util.HashMap;
import java.util.Map;

public class CotainDuplicate_1 {
	//ʹ��map����ӣ��ú���containsKey�ж��Ƿ����,��������ˣ���ôֱ���ж�����֮��ľ����Ƿ���k
	//��Χ�ڣ�����ǣ�ֱ�ӷ��أ������ǣ���ô����Ԫ����ӵ�map�У�����Ѱ��
	public static boolean containsNearbyDuplicate(int []nums,int k){
		
		Map map=new HashMap();
		for(int i=0;i<nums.length;i++){
			if(map.containsKey(nums[i])){
				int delta=i-(Integer)map.get(nums[i]);
				if(delta<=k){
					return true;
				}else{
					map.put(nums[i],i);
					continue;
				}
			}
			map.put(nums[i],i);
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={1,2,3,4,5,6,7,4,2};
//		int k=4;
//		int []nums={1,2};
//		int k=2;
		int []nums={1,0,1,1};
		int k=1;
		boolean r=containsNearbyDuplicate(nums,k);
		System.out.println(r);
	}

}
