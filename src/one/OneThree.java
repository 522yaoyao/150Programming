package one;

import java.util.Arrays;

public class OneThree {
	public static void main(String[ ]  args){
		String str1="abced";
		String str2="abcde";
		OneThree  one=new OneThree();
		System.out.println(one.permutation1(str1,str2));
	}
/**
 * 将一个字符串重新排序，判断是否与另一个字符串相等
 */
	public String sort(String s){
		char[ ]   content=s.toCharArray();
		Arrays.sort(content);
		return   new String(content);
	}
	public boolean permutation1(String s,String t){
		if(s.length()!=t.length())
			return false;
		return sort(s).equals(sort(t));
	}
	public boolean permutation2(String s,String t){
		if(s.length()!=t.length()){
			return false;
		}
		char[] s_array=s.toCharArray();
		char[] t_array=t.toCharArray();
		char[] array=new char[256];//假定条件
		for(char c: s_array)
			array[c]++;
		for(char i: t_array){
			if(--array[i]<0){
				return false;
			}
				
		}
	return true;	
			}
}
