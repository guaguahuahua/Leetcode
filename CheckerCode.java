package com.xjtuse.easy;

import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class CheckerCode {
	//��취ʹ��swing����һ�����ӻ��Ľ������
	public static void Checker(){
		char []source={'0','1','2','3','4','5','6','7','8','9',
				'a','b','c','d','e','f','g','h','i','j','k','l',
				'm','n','o','p','q','r','s','t','u','v','w','x',
				'y','z','A','B','C','D','E','F','G','H','I','J',
				'K','L','M','N','O','P','Q','R','S','T','U','V',
				'W','X','Y','Z'};//����Դ
		
		Random random=new Random();//�����������
		String result="";//����ķ���ֵ
		String customer="";
		for(int i=0;i!=4;i++){//Ĭ�ϵķ���ֵ�ĳ���Ϊ4
			int tmp=random.nextInt(62);//�÷������ɵ�������ķ�Χ��0--n-1������62��Ԫ��
			result+=source[tmp];
		}
		customer=JOptionPane.showInputDialog("��������֤��"+result);//��������׸��û���������û������룬cumstomer���ձ���	��
//		System.out.println(result);//�����ǰ����֤��
//		System.out.println("input checker now !");//�����û�����
//		Scanner s=new Scanner(System.in);
//		customer=s.nextLine();//�û�����
		if(customer.equals(result)){//�Ƚ��û��������֤�룬�����ͬ���ص�¼�ɹ������򷵻���������
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
