package com.xjtuse.easy;

public class BuyAndSell {

	/**
	 * @param args
	 */
	public static int maxProfit(int [] prices){
		//ʹ��˫��forѭ����ɣ��������ǿ�����ɵģ����Ǹ������������ʱ�������ƣ�ʱ�临�Ӷ�o(n*n)
		int profit=0;
		int delta=0;
		for(int i=0;i<prices.length;i++){
			for(int j=i+1;j<prices.length;j++){
				if(prices[i]<prices[j]){//����۸�����۳��۸�
					delta=prices[j]-prices[i];
					profit=delta>profit?delta:profit;//ֻ�е����󳬹�֮ǰʱ���Ż��Ÿ�����
				}else{
					continue;
				}
			}
		}
		return profit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []input={7,1,5,3,6,4};
		int []input={7,6,4,3,1};
		int r=maxProfit(input);
		System.out.println(r);
	}

}
