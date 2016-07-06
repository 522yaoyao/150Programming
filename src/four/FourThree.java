package four;

public class FourThree {
	public static void main(String[] args){
		int[] a={1,2,3,4,5,6,7,8,9,10};
		Node n=creatMinimalBST(a);
		System.out.println(n.data);
		System.out.println(n.rightChild.data);
		
		
		
		
	
		
	}
	public static  Node creatMinimalBST(int[] a,int start,int end){
		if(end<start)
			return null;
		int mid=(end+start)/2;
	
		Node node=new Node(a[mid]);
		
		node.leftChild=creatMinimalBST( a,start,mid-1);
	    node.rightChild=creatMinimalBST(a,mid+1,end);
		return node;
	}
	/**
	 * 给定一个有序数组，数组安升序排序，编写一个算法，创建一个高度最小的二叉查找树
	 */
	public static  Node creatMinimalBST(int[] a){
		return creatMinimalBST(a,0,a.length-1);
	}
	}


