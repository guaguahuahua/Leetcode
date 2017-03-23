package com.xjtuse.easy;

public class ReorderList {
	//算法思想：两个指针同时遍历，fast，slow最终，slow指向了链表的中点；
	//接下来做的是将中点之后的所有的节点进行逆置，这样得到了两个链表，然后将
	//两个链表的元素穿插连接起来就可以。
	public static void reorderList(ListNode head){
		
		if(head==null){
			return ;
		}
		//首先寻找中点所在
		ListNode fast=head,slow=head,pre=null;
		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			pre=slow;
			slow=slow.next;
		}
		pre.next=null;
		fast=head;//这块是测试用的一个闲置的指针
//		System.out.println(fast.val+" ");
//		System.out.println(slow.val+" ");
//		System.out.println(pre.val+" ");
		//逆置中点以后的所有节点
		pre=slow;//将逆置的第一个节点next节点置为空 
		ListNode then=slow.next,temp=null;
		while(then!=null){
			temp=then.next;
			then.next=slow;
			slow=then;
			then=temp;
		}
		pre.next=null;
//		while(slow!=null){//test para
//			System.out.print(slow.val+" ");
//			slow=slow.next;
//		}
		System.out.println(slow.val+" ");
		//将两个短链表合并唯一
		//如果是直接的将slow，head不为空作为条件那么对于不等长的链表就会发生错误，
		//所以将它们等长部分相同处理，不同部分，循环外处理
		ListNode post,post1;
		while(slow.next!=null && head.next!=null){
			post=head.next;
			post1=slow.next;
			head.next=slow;
			slow.next=post;
			head=post;
			slow=post1;
		}
		head.next=slow;
		while(fast!=null){
			System.out.print(fast.val+" ");
			fast=fast.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(0);
		ListNode l2=new ListNode(1);
//		ListNode l3=new ListNode(2);
//		ListNode l4=new ListNode(3);
//		ListNode l5=new ListNode(4);
		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
//		l4.next=l5;
//		l5.next=l3;
		reorderList(l1);
	}

}
