package com.xjtuse.easy;

public class RemoveNthNodeFromLinkedList {

	public static ListNode removeNthFromEnd(ListNode head,int n){
		ListNode result=head,second=head;
		int count=0;
		while(head!=null){//统计链表长度
			count++;
			head=head.next;
		}
//		System.out.println(count);
		count=count-n;
		if(count==0){//这块说明要删除的是第一个节点
			result=result.next;
			return result;
		}
		while(count>1){//移动指针到要删除位置的前一个地方
			count--;
			second=second.next;
		}
		second.next=second.next.next;//删除第n个位置的节点
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
//		ListNode n2=new ListNode(2);
//		ListNode n3=new ListNode(3);
//		ListNode n4=new ListNode(4);
//		ListNode n5=new ListNode(5);
//		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		n4.next=n5;
		ListNode r=removeNthFromEnd(n1,1);
		while(r!=null){
			System.out.print(r.val+" ");
			r=r.next;
		}
	}

}
