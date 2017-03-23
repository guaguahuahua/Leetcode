package com.xjtuse.easy;

public class RemoveDuplicatesFromSortedListII {
	//˼�룺p,q,pre�Լ�count�����е��ظ��ڵ�һ���������ˣ�ֱ��ɾ��
	public static ListNode deleteDuplicates(ListNode head){
		
		if(head==null || head.next==null){//����Ϊ�ջ��߽���һ���ڵ�����
			return head;
		}
		ListNode virtual=new ListNode(0);//��Ҫ��Ϊ�˽��ͷ�ڵ����ظ��ڵ������
		virtual.next=head;
		ListNode pre=virtual,q=head,p=q.next;
		
		while(p!=null && q!=null){//�����������ڵ�Ż����ظ���
			if(p.val!=q.val){//������������ڵ��ֵ�����
				pre=q;
				q=p;
				p=p.next;//����������������ƶ�һλָ��
			}else{//����������ڽڵ��ֵ���
				while(p!=null && p.val==q.val){
					p=p.next;
				}
				pre.next=p;//ɾ���м���ظ��ڵ�
				if(p!=null){//��ֹ�ظ��ڵ�պ��ڽ�β
					q=p;
					p=p.next;
				}
			}
		}
		return virtual.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(1);
		ListNode n3=new ListNode(2);
		ListNode n4=new ListNode(3);
		ListNode n5=new ListNode(4);
		ListNode n6=new ListNode(4);
		ListNode n7=new ListNode(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		ListNode head=deleteDuplicates(n1);
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
	}

}
