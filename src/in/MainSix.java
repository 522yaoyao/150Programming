package in;

import java.util.*;

public class MainSix {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			String str=in.next();
			str=print(str);
			System.out.println(str);
		}
		
	}
	/**
	 * 字符串的去重排序（按ASCII排序）；
	 * @param str
	 * @return
	 */
	public static String print(String str){
		char[] a=str.toCharArray();
		Arrays.sort(a);
		ArrayList<Character> arr=new ArrayList<Character>();
		for(int i=0;i<a.length;i++){
			if(!arr.contains(a[i])){
				arr.add(a[i]);
			}
		}
		char[] b=new char[arr.size()];
		for(int j=0;j<b.length;j++){
			b[j]=arr.get(j);
		}
		return new String(b);
	}

}
