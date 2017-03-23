package com.xjtuse.easy;

public class RemoveNthNodeFromLinkedList_2 {
	//使用社区的gap算法，可以一次遍历完成删除操作
	//算法的巧妙之处在于使用了两个指针，使得fast指针和slow指针的间隔为要删除数字的前一位置
	//这样从前一个位置，通过指针的操作就可以完成了Nth位数据的删除。
	public static ListNode removeNthFromEnd(ListNode head,int n){
		ListNode slow=new ListNode(0);
		slow.next=head;
		ListNode fast=head;
		
		while(n>0){//先将快指针与慢指针拉开间隔 gap
			fast=fast.next;
			n--;
		}
		if(fast==null){//当删除的节点是头结点的时候
			return head.next;
		}
		while(fast!=null){//然后同时移动快指针和慢指针，当快指针指空的时候，慢指针指到了删除位置的前一项
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
