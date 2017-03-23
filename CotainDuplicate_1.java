package com.xjtuse.easy;

import java.util.HashMap;
import java.util.Map;

public class CotainDuplicate_1 {
	//使用map来添加，用函数containsKey判断是否包含,如果包含了，那么直接判断他们之间的距离是否在k
	//范围内，如果是，直接返回，若不是，那么将钙元素添加到map中，继续寻找
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
