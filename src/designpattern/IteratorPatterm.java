package designpattern;

//������ģʽ
public class IteratorPatterm{
	public static void main(String[] args){
		Iterator iterator = new NamwRepository().getIterator();
		while(iterator.hasNext()){
			String name = (String)iterator.next();
			System.out.println(name);

		}
	}

}

interface Iterator{
	boolean hasNext();

	Object next();
}

interface Container{
	Iterator getIterator();
}

// ����ʵ����Container�ӿڵ�ʵ����
class NamwRepository implements Container{
	public String names[] = {"Robert", "John", "Julie", "Lora"};

	// ÿ������������һ���Լ��ض��ĵ�����
	public Iterator getIterator(){
		return new MyIterator();
	}

	// ��Ϊÿ�����ϵı�����ʽ��ͬ��ÿ�����϶���һ���Լ��ض��ĵ�������
	private class MyIterator implements Iterator{

		int index;

		public boolean hasNext(){
			if(index < names.length) return true;
			else return false;
		}

		public Object next(){
			if(hasNext()) return names[index++];
			else return null;
		}
	}

}