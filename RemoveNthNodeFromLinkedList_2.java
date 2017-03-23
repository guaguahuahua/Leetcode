package com.xjtuse.easy;

public class RemoveNthNodeFromLinkedList_2 {
	//ʹ��������gap�㷨������һ�α������ɾ������
	//�㷨������֮������ʹ��������ָ�룬ʹ��fastָ���slowָ��ļ��ΪҪɾ�����ֵ�ǰһλ��
	//������ǰһ��λ�ã�ͨ��ָ��Ĳ����Ϳ��������Nthλ���ݵ�ɾ����
	public static ListNode removeNthFromEnd(ListNode head,int n){
		ListNode slow=new ListNode(0);
		slow.next=head;
		ListNode fast=head;
		
		while(n>0){//�Ƚ���ָ������ָ��������� gap
			fast=fast.next;
			n--;
		}
		if(fast==null){//��ɾ���Ľڵ���ͷ����ʱ��
			return head.next;
		}
		while(fast!=null){//Ȼ��ͬʱ�ƶ���ָ�����ָ�룬����ָ��ָ�յ�ʱ����ָ��ָ����ɾ��λ�õ�ǰһ��
			fast=fast.next;
			slow=slow.next;
		}
		slow.next=slow.next.next;

		return head;
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
		ListNode r=removeNthFromEnd(n1,5);
		while(r!=null){
			System.out.print(r.val+" ");
			r=r.next;
		}
	}

}
