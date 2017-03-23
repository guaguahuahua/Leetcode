package com.xjtuse.easy;

public class AddTwoNumbers_3 {

	public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
		ListNode pre1=l1,pre2=l2;
		ListNode h1=l1;
		int sum=0;
		while(l1!=null && l2!=null){
			sum/=10;//判断是否有进位
			sum=sum+l1.val+l2.val;//两个数对应位置直接相加
			l1.val=sum%10;
			pre1=l1;
			pre2=l2;
			l1=l1.next;
			l2=l2.next;			
		}
		//首先要判断一下l1，l2哪一个指空了，然后在循环判断后面的所有非空结点是不是要进行加一操作还是直接返回
		ListNode node=(l1==null)?l2:l1;
		pre1.next=node;
		//下面的主要是防止一个链表结束时，另一个链表的进位问题比如 1+99999这种极端情形
		while(node!=null){//最后还会涉及到进位问题， 主要是最后一位如果溢出了还得添加一个新的节点
			sum/=10;
			sum+=node.val;
			node.val=sum%10;
			pre1=pre1.next;
			node=node.next;
		}
		//最后再判断一下是不是需要添加新节点
		if(sum/10==1){
			ListNode tail=new ListNode(1);
			pre1.next=tail;
		}
		while(h1!=null){
			System.out.print(h1.val+" ");
			h1=h1.next;
		}
		return h1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(9);
//		ListNode l2=new ListNode(0);
//		ListNode l3=new ListNode(1);
//		ListNode l4=new ListNode(6);
//		ListNode l5=new ListNode(1);
//		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
//		l4.next=l5;
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(9);
		ListNode n3=new ListNode(9);
		ListNode n4=new ListNode(9);
//		ListNode n5=new ListNode(1);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
//		n4.next=n5;
		ListNode head=addTwoNumbers(l1,n1);
		
//		while(head!=null){//output para
//		System.out.print(head.val+" ");
//		head=head.next;
//	}
	}
}
