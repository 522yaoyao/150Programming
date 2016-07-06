package two;

public class TwoFour {
	public static void main(String[] args){
		LinkList link=new LinkList();
		int[]  a={7,3,5,6,8,4,3,2};
		link.initLinkList(a);
		/*Ӧ�ôӵ�һ���ڵ㿪ʼ�Ƚϣ������Ǵ�����Ϊ�յ�ͷ�ڵ㿪ʼ�Ƚ�*/
		Node  head=partition2(link.first.next ,4);
		while(head!=null){
			System.out.print(head.data+"\t");
			head=head.next;
		}
	}
	/**
	 * �Զ�ֵxΪ��׼������ָ��������������С��x�Ľڵ����ڴ��ڵ���x�ڵ�֮ǰ
	 * @param node
	 * @param x
	 * @return
	 */
	public static Node partition(Node node,int x){
		Node beforeStart=null;
		Node beforeEnd=null;
		Node afterStart=null;
		Node afterEnd=null;
		/*�ָ�����*/
		while(node!=null){
			Node next=node.next;
			node.next=null;
			/*��С��x�Ĳ���before����*/
			if(node.data<x){
				if(beforeStart==null){
					beforeStart=node;
					beforeEnd=beforeStart;
				}
				else{
					beforeEnd.next=node;
					beforeEnd=node;
				}
				}
			else{
				if(afterStart==null){
					afterStart=node;
					afterEnd=afterStart;
				}
				else{
					afterEnd.next=node;
					afterEnd=node;
				}
			}
			node=next;
		}
		/*�ϲ���������*/
		if(beforeStart==null)
			return  afterStart;
		beforeEnd.next=afterStart;
		return beforeStart;
	}
	public static Node  partition2(Node node, int x){
		Node beforeStart=null;
		Node afterStart=null;
		while(node!=null){
			Node next=node.next;
			if(node.data<x){
				/*���ڵ����beforeStart��ǰ��*/
				node.next=beforeStart;
				beforeStart=node;
			}
			else{
				/*�����ڵ���x�Ľڵ����afterStartǰ��*/
				node.next=afterStart;
				afterStart=node;
			}
			node=next;
		}
		/*�ϲ���������*/
		if(beforeStart==null)
			return  afterStart;
		Node head=beforeStart;
		while(beforeStart.next!=null){
			beforeStart=beforeStart.next;
		}
		beforeStart.next=afterStart;
		return head;
	}
}
