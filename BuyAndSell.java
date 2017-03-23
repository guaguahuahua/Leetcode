package com.xjtuse.easy;

public class BuyAndSell {

	/**
	 * @param args
	 */
	public static int maxProfit(int [] prices){
		//使用双层for循环完成，简单情形是可以完成的，但是复杂情形运算耗时超出限制，时间复杂度o(n*n)
		int profit=0;
		int delta=0;
		for(int i=0;i<prices.length;i++){
			for(int j=i+1;j<prices.length;j++){
				if(prices[i]<prices[j]){//买入价格低于售出价格
					delta=prices[j]-prices[i];
					profit=delta>profit?delta:profit;//只有当利润超过之前时，才会存放该数据
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
