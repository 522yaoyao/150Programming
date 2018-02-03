package designpattern;

//迭代器模式
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

// 创建实现了Container接口的实体类
class NamwRepository implements Container{
	public String names[] = {"Robert", "John", "Julie", "Lora"};

	// 每个集合里面有一个自己特定的迭代器
	public Iterator getIterator(){
		return new MyIterator();
	}

	// 因为每个集合的遍历方式不同，每个集合都有一个自己特定的迭代器，
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