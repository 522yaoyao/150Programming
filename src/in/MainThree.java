package in;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainThree {
	 public static void main(String[] args){
	        Scanner in=new Scanner(System.in);
	        while(in.hasNext()){
	            int length=in.nextInt();
	            int[] a=new int[length];
	            for(int i=0;i<a.length;i++){
	                a[i]=in.nextInt();
	            }
	            int[] arr=returnArr( a);
	            for(int i=0;i<arr.length;i++){
	                System.out.print(arr[i]+"\t");
	            }
	        }
	    }
	    public static int[] returnArr(int[] a){
	        Set<Integer> set=new TreeSet<Integer>();
	        for(int i=0;i<a.length;i++){
	            set.add(a[i]);
	        }
	       int length=set.size();
	        int[] array=new int[length];
	        Iterator  iterator1=set.iterator();
	        for(int j=0;j<set.size();j++){
	            array[j]=(int)iterator1.next();
	            
	        }
	        return array;
	    }


}
