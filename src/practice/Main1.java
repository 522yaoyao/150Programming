package practice;

import java.util.*;
/**
 * �������������Ҫ׼�������ֲ�ͬ�Ĳ��ϣ�
 * @author zx
 *
 */
public class Main1 {
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);//����һ����������
		HashSet<String> hash=new HashSet<String>();//����һ����ϣ��
		while(cin.hasNext()){
			
			//�����һ����Ϊһ���ַ����������ո񣩣�
			//hash.add(cin.nextLine());
			hash.add(cin.next());//��Ч�ַ�Ϊһ���ַ������ո�,Tab,Enter��Ϊ�ָ�����
		}
		int num=hash.size();
		System.out.println(num);//ǿ�ƽ�������ΪCtrl+Z;
		//}
		
	}

}
