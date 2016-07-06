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
	 * �ҳ���������ĵ�����k���ڵ�
	 * �ݹ鷽��
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
	 * �ҳ���������ĵ�����k���ڵ�����һ����װ�����������ֵ��
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
	//������
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
//��װ�࣬����������ֵ
class IntWrapper{
	int value=0;
}