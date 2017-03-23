package com.xjtuse.easy;

public class PalindromeLinkedList_1 {
	//i got an idea from a brilliant guy in the community
	//and i must implemented it
	//use chasingand reverse method 
	public static boolean isPalindrome(ListNode head){
		
		if(head==null){
			return true;
		}
		ListNode fast=head,slow=head;
		while(fast.next!=null && fast.next.next!=null){
			fast=fast.next.next;
			slow=slow.next;
		}
		ListNode newHead=reverseList(slow.next);
		while(newHead!=null){
			if(newHead.val!=head.val){
				System.out.println(false);
				return false;
			}
			newHead=newHead.next;
			head=head.next;
		}
		System.out.println(true);
		return true;
	}
	public static ListNode reverseList(ListNode head){
		
		if(head==null || head.next==null){//none or only one element
			return head;
		}		
		ListNode q=head,p=q.next;
		head.next=null;//the first one change to the last
		while(p!=null){
			head=p.next;
			p.next=q;
			q=p;
			p=head;
		}
//		while(q!=null){//output all elements
//			System.out.print(q.val+"¡¡");
//			q=q.next;
//		}
		return q;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(1);
		ListNode l2=new ListNode(1);
		ListNode l3=new ListNode(2);
		ListNode l4=new ListNode(1);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
//		ListNode l1=new ListNode(0);
//		ListNode l2=new ListNode(1);
//		ListNode l3=new ListNode(2);
//		ListNode l4=new ListNode(3);
//		ListNode l5=new ListNode(2);
//		ListNode l6=new ListNode(1);
//		ListNode l7=new ListNode(0);
//		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
//		l4.next=l5;
//		l5.next=l6;
//		l6.next=l7;
		isPalindrome(l1);
	}

}
