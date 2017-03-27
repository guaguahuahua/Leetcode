package com.xjtuse.easy;

import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class CheckerCode {
	//想办法使用swing做出一个可视化的界面出来
	public static void Checker(){
		char []source={'0','1','2','3','4','5','6','7','8','9',
				'a','b','c','d','e','f','g','h','i','j','k','l',
				'm','n','o','p','q','r','s','t','u','v','w','x',
				'y','z','A','B','C','D','E','F','G','H','I','J',
				'K','L','M','N','O','P','Q','R','S','T','U','V',
				'W','X','Y','Z'};//数据源
		
		Random random=new Random();//随机数生成器
		String result="";//结果的返回值
		String customer="";
		for(int i=0;i!=4;i++){//默认的返回值的长度为4
			int tmp=random.nextInt(62);//该方法生成的随机数的范围是0--n-1，共计62个元素
			result+=source[tmp];
		}
		customer=JOptionPane.showInputDialog("请输入验证码"+result);//将结果呈献给用户，并获得用户的输入，cumstomer接收变量	；
//		System.out.println(result);//输出当前的验证码
//		System.out.println("input checker now !");//提醒用户输入
//		Scanner s=new Scanner(System.in);
//		customer=s.nextLine();//用户输入
		if(customer.equals(result)){//比较用户输入和验证码，如果相同返回登录成功，否则返回重试提醒
//			System.out.print("Successfully loaded !");
			JOptionPane.showInputDialog("Successfully logged !");
		}else{
//			System.out.print("Sorry Try again !");
			JOptionPane.showInputDialog("Sorry Try again ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checker();
	}

}
