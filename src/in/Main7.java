package in;

import java.util.*;

/**
 * �ҳ����Ե�Ԫ������Сд��ͬ����
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
	int kind=set.size();//Ԫ���ַ����������ִ�Сд��
	int length=array.size();//Ԫ���ַ��ĳ��ȣ�
	int lengthOthers=str.length()-length;//�����ַ��ĳ��ȣ�
	System.out.println(kind+" "+length+" "+lengthOthers);
	Iterator iterator2=array.iterator();
	for(int j=0;j<array.size();j++){
		
		System.out.print(iterator2.next());//��������ҵ���Ԫ������˳�������
		}
			}
		
	
		
	}

}
