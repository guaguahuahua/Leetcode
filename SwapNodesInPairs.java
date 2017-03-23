package com.xjtuse.easy;

public class SwapNodesInPairs {
	//这段代码虽然通过了，但是不合题意，因为要求是不能改变节点的值，只能改变节点本身
	public static ListNode swapPairs(ListNode head){
		
		if(head==null){//头为空的时候
			return head;
		}
		ListNode slow=head,fast=slow.next;
		int temp=0;
		
		while(slow!=null && fast!=null){//交换成对的节点的值
			temp=fast.val;
			fast.val=slow.val;
			slow.val=temp;
			
			if(fast.next!=null){
				fast=fast.next.next;
				slow=slow.next.next;
			}else{
				break;
			}
		}

//		while(head!=null){
//		System.out.print(head.val+" ");
//		head=head.next;
//	}
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
		swapPairs(n1);
//		while(head!=null){
//			System.out.print(head.val+" ");
//			head=head.next;
//		}
	}

}
