package com.xjtuse.easy;

public class AddTwoNumbersII {
	//算法思想：先将两个链表进行逆置，逆置结束之后，在按照I的算法进行相加，加完之后再次逆置，非常简洁；
	//建议是：将逆置函数放在外面去，好控制，相加函数也可以放在外面去。
	public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
		
		l1=reverse(l1);//逆置单链表l1
		l2=reverse(l2);//逆置单链表l2
		ListNode head=new ListNode(0),h=head;//新建节点，将两者之和放入到新链表中
		int sum=0;
		while(l1!=null || l2!=null){//遍历两个链表，每个元素进行求和
			sum/=10;
			if(l1!=null){
				sum+=l1.val;
				l1=l1.next;
			}
			if(l2!=null){
				sum+=l2.val;
				l2=l2.next;
			}
			ListNode node=new ListNode(sum%10);
			head.next=node;
			head=head.next;
		}
//		System.out.println(head.val+" ");
		if(sum/10==1){//最后再次判断是否计算溢出，是否应该添加新的节点，
			head.next=new ListNode(1);
		}
		h=reverse(h.next);//将逆置的链表重新逆转
//		while(h!=null){
//			System.out.print(h.val+"　");
//			h=h.next;
//		}
//		
//		while(l1!=null){//test para
//			System.out.print(l1.val+"　");
//			l1=l1.next;
//		}
		
		return h;
	}
	public static ListNode reverse(ListNode head){
		
		ListNode then=head.next,post;
		head.next=null;
		while(then!=null){
			post=then.next;
			then.next=head;
			head=then;
			then=post;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(9);
		ListNode n2=new ListNode(7);
//		ListNode n3=new ListNode(4);
//		ListNode n4=new ListNode(3);
		ListNode l1=new ListNode(9);
//		ListNode l2=new ListNode(6);
//		ListNode l3=new ListNode(4);
		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		l1.next=l2;
//		l2.next=l3;
		ListNode head=addTwoNumbers(n1,l1);
		while(head!=null){
			System.out.print(head.val+"　");
			head=head.next;
		}
	}

}
