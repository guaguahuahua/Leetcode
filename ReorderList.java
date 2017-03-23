package com.xjtuse.easy;

public class ReorderList {
	//�㷨˼�룺����ָ��ͬʱ������fast��slow���գ�slowָ����������е㣻
	//�����������ǽ��е�֮������еĽڵ�������ã������õ�����������Ȼ��
	//���������Ԫ�ش������������Ϳ��ԡ�
	public static void reorderList(ListNode head){
		
		if(head==null){
			return ;
		}
		//����Ѱ���е�����
		ListNode fast=head,slow=head,pre=null;
		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			pre=slow;
			slow=slow.next;
		}
		pre.next=null;
		fast=head;//����ǲ����õ�һ�����õ�ָ��
//		System.out.println(fast.val+" ");
//		System.out.println(slow.val+" ");
//		System.out.println(pre.val+" ");
		//�����е��Ժ�����нڵ�
		pre=slow;//�����õĵ�һ���ڵ�next�ڵ���Ϊ�� 
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
		//������������ϲ�Ψһ
		//�����ֱ�ӵĽ�slow��head��Ϊ����Ϊ������ô���ڲ��ȳ�������ͻᷢ������
		//���Խ����ǵȳ�������ͬ������ͬ���֣�ѭ���⴦��
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
