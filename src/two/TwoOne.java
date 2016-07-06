package two;

import java.util.Hashtable;

public class TwoOne {	
	public static void main(String[] args){
		LinkList linkList=new LinkList();
	    int[] a={1,1,3,3,5,6};
		linkList.initLinkList(a);
		deleteDups(linkList.first.next);
	//	deleteDups2(linkList.first);
		linkList.printlink();
	}
/**
 * 移除未排序链表的重复节点	
 * @param n
 */
	public static void deleteDups(Node n){
		Hashtable table=new Hashtable();
		Node previous=null;
		while(n!=null){
			if(table.containsKey(n.data))
				previous.next=n.next;
			else{
				table.put(n.data, true);
				previous=n;
			}
			n=n.next;
		}
	}
	/**
	 * 移除未排序的链表的重复节点，不占用额外的内存
	 * @param head
	 */
	public static void deleteDups2(Node head){
		if(head==null){
			return;
		}
		Node current=head.next;
		//书中原句如下，从表头就开始比较；
      //  Node current=head;
		while(current!=null){
			Node runner=current;
			while(runner.next!=null){
				if(current.data==runner.next.data)
					runner.next=runner.next.next;
				else
					runner=runner.next;
			}
			current=current.next;
		}
		
	}
	

}
