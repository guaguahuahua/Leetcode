package com.xjtuse.easy;

public class AddTwoNumbers_2 {
	//this is the optimal in the leetcode community, without destroying any linkedlist,
	public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
		ListNode head=new ListNode(0);
		ListNode node=head;
		int sum=0;
		while(l1!=null || l2!=null){
			sum/=10;
			if(l1!=null){
				sum+=l1.val;
				l1=l1.next;
			}
			if(l2!=null){
				sum+=l2.val;
				l2=l2.next;
			}
			ListNode t=new ListNode(sum%10);
			node.next=t;
			node=node.next;
		}
		if(sum/10==1){
			ListNode tail=new ListNode(1);
			node.next=tail;
		}
		head=head.next;
		return head;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(9);
		ListNode l2=new ListNode(0);
		ListNode l3=new ListNode(1);
		ListNode l4=new ListNode(6);
		ListNode l5=new ListNode(1);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		ListNode n1=new ListNode(5);
		ListNode n2=new ListNode(8);
		ListNode n3=new ListNode(2);
		ListNode n4=new ListNode(6);
		ListNode n5=new ListNode(1);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		ListNode head=addTwoNumbers(l1,n1);
		while(head!=null){
		System.out.print(head.val+" ");
		head=head.next;
	}

	}

}
