package practice.polym;

/**
 * ����һ��������
 * @author zx
 *
 */
 abstract class Animals{
	public abstract  void print();
}

class Dog extends Animals{
	@Override
	public void print(){
		System.out.println("������");
	}
}

class Cat extends Animals{
	@Override
	public void print(){
		System.out.println("������");
	}
}