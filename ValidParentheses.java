package com.xjtuse.easy;

import java.util.Stack;

public class ValidParentheses {

	public static boolean isValid(String s){
		//ʹ��java�Դ���ջ������ʵ��
		Stack <Character>stack=new Stack<Character>();
		for(int i=0;i!=s.length();i++){//���εĽ�ÿ���ַ�����ջ��
			if(stack.empty()){//ջΪ�գ�ֱ��ѹջ
				stack.push(s.charAt(i));
			}else if(stack.peek().equals('(') && s.charAt(i)==')'){//���ջ��Ԫ���Ǻͼ��Ԫ����ȣ�ջ��Ԫ�س�ջ
				stack.pop();
//				stack.push(s.charAt(i));
			}else if(stack.peek().equals('[') && s.charAt(i)==']'){
				stack.pop();
			}else if(stack.peek().equals('{') && s.charAt(i)=='}'){
				stack.pop();
			}else{//�����ǰ��Ԫ�غ�ջ��Ԫ�ز�ƥ�䣬��ôֱ��ѹջ
				stack.push(s.charAt(i));
			}
		}
		System.out.println(stack.empty()+" ");
		return stack.empty()?true:false;
//		return true;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="()[]{}";
//		String s="(]{}";
		String s="([)]";
		isValid(s);
	}

}
