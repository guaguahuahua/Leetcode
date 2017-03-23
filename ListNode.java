package com.xjtuse.easy;

public class ListNode {

		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
		ListNode(){
			val=0;
		}
		//今天有个教训，就是发布要随便使用条件表达式，否则会让你的代码变得难以理解，对自己也是
	public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
		
		ListNode p1=l1,p2=l2;
		ListNode prior,head=null;
		if(l1==null && l2==null){
			return head;
		}else if(l1==null){
			return l2;
		}else if(l2==null){
			return l1;
		}
		head=p1.val<=p2.val?p1:p2;//head is the smallest element
		while(p1!=null && p2!=null){//the rest of elements has already add
			if(p1.val<=p2.val){
				prior=p1;
				p1=p1.next;
				if(p1!=null){//point to the end
//					if(p1.val<=p2.val){
//						prior.next=p1;
//					}else{
//						prior.next=p2;
//					}
					prior.next=p1.val<=p2.val?p1:p2;
				}else{
					prior.next=p2;
				}
			}else{
				prior=p2;
				p2=p2.next;
				if(p2!=null){
//					if(p2.val>=p1.val){
//						prior.next=p1;
//					}else{
//						prior.next=p2;
//					}
					prior.next=p2.val<p1.val?p2:p1;
				}else{
					prior.next=p1;
				}
			}
		}
		
		while(head!=null){//print all elements
			System.out.print(head.val+" ");
			head=head.next;
		}System.out.println();
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(-9);
		ListNode n2=new ListNode(-7);
		ListNode n3=new ListNode(-3);
		ListNode n4=new ListNode(-3);
		ListNode n5=new ListNode(-1);
		ListNode n6=new ListNode(2);
		ListNode n7=new ListNode(3);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		
		ListNode l1=new ListNode(-7);
		ListNode l2=new ListNode(-7);
		ListNode l3=new ListNode(-6);
		ListNode l4=new ListNode(-6);
		ListNode l5=new ListNode(-5);
		ListNode l6=new ListNode(-3);
		ListNode l7=new ListNode(2);
		ListNode l8=new ListNode(4);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		l6.next=l7;
		l7.next=l8;
//		ListNode n1=new ListNode(1);
//		ListNode l1=new ListNode(1);
		mergeTwoLists(n1,l1);
	}
}
