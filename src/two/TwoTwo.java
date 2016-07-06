package two;

public class TwoTwo {
	public static void main(String[] args){
		LinkList link=new LinkList();
		int[] a={1,2,3,4,4,6};
		link.initLinkList(a);
		
		nthToLast(link.first,1);
		IntWrapper wapper=new IntWrapper();
		System.out.println(nthToLast2(link.first,2,wapper).data);
		System.out.println(nthToLast3(link.first ,4).data);
		}
	/**
	 * 找出单向链表的倒数第k个节点
	 * 递归方法
	 * @param head
	 * @param k
	 * @return
	 */
	public static  int nthToLast(Node head, int k){
		if(head==null)
			return 0;
	int	i=nthToLast(head.next, k)+1;
	if(i==k){
	    System.out.println(head.data);
	}
	return i;
	}
	/**
	 * 找出单向链表的倒数第k个节点利用一个包装类包裹计数器值；
	 * @param head
	 * @param k
	 * @param i
	 * @return
	 */
    public static Node nthToLast2(Node head,int k,IntWrapper i ){
    	if(head==null)
    		return null;
    	Node node=nthToLast2(head.next,k,i);
    	i.value=i.value+1;
    	if(i.value==k){
    		return head;
    	}
    	return node;
    }
	//迭代法
    public static Node nthToLast3(Node head,int k){
    	if(k<=0)
    		return null;
    	Node p1=head;
    	Node p2=head;
    	for(int i=0;i<k-1;i++){
    		p2=p2.next;
    	}
    	if(p2==null){
    		return null;
    	}
    	while(p2.next!=null){
    		p1=p1.next;
    		p2=p2.next;
    	}
    	return p1;
    }
	
	
	
}
//包装类，包裹计数器值
class IntWrapper{
	int value=0;
}