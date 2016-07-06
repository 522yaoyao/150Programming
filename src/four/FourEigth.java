package four;

public class FourEigth {
	public static void main(String[] args){
		Tree tree1=new Tree();
		Tree tree2=new Tree();
		int[] a={1,2,3,4,5,6,7,8,9};
		int[] b={3,6,7};
		tree1.creatTree(a);
		tree2.creatTree(b);
		Node root1=tree1.nodeList.get(0);
	    Node root2=tree2.nodeList.get(0);
	    System.out.println(containsTree(root1,root2));
	    
	}
	/**
	 * 判断一棵树是否为另一颗树的子树
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static boolean containsTree(Node t1,Node t2){
		if(t2==null)
			return true;
		return subTree(t1,t2);
	}
	public static boolean  subTree(Node r1,Node r2){
		if(r1==null)
			return false;//大的那棵树以空，仍未匹配；
		if(r1.data==r2.data){
			if(matchTree(r1,r2))
				return true;
		}
			
		return subTree(r1.leftChild,r2)||subTree(r1.rightChild,r2); 
	}
	public static boolean matchTree(Node r1,Node r2){
		if(r1==null&&r2==null)
			return true;
		if(r1==null||r2==null)
			return false;
		if(r1.data!=r2.data)
			return false;
		return matchTree(r1.leftChild,r2.leftChild)&&matchTree(r1.rightChild,r2.rightChild);
	}


}
