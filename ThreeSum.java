package com.xjtuse.easy;

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
	//�ȴ��Ҳ����һ�Σ��ٴ�������һ�Σ�ʹ������ָ�룬
	public static List<List<Integer>> threeSum(int []nums){
		
		List<List<Integer>> outer=new ArrayList<List<Integer>>();
		
		int left=0,right=nums.length-1;
		//�ȴ��ұߵ���߱���
		while(left<=right){
			int r=(nums[right]+nums[left]);
			for(int t=left+1;t<right;t++){
				List<Integer> inner=new ArrayList<Integer>();
				if(nums[t]+r==0){
					//��ӽ�ȥ��Ԫ�ر����������					
					inner=sort(inner,nums[left],nums[t],nums[right]);
					if(!outer.contains(inner)){
						outer.add(inner);
					}
				}
			}
			right--;
		}
		//����ߵ��ұ߱���
		right=nums.length-1;
		while(left<=right){
			int r=(nums[right]+nums[left]);
			for(int t=left+1;t<right;t++){
				List<Integer> inner=new ArrayList<Integer>();
				if(nums[t]+r==0){		
					inner=sort(inner,nums[left],nums[t],nums[right]);
					if(!outer.contains(inner)){
						outer.add(inner);
					}
				}
			}
			left++;
		}
		for(int i=0;i<outer.size();i++){
			System.out.println(outer.get(i));
		}
		return outer;
	}
	public static List<Integer> sort(List <Integer>inner,int l,int t,int r){

		if(l>t){
			int tmp=l;
			tmp=l;
			l=t;
			t=tmp;
		}
		if(t>r){
			int tmp=t;
			t=r;
			r=tmp;
		}
		if(l>t){
			int tmp=l;
			tmp=l;
			l=t;
			t=tmp;
		}
		inner.add(l);
		inner.add(t);
		inner.add(r);
		return inner;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []nums={-1,0,1,2,3,-1,-4};
//		int []nums={-1,0,1,0};
		int []nums={1,-1,-1,0};
		threeSum(nums);
	}

}
