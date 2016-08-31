package two;

public class LinkList {
	//定义头结点，便于从头检索；
	 Node first=new Node();
	 /**
	  * 添加节点
	  * @param d
	  */
	 void append(int d){
		 Node end=new Node(d);
		 Node n=first;
		 //使n移动到链表的最后一个节点
		 while(n.next!=null){
			 n=n.next;
		 }
		 n.next=end;
	 }
 /**
  * 输出链表
  */
 public void printlink(){
	 Node ptr=null;
	 //若此链表为空（只有头节点，立即返回）
	 if(first.next==null){
			return;
		}
ptr=first.next;
	 while(ptr!=null){
		 System.out.print(ptr.getData()+"\t");
		 ptr=ptr.next;
	 }
 }
 /**
  * 初始化链表（将一个数组中的数据一次存入链表中）；
  * @param n
  */
 public  void initLinkList(int[] n){
	 for(int i=0;i<n.length;i++){
		 append(n[i]);
	 }
 }
/**
 *  获取链表的第n个节点（不算头节点）
 * @param k
 * @return  Node
 */
 public  Node getNode(int n){
	 Node p1=first;
	 for(int i=0;i<n;i++)
		 p1=p1.next;
	 return p1;
 }
 /**
  * 找到链表的尾部
  * @param head
  * @return
  */
 public Node findLast(Node head){
	 Node last=head;
	 while(last.next!=null){
		 last=last.next ;
	 }
	 return last;
 }
 public int length(Node node){
	 int i=0;
	 while(node!=null){
		 i++;
		 node=node.next;
	 }
	 return i;
 }
 /**
  * 链表的长度(不含头结点，只有头结点的链表返回0)
  * @param node
  * @return
  */
 public int length(){
	 if(first.next==null)
		 return 0;
	 int l=0;
	  Node  node=first.next;
	 while(node!=null){
		 l++;
		 node=node.next;
	 }
	return l; 
	}
}
