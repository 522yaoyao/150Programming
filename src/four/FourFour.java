package four;

import java.util.ArrayList;
import java.util.LinkedList;

public class FourFour {
	public static void main(String[] args){
		Tree tree=new Tree();
		int[] a={1,2,3,4,5,6,7,8,9};
		tree.creatTree(a);
		Node root=tree.nodeList.get(0);
		ArrayList<LinkedList<Node>> list=createLevelLinkedList2(root);
	LinkedList<Node> link=	list.get(2);
	System.out.println(link.get(0).data);
	/*int i=0;
		while(link.get(i)!=null){
		
			System.out.println(link.get(i).data);
			i++;
		
		}*/

}
	
	public static void  createLevelLinkedList(Node root,ArrayList<LinkedList<Node>>  lists,int level){
		if(root==null)
			return;
		LinkedList<Node> list=null;
		if(lists.size()==level){
			/*lists�л�û�д˲�����*/
			list=new LinkedList<Node>();
			lists.add(list);
		}
		else{
			/*��lists�д��ڴ˲㣬��ȡ�˲�*/
			list=lists.get(level);
		}
		//�������
		list.add(root);//���ڵ����˲�
		createLevelLinkedList(root.leftChild,lists,level+1);
		createLevelLinkedList(root.rightChild,lists,level+1);
		
		 }
	public static ArrayList<LinkedList<Node>>  createLevelLinkedList(Node root){
		ArrayList<LinkedList<Node>> lists=new ArrayList<LinkedList<Node>>();
		   createLevelLinkedList(root,lists,0);
		   return lists;
	}
	public static ArrayList<LinkedList<Node>>  createLevelLinkedList2(Node root){
		ArrayList<LinkedList<Node>> result=new ArrayList<LinkedList<Node>>();
		LinkedList<Node> current=null;
		if(root!=null){
			//����һ��LinkedList<Node>����current,�Դ˶�����в�����
			current=new LinkedList<Node>();
			current.add(root);
			}
		while(current.size()>0){
			/*��ǰcurrent�д��ڽڵ㣬����������*/
			result.add(current);
			LinkedList<Node> parents=current;
			 current=new LinkedList<Node>();
			 for(Node parent:parents){
				 if(parent.leftChild!=null)
					 current.add(parent.leftChild);
				 if(parent.rightChild!=null)
					 current.add(parent.rightChild);
				 
			 }
		}
			
		
		return result;
	}

}
