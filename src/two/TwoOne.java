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
 * �Ƴ�δ����������ظ��ڵ�	
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
	 * �Ƴ�δ�����������ظ��ڵ㣬��ռ�ö�����ڴ�
	 * @param head
	 */
	public static void deleteDups2(Node head){
		if(head==null){
			return;
		}
		Node current=head.next;
		//����ԭ�����£��ӱ�ͷ�Ϳ�ʼ�Ƚϣ�
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
