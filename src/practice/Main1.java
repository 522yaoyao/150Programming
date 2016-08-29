package practice;

import java.util.*;
/**
 * 完成所有料理需要准备多少种不同的材料；
 * @author zx
 *
 */
public class Main1 {
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);//创建一个输入流；
		HashSet<String> hash=new HashSet<String>();//创建一个哈希表；
		while(cin.hasNext()){
			
			//输入的一整行为一个字符串（包括空格）；
			//hash.add(cin.nextLine());
			hash.add(cin.next());//有效字符为一个字符串，空格,Tab,Enter均为分隔符；
		}
		int num=hash.size();
		System.out.println(num);//强制结束输入为Ctrl+Z;
		//}
		
	}

}
