package practice.instanceof1;

import java.util.Comparator;
/**
 * instanceof�������÷���
 * @author zx
 *
 */
public class Test {
	public static void main(String[] args){
		Model m=new Model(2);
			m.print();//���е�˽�б�������ͨ�����з������ⲿ���ã�
			//t.print1();
			Boolean result1= m instanceof Model;
			Boolean result2= m instanceof Object;
			Boolean result3= m instanceof Comparator;
			System.out.println(result1);//�ж�һ�������Ƿ���һ�����ʵ����
			System.out.println(result2);//�ж�һ���˶����Ƿ�һ�������
			System.out.println(result3);//�ж�һ�������Ƿ�ʵ����ĳ���ӿڣ�
	}

}
