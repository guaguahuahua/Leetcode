package com.xjtuse.easy;
//不开辟新空间也可以做，不过需要两个pre指针
//下面的方式是破坏性的，因为某一个链表在循环过后就会全部变成新的值
public class AddTwoNumbers_1 {
	public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
		ListNode pre1=l1,pre2=l2;
		ListNode h1=l1;
		boolean flag=false;
		int add=0;
		int sum=0;
		while(l1!=null && l2!=null){
			if(flag){
				add=1;
				flag=false;
				sum=l1.val+l2.val+add;
			}else{
				add=0;
				sum=l1.val+l2.val+add;
			}
			
			if(sum<=9){
				l1.val=sum;
			}else{
				flag=true;
				l1.val=sum-10;
			}
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
			if(node.val<9){
				if(flag){
					node.val++;
					flag=false;
				}
				break;
			}else{//该节点的值为9
				if(flag){//前面有进位
					node.val=0;
//					flag=true;
				}else{
					break;
				}
			}
			pre1=node;
			node=node.next;
		}
		//最后再判断一下是不是需要添加新节点
		if(flag){
			ListNode tail=new ListNode(1);
			pre1.next=tail;
		}

		while(h1!=null){//output para
			System.out.print(h1.val+"　");
			h1=h1.next;
		}

		return h1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1=new ListNode(9);
		ListNode l2=new ListNode(0);
		ListNode l3=new ListNode(1);
		ListNode l4=new ListNode(6);
		ListNode l5=new ListNode(1);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		ListNode n1=new ListNode(5);
		ListNode n2=new ListNode(8);
		ListNode n3=new ListNode(2);
		ListNode n4=new ListNode(6);
		ListNode n5=new ListNode(1);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		addTwoNumbers(l1,n1);
	}

}
