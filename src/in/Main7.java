package in;

import java.util.*;

/**
 * 找出所以的元音（大小写不同）；
 * @author zx
 *
 */
public class Main7 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
	    ArrayList<Character> array=new ArrayList<Character>();
		Character[] c={'a','e','i','o','u','A','E','I','O','U'};
		ArrayList<Character> list=new ArrayList<Character>();
		for(int k=0;k<c.length;k++){
			list.add(c[k]);
		}
		while(in.hasNext()){
			String str=in.nextLine();
	for(int i=0;i<str.length();i++){
				if(list.contains(str.charAt(i))){
				array.add(str.charAt(i));
				//System.out.print(str.charAt(i));
				}
				}
	
	Iterator iterator1=array.iterator();
	 TreeSet<Character> set=new TreeSet<Character>();
	 for(int t=0;t<array.size();t++){
		 set.add((Character) iterator1.next());
	 }
	int kind=set.size();//元音字符的种类区分大小写；
	int length=array.size();//元音字符的长度；
	int lengthOthers=str.length()-length;//其他字符的长度；
	System.out.println(kind+" "+length+" "+lengthOthers);
	Iterator iterator2=array.iterator();
	for(int j=0;j<array.size();j++){
		
		System.out.print(iterator2.next());//依次输出找到的元音并按顺序输出；
		}
			}
		
	
		
	}

}
