package in;

import java.util.*;

public class Main2{
	public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str=in.next();
            String k=in.next();;
       int  c=charNum(str,k);
            System.out.println(c);
        }
        
    }
	/**
	 * 写出一个程序，接受一个有字母和数字以及空格组成的字符串，
	 * 和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写
	 * ABCDEF
       A
       1
	 * @param str
	 * @param k
	 * @return
	 */
   public static int charNum(String str,String k){
        int[] arr=new int[256];
        String s=str.toLowerCase();
        for(int i=0;i<s.length();i++){
            int index=(int)s.charAt(i);
//  System.out.print(index+"\t");
            arr[index]++;
 // System.out.println(arr[index]);
        }
        int index=(int)k.charAt(0);
        if(index>=65&&index<=90)
        	index=index+32;
        System.out.println(index);
        return arr[index];
    }
    /*public static int charNum(String str,String k){
    	return 1;
    }*/
    
    
}