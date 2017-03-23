package com.xjtuse.easy;

public class ListNode1 {
	int val;
	ListNode1 next;
	ListNode1(int x){
		val=x;
	}
	ListNode1(){
		val=0;
	}
	public static ListNode1 mergeTwoLists(ListNode1 l1,ListNode1 l2){
	
		if(l2==null && l1==null){
			return null;
		}else if(l1==null){
			return l2;
		}else if(l2==null){
			return l1;
		}
		ListNode1 head,pointer=new ListNode1(0);
		head=l1.val<=l2.val?l1:l2;
		while(l1!=null && l2!=null){
			if(l1.val<=l2.val){
				pointer.next=l1;
				l1=l1.next;
			}else{
				pointer.next=l2;
				l2=l2.next;
			}
			pointer=pointer.next;
		}
		pointer.next=l1==null?l2:l1;
		
		while(head!=null){//output
			System.out.print(head.val+" ");
			head=head.next;
		}
		return head;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ListNode1 n1=new ListNode1(-9);
//		ListNode1 n2=new ListNode1(-7);
//		ListNode1 n3=new ListNode1(-3);
//		ListNode1 n4=new ListNode1(-3);
//		ListNode1 n5=new ListNode1(-1);
//		ListNode1 n6=new ListNode1(2);
//		ListNode1 n7=new ListNode1(3);
//		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		n4.next=n5;
//		n5.next=n6;
//		n6.next=n7;
//		
//		ListNode1 l1=new ListNode1(-7);
//		ListNode1 l2=new ListNode1(-7);
//		ListNode1 l3=new ListNode1(-6);
//		ListNode1 l4=new ListNode1(-6);
//		ListNode1 l5=new ListNode1(-5);
//		ListNode1 l6=new ListNode1(-3);
//		ListNode1 l7=new ListNode1(2);
//		ListNode1 l8=new ListNode1(4);
//		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
//		l4.next=l5;
//		l5.next=l6;
//		l6.next=l7;
//		l7.next=l8;
//		ListNode n1=new ListNode(1);
//		ListNode l1=new ListNode(1);
		ListNode1 n1=new ListNode1();
		ListNode1 l1=new ListNode1(1);
		mergeTwoLists(n1,l1);
	}

}
