package four;

public class FourOne {
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7,8,9};
		Tree tree=new Tree();
		tree.creatTree(a);
		Node root=tree.nodeList.get(0);
		System.out.println(isBalanced(root));
		/*����һ�ò�ƽ�����*/
		Tree tree2=new Tree();
		tree2.creatTree(a);
		Node root2=tree2.nodeList.get(0);
		tree2.nodeList.get(7).leftChild=new Node(10);
		System.out.println(isBalanced(root2));
		
		
	/*	System.out.println("���������");
		tree.proOrderTraverse(root);
		System.out.println();
		System.out.println("���������");
		tree.inOrderTraverse(root);
		System.out.println();
		System.out.println("���������");
		tree.postOrderTraverse(root);*/
		
		
	}
	/**
	 * ��ȡ�ýڵ�ĸ߶�
	 * @param root
	 * @return
	 */
	public  static int checkHeight(Node root){
		if(root==null)
			return 0;
		int leftHeight=checkHeight(root.leftChild);
		if(leftHeight==-1)
			return -1;
		int rightHeight=checkHeight(root.rightChild);
		if(rightHeight==-1)
			return -1;
		int heightDiff=leftHeight-rightHeight;
		if(Math.abs(heightDiff)>1)
			return -1;
		else
			return Math.max(leftHeight, rightHeight)+1;
	}
	/**
	 * �ж��Դ˽ڵ�Ϊ�������Ƿ�ƽ�⣬ƽ��Ķ���Ϊ����һ���ڵ���������������ĸ߶Ȳ����һ��
	 * @param root
	 * @return
	 */
	public static boolean isBalanced(Node root){
		int height=checkHeight(root);
		if(height==-1)
			return false;
		else
			return true;
	}
	

}
