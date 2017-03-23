package com.xjtuse.easy;

public class RotateList {

	public static ListNode rotateRight(ListNode head,int k){
		
		if(head==null){
			return head;
		}
		ListNode virtual=new ListNode(0);
		ListNode fast=virtual,slow=virtual,count=head;
		ListNode pre=null,result;
		virtual.next=head;
		int length=0;//这是用来记录整个链表长度的，对所有的参数k进行取余操作后才进行旋转，防止溢出的发生
		while(count!=null){
			length++;
			count=count.next;
		}
		k=k%length;
		if(k==0){//当参数为0，则说明不用旋转
			return head;
		}
		while(k>=0){//移动fast 使得产生间距
			fast=fast.next;
			k--;
		}
		while(fast!=null){//将slow指向即将删除节点的前一位
			fast=fast.next;
			slow=slow.next;
		}
		pre=slow;//该节点最后要变成尾巴
		slow=slow.next;
		result=slow;
		pre.next=null;//将尾巴置空
		while(slow!=null){//将slow节点移动到尾部，pre指向最后一个节点
			pre=slow;
			slow=slow.next;	
		}
		if(result==head){//这是防止旋转整个单链表的时候讲头尾接到一起形成死循环
			return head;
		}
		pre.next=head;//至此，旋转结束
		return result;
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
		ListNode head=rotateRight(n1,5);
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
	}
}
