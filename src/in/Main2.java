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
	 * д��һ�����򣬽���һ������ĸ�������Լ��ո���ɵ��ַ�����
	 * ��һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд
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