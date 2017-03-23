package com.xjtuse.easy;

public class PartitionList {

	public static ListNode partition(ListNode head, int x){
		
		ListNode virtual=new ListNode(0);
		ListNode insert=null,back,temp,t;
		boolean flag=false;//如果删除节点的行为发生，那么不移动t的位置
		virtual.next=head;
		t=virtual;
		
		//第一次遍历，找到插入点
		while(t.next!=null){
			if(t.next.val>=x){
				insert=t;
				t=t.next;//将遍历指针t向后移动一位
				break;
			}
			t=t.next;
		}
		System.out.print(insert.val+"\t");
		t=head;
		//第二次遍历，第二个参数是保证了找到了插入点
		while(t!=null && t.next!=null){//第二次遍历，寻找小于x的节点，并插入到相应的位置
			if(t.next.val<x){
				temp=t.next;
				t.next=t.next.next;//删除节点
				back=insert.next;//将该节点插入到insert位置之后
				insert.next=temp;
				temp.next=back;
				insert=insert.next;//向后移动插入节点，保证相对顺序
				flag=true;
			}
			if(flag){
				flag=false;
				continue;
			}
			t=t.next;
		}
		return virtual.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(4);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(2);
		ListNode n5=new ListNode(5);
		ListNode n6=new ListNode(2);
//		ListNode n7=new ListNode(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
//		n6.next=n7;
		ListNode head=partition(n1,3);
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
	}

}
