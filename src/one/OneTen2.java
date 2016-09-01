package one;

import java.util.*;

public class OneTen2 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str=null;
		while(in.hasNext()){
			str=in.nextLine();//将一行作为一个字符串；
	//		str=in.next();
	//会将空格自动视为分隔符；
			String[] s=str.split(" ");
			StringBuilder str1=new StringBuilder();
			for(int i=s.length-1;i>=0;i--){
				str1.append(s[i]);
				str1.append(" ");
//System.out.println(s[i]);
			}
			str=str1.toString();
			System.out.println(str);
		}
		System.out.println(str);
	}

}
