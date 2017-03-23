package com.xjtuse.easy;

public class RotateList {

	public static ListNode rotateRight(ListNode head,int k){
		
		if(head==null){
			return head;
		}
		ListNode virtual=new ListNode(0);
		ListNode fast=virtual,slow=virtual,count=head;
		ListNode pre=null,result;
		virtual.next=head;
		int length=0;//����������¼���������ȵģ������еĲ���k����ȡ�������Ž�����ת����ֹ����ķ���
		while(count!=null){
			length++;
			count=count.next;
		}
		k=k%length;
		if(k==0){//������Ϊ0����˵��������ת
			return head;
		}
		while(k>=0){//�ƶ�fast ʹ�ò������
			fast=fast.next;
			k--;
		}
		while(fast!=null){//��slowָ�򼴽�ɾ���ڵ��ǰһλ
			fast=fast.next;
			slow=slow.next;
		}
		pre=slow;//�ýڵ����Ҫ���β��
		slow=slow.next;
		result=slow;
		pre.next=null;//��β���ÿ�
		while(slow!=null){//��slow�ڵ��ƶ���β����preָ�����һ���ڵ�
			pre=slow;
			slow=slow.next;	
		}
		if(result==head){//���Ƿ�ֹ��ת�����������ʱ��ͷβ�ӵ�һ���γ���ѭ��
			return head;
		}
		pre.next=head;//���ˣ���ת����
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		ListNode head=rotateRight(n1,5);
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
	}
}
