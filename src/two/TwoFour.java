package two;

public class TwoFour {
	public static void main(String[] args){
		LinkList link=new LinkList();
		int[]  a={7,3,5,6,8,4,3,2};
		link.initLinkList(a);
		/*应该从第一个节点开始比较，而不是从内容为空的头节点开始比较*/
		Node  head=partition2(link.first.next ,4);
		while(head!=null){
			System.out.print(head.data+"\t");
			head=head.next;
		}
	}
	/**
	 * 以定值x为基准将链表分割成两个部分所有小于x的节点排在大于等于x节点之前
	 * @param node
	 * @param x
	 * @return
	 */
	public static Node partition(Node node,int x){
		Node beforeStart=null;
		Node beforeEnd=null;
		Node afterStart=null;
		Node afterEnd=null;
		/*分割链表*/
		while(node!=null){
			Node next=node.next;
			node.next=null;
			/*将小于x的插入before链表*/
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
		/*合并两个链表*/
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
				/*将节点插入beforeStart的前面*/
				node.next=beforeStart;
				beforeStart=node;
			}
			else{
				/*将大于等于x的节点插入afterStart前面*/
				node.next=afterStart;
				afterStart=node;
			}
			node=next;
		}
		/*合并两个链表*/
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
