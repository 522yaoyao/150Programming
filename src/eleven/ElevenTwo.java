package eleven;

import java.util.Hashtable;
import java.util.LinkedList;

public class ElevenTwo {
	public static void main(String[] args){
		String[] a={"bac","abc","cba","ert","tre","cab","ret","def"};
		sort(a);
	    print(a);
		
	
	}
	/**
	 * ���ַ������int�͵����飻
	 * @param s
	 */
	public static void toIntArray(String s){
		int a[]=new int[s.length()];
		for(int i=0;i<s.length();i++){
			a[i]=Integer.valueOf(s.charAt(i));
		
		}
	}
	/**
	 * ���ַ�������ĸ��С��������
	 */
	public static String  sortChar(String s){
		char[] a=s.toCharArray();
		char tmp;
		//��ð�ݷ���������
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]>a[j+1]){
					tmp=a[j];
				a[j]=a[j+1];
				a[j+1]=tmp;
				}
			}
		}
		return new String(a);
		//���� char ����������ض���������ַ�����ʾ��ʽ��
	//return String.valueOf(a);
		//����һ��������ַ�����ʽ��
	 //return a.toString();
	}
public static void sort(String[] str){
	Hashtable<String,LinkedList<String>> hash=new Hashtable<String,LinkedList<String>>();
	/*��ͬλ�ʷ���һ��*/
	for(String s:str){
		String key=sortChar(s);
		//System.out.println(key);
		if(!hash.containsKey(key)){
			hash.put(key,new LinkedList<String>());
		}
		LinkedList<String> anagram=hash.get(key);
	    anagram.add(s);
	}
	/*ת��Ϊ����*/
	int index=0;
	for(String key:hash.keySet()){
		LinkedList<String> list=hash.get(key);
		for(String t: list){
			str[index]=t;
			index++;
			//System.out.println(str[index]);
			
		}
	}
}
public static void print(String[] s){
	for(int i=0;i<s.length;i++){
		System.out.print(s[i]+"\t");
	}
	System.out.println();
	
}
}
