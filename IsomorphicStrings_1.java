package com.xjtuse.easy;

public class IsomorphicStrings_1 {

	public static boolean isIsomorphic(String s,String t){
		
		int []hashs=new int[128];
		int []hasht=new int[128];
		if(s.length()!=t.length()){
			return false;
		}		
		int length=s.length();
		for(int i=0;i!=length;i++){
			if(hashs[s.charAt(i)]!=hasht[t.charAt(i)]){
				return false;
			}
			hashs[s.charAt(i)]= i;
			hasht[t.charAt(i)]= i;
			
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String t="egg";
//		String s="too";
		String t="paper";
		String s="title";
//		String t="far";
//		String s="boo";
		boolean r=isIsomorphic(s,t);
		System.out.println(r);
	}

}
