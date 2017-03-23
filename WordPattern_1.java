package com.xjtuse.easy;

public class WordPattern_1 {
	//如果在一个数组上面直接改进，结果是错误的，这种想法可以，但是不适合这道问题
	public static boolean wordPattern(String pattern,String str){
		String[] sp=str.split(" "); //split str into parts
		if(sp.length!=pattern.length()){// judge length
			return false;
		}
		int length=sp.length;
		byte []tablep=new byte[length];//transform the two string into the same pattern:array
		byte []tables=new byte[length];
		byte k=1;
		for(int i=0;i!=length;i++){
			char t=pattern.charAt(i);
			String te=sp[i];
			for(int j=i;j!=length;j++){
				if(pattern.charAt(j)==t){
					if(tablep[j]==0){
						tablep[j]=k;
					}	
				}
				if(sp[j].equals(te)){
					if(tablep[j]!=0){
						tablep[j]-=k;
					}
				}
			}
			k++;
		}
		
		for(int K:tablep){
		System.out.print(K+"　");
		}System.out.println();
		for(int K:tables){
		System.out.print(K+"　");
		}

		for(int i=0;i!=length;i++){//if two arrays are not same,the two strings are not same 
			if(tablep[i]!=0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		String pattern="abba";
//		String str="dog cat cat dog";
//		String str= "dog cat cat fish";
//		String str = "dog cat cat dog";
		String str = "dog dog dog dog";
		boolean r=wordPattern(pattern,str);
		System.out.println(r);	
		
	}
}



