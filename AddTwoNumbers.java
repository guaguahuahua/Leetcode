package com.xjtuse.easy;

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
		ListNode h1=l1,h2=l2;
		while(h1!=null && h2!=null){
			h1=h1.next;
			h2=h2.next;
		}
		ListNode longHead=(h1==null)?l2:l1;//get the longest linkedlist
		ListNode shortHead=(h1==null)?l1:l2;
		ListNode head=longHead;
		boolean flag=false;
		int add=0;
		while(shortHead!=null){
			if(flag){
				add=1;
				flag=false;
			}
			int sum=shortHead.val+longHead.val+add;
			if(sum<=9){
				longHead.val=sum;
			}else{
				longHead.val=sum-10;
				flag=true;
			}
			longHead=longHead.next;
			shortHead=shortHead.next;
		}
		System.out.println(flag);
		if(flag){
			ListNode tail=new ListNode(1);
			longHead=tail;
		}
		while(head!=null){//output para
			System.out.print(head.val+"¡¡");
			head=head.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(5);
//		ListNode l2=new ListNode(6);
//		ListNode l3=new ListNode(4);
//		ListNode l4=new ListNode(1);
//		l1.next=l2;
//		l2.next=l3;
//		l3.next=l4;
		ListNode n1=new ListNode(5);
//		ListNode n2=new ListNode(4);
//		ListNode n3=new ListNode(3);
//		n1.next=n2;
//		n2.next=n3;
		addTwoNumbers(l1,n1);
	}

}
