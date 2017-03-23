package com.xjtuse.easy;

public class ReverseLinkedListII_1 {
	//使用社区的一种算法，主要的优化在于：只要找到start节点就行了，然后从都向后的逆置
	//直到尾节点
	public static ListNode reverseBetween(ListNode head,int m,int n){
		
		if(m==n){
			return head;
		}
		ListNode virtual=new ListNode(0);
		virtual.next=head;
		ListNode t=virtual,pre,start,end,then1 = null,then2;
		int i;
		for(i=1;i<m;i++){//寻找start节点
			t=t.next;
		}
		pre=t;//用来记录逆置序列的前一个节点位置
		start=pre.next;
		
		System.out.print(start.val+"\t");
		then1=start.next;
		while(i<n){//从开始节点依次的一对一对的逆置节点
			i++;
			then2=then1.next;
			then1.next=start;
			start=then1;
			then1=then2;

		}
		t.next.next=then1;
		pre.next=start;//重要的错误，应当将该语句置于上句之后否则错误
		return virtual.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		ListNode n6=new ListNode(6);
		ListNode n7=new ListNode(7);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		ListNode head=reverseBetween(n1,1,2);
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
	}

}
