package two;

public class LinkList {
	 Node first=new Node();
	 /**添加节点
	  * 
	  * @param d
	  */
	 void append(int d){
		 Node end=new Node(d);
		 Node n=first;
		 while(n.next!=null){
			 n=n.next;
		 }
		 n.next=end;
	 }
 /**输出链表
  * 
  */
 public void printlink(){
	 Node ptr;
	 ptr=first.next;
	 while(ptr!=null){
		 System.out.print(ptr.getData()+"\t");
		 ptr=ptr.next;
	 }
 }
 /**初始化链表
  * 
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
 public int length1(Node node){
	 int i=0;
	 while(node!=null){
		 i++;
		 node=node.next;
	 }
	 return i;
 }
}
