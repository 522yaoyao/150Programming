package practice.polym;

public class One {
	//��ת�Ͷ����ȸ���ջ�е����ã����ࣩȥ������Ѱ�Һ��ʵķ���������������������ʵ��������ࣨ���ࣩ��д���͵�������ķ��������û�о͵��ø����
	public static void main(String[] args){
		A a1=new A();
		A a2=new B();
		B b=new B();
		a1.show(a1);
		a2.show(a2);
		a2.show(a1);
		D d=new D();
		C c=new C();
		a2.show(d);
		a2.show(c);
		System.out.println("---------------------------------------------------------");
		a1.show(b);//����A���е�show(A obj)����
		a1.show(c);//����A���е�show(A obj)����
		a1.show(d);//����A���е�show(D obj)��������ΪҪѡ����ǡ���ķ�������A������show(D obj),��ѡ��show(A obj);
		//a2����ת�Ͷ���
		a2.show(b);//ԭ��Ӧ�õ���A�����show(A obj)������������������B����д��show(A obj)���������Ե���B�����show(A obj)����
		b.show(b);
		a2.show(c);//ԭ��Ӧ�õ���A�����show(A obj)������������������B����д��show(A obj)���������Ե���B�����show(A obj)����
		a2.show(d);//Ӧ�õ���A�����show(A obj)����,����������B��û����дshow(D obj)���������Ե���A�����show(D obj)����
		b.show(b);//����B���show(B obj)����
		b.show(c);//����B���show(B obj)����,��ΪC��B������
		b.show(d);//��ʵB����Ĭ�����Ѿ�����show(A obj)--���ǣ� show(B obj)--������ show(D obj)--�̳У�����ѡ����ǡ����show(D obj)
     }
}

class A{
	public void  show(A obj){
		System.out.println("class A and obj A");
	}
	
	public void  show(D obj){
		System.out.println("class A and obj D");
	}
}

class B extends A{
	public void  show(A obj){
		System.out.println("class B and obj A");
	}
	
	public void show(B obj){
		System.out.println("class B and obj B");
	}
}

class D extends B{}

class C extends B{}

