package four;

import java.util.ArrayList;

public class TreeTwo {
	ArrayList<NodeTwo> nodeList;
	/**
	 * ½¨Ê÷
	 * @param a
	 */
	public void createtree(int[] a){
		nodeList=new ArrayList<NodeTwo>();
		for(int i=0;i<a.length;i++){
			nodeList.add(new NodeTwo(a[i]));
		}
		for(int i=0;i<a.length/2-1;i++){
			nodeList.get(i).leftChild=nodeList.get(i*2+1);
			nodeList.get(i*2+1).parent=nodeList.get(i);
			nodeList.get(i).rightChild=nodeList.get(i*2+2);
			nodeList.get(i*2+2).parent=nodeList.get(i);
		}
		int lastParentIndex=a.length/2-1;
		nodeList.get(lastParentIndex).leftChild=nodeList.get(lastParentIndex*2+1);
		nodeList.get(lastParentIndex*2+1).parent=nodeList.get(lastParentIndex);
		if(a.length%2==1){
			nodeList.get(lastParentIndex).rightChild=nodeList.get(lastParentIndex*2+2);
			nodeList.get(lastParentIndex*2+2).parent=nodeList.get(lastParentIndex);
		}
		
	}

}
