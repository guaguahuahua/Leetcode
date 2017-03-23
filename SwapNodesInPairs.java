package com.xjtuse.easy;

public class SwapNodesInPairs {
	//��δ�����Ȼͨ���ˣ����ǲ������⣬��ΪҪ���ǲ��ܸı�ڵ��ֵ��ֻ�ܸı�ڵ㱾��
	public static ListNode swapPairs(ListNode head){
		
		if(head==null){//ͷΪ�յ�ʱ��
			return head;
		}
		ListNode slow=head,fast=slow.next;
		int temp=0;
		
		while(slow!=null && fast!=null){//�����ɶԵĽڵ��ֵ
			temp=fast.val;
			fast.val=slow.val;
			slow.val=temp;
			
			if(fast.next!=null){
				fast=fast.next.next;
				slow=slow.next.next;
			}else{
				break;
			}
		}

//		while(head!=null){
//		System.out.print(head.val+" ");
//		head=head.next;
//	}
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
		swapPairs(n1);
//		while(head!=null){
//			System.out.print(head.val+" ");
//			head=head.next;
//		}
	}

}
