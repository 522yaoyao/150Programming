package eleven;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main (String[] args){
	int n;
	int k;
	String str="";
	Scanner in = new Scanner(System.in);
	while(in.hasNext()){
		n=in.nextInt();
		k=in.nextInt();
	//	String str="";
	//	System.out.println(n);	
		for(;n>0;n--){
		String  s=in.next();//nextLine �ڽ������ַ���֮ǰ������һ���ַ���δ��ʾ����n-1;
		 str=str+s;
		System.out.println(n);	
		}
	
		System.out.println(str);	
}
}
}