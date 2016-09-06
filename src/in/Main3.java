package in;

import java.util.*;

public class Main3 {
	 public static void main(String[] args){
	        Scanner in=new Scanner(System.in);
	        while(in.hasNext()){
	            int length=in.nextInt();
	            int[] a=new int[length];
	            for(int i=0;i<a.length;i++){
	                a[i]=in.nextInt();
	            }
	            int[] arr=returnArr( a);
	        }
	    }
	    public static int[] returnArr(int[] a){
	        Set<Integer> set=new TreeSet<Integer>();
	        for(int i=0;i<a.length;i++){
	            set.add(a[i]);
	        }
	        int[] array=new int[set.size()];
	        Iterator  iterator=set.iterator();
	        for(int j=0;j<set.size();j++){
	            array[j]=(int)iterator.next();
	        }
	        return a;
	    }

}
