package com.xjtuse.easy;

public class LinkedListCycleII {
	//���Ǵ������������㷨���㷨�Ľ��Ϳ���ͨ����ѧ�����ǳ���˵����
	//ʵ�ַ�Ϊ�������裬�������ѭ����1.�ҵ�����ָ��Ļ�ϵ㣻2.�ֱ��ͷ���ӻ�ϵ㿪ʼһ��ָ�룬���ǽ����Ϊѭ����ʼ��
	public static ListNode detectCycle(ListNode head){
		
		ListNode fast=head,slow=head;
		if(head.next==null || head==null){
			return null;
		}
		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast){
				break;
			}
		}
		if(slow==fast){
			slow=head;
			while(slow!=fast){
				fast=fast.next;
				slow=slow.next;
			}
			return fast;
		}else{
			return null;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(0);
//		ListNode l2=new ListNode(1);
//		ListNode l3=new ListNode(2);
//		ListNode l4=new ListNode(3);
//		ListNode l5=new ListNode(4);
//		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
//		l4.next=l5;
//		l5.next=l3;
		ListNode result=detectCycle(l1);
		System.out.print(result+" ");
	}

}
