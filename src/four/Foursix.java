package four;

import java.util.ArrayList;

public class Foursix {
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7,8,9};
		//ArrayList��һ���࣬����ArrayList�������ݴ洢��ʱ��һ��Ҫ��ʼ����
		ArrayList<Node> list=new ArrayList<Node>();
		Tree tree=new Tree();
		tree.creatTree(a);
		Node root=tree.nodeList.get(0);
		copy(root,list);
		Node node=inOrderSucc(root.leftChild,list);
		System.out.println(node.data);
		
	}
	
	public static  void copy(Node root,  ArrayList<Node> array){
		/*ͨ������������ڵ����δ���������*/
		if(root==null)
			return;
		copy(root.leftChild,array);
		array.add(root);
       //System.out.println(root.data);
		copy(root.rightChild,array);
		}
	/**
	 * ���һ���㷨���ҳ���ָ���ڵ�ġ������̡���
	 * @param node
	 * @param array
	 * @return
	 */
	public static Node inOrderSucc(Node node,ArrayList<Node> array){
		if(node==null)
			return null;
		
           for(int i=0;i<array.size();i++){
        	   if(array.get(i)==node)
        		   return array.get(i+1);
           }
           
        	   return null;
	}

}
