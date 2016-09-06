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
	 /**
	  * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序
	  *按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。
	  * @param a
	  * @return
	  */
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
