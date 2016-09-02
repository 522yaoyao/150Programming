package util;

import java.util.*;

public class Array {
	public static void main(String[] args){
		Integer[] a={1,2,3,4,5};
		List<Integer> list=Arrays.asList(a);
		int b=list.get(2);
		//不可变，添加元素抛出异常；
	//	list.add(6);
		System.out.println(b);
		List<Integer> list1=new ArrayList<Integer>();
		for(int i=0;i<5;i++){
			list1.add(i);
		//	System.out.print(i+"\t");
		}
	/*	Iterator<Integer> iterator=list1.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+"\t");
		}
		list.toArray(new Integer[]{});
		Integer[] array=list1.toArray(new Integer[]{});
		Iterator iterator=list.iterator();*/
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.addAll(list1);
		Collections.addAll(set, 5,8,10,68);
		Iterator<Integer> iterator1=set.iterator();
		while(iterator1.hasNext()){
			System.out.print(iterator1.next()+"\t");
		}
		Hashtable<String,String>  hash=new Hashtable<String,String>();
		hash.put("aaa","ccc");
		hash.put("sss", "sss");
		Set<String> set1=hash.keySet();
	//	Collections.addAll(set1, "aaaa","bbb");
		
		for(String s:set1){
			System.out.print(s);
		}
	   	}

}
