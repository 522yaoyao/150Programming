package one;

import java.util.*;

public class Eleven {
	public static void main(String[] args){
	   int[] a={2,1,1,5,7,8,9};
	   int[] b;
	   b=delete(a);
	   for(int i=0;i<b.length;i++){
		   System.out.print(b[i]+"\t");
	   }
		
	}
	/**
	 * 删除数组中重复的元素（顺序不变）；
	 * @param arr
	 * @return
	 */
	public static int[] delete(int[] arr){
		/*Set<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}*/
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			if(!list.contains(arr[i])){
				list.add(arr[i]);
				}
		}
			int[] a=new int[list.size()];
			Iterator iterator=list.iterator();
			for(int j=0;j<a.length;j++){
				a[j]=(int)iterator.next();
			}
		
		return a;
	}

}
