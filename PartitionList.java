package com.xjtuse.easy;

public class PartitionList {

	public static ListNode partition(ListNode head, int x){
		
		ListNode virtual=new ListNode(0);
		ListNode insert=null,back,temp,t;
		boolean flag=false;//���ɾ���ڵ����Ϊ��������ô���ƶ�t��λ��
		virtual.next=head;
		t=virtual;
		
		//��һ�α������ҵ������
		while(t.next!=null){
			if(t.next.val>=x){
				insert=t;
				t=t.next;//������ָ��t����ƶ�һλ
				break;
			}
			t=t.next;
		}
		System.out.print(insert.val+"\t");
		t=head;
		//�ڶ��α������ڶ��������Ǳ�֤���ҵ��˲����
		while(t!=null && t.next!=null){//�ڶ��α�����Ѱ��С��x�Ľڵ㣬�����뵽��Ӧ��λ��
			if(t.next.val<x){
				temp=t.next;
				t.next=t.next.next;//ɾ���ڵ�
				back=insert.next;//���ýڵ���뵽insertλ��֮��
				insert.next=temp;
				temp.next=back;
				insert=insert.next;//����ƶ�����ڵ㣬��֤���˳��
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
