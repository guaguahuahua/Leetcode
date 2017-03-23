package com.xjtuse.easy;

public class ContainWithMostWater_1 {
	//˼��������leetcode����
	//����ԭ��ʹ������ָ��ֱ�ָ����˺��Ҷˣ����㵱ǰָ���Ӧ�ľ������ֵ���������max����ô����max��
	//�����ж���˺��Ҷ˵������߶�ֵ���Ķ�С���ƶ�ָ�롣
	public static int maxArea(int []height){
		
		int left=0,right=height.length-1;
		int max=0;
		while(left<=right){
//			int area=(right-left)*Math.min(height[left],height[right]);
			int min=height[left]<height[right]?height[left]:height[right];
			int area=(right-left)*min;
			if(max<area){
				max=area;
			}
			if(height[left]<height[right]){
				left++;
			}else{
				right--;
			}
		}
		System.out.println(max);
		for(int K:height){//test para
			System.out.print(K+" ");
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []height={2,9,8,9};
		int []height={2,3,4,5,18,17,6};
		maxArea(height);
	}

}
