package three;

import java.util.LinkedList;

public class ThreeSeven {
	public static void main(String[] args){
		AnimalQueue queue=new AnimalQueue();
		for(int i=0;i<3 ;i++){
			Dog dog=new Dog("Dog "+i);
			queue.enqueue(dog);
			Cat cat=new Cat("Cat "+i);
			queue.enqueue(cat);
			}
	    System.out.println(queue.dequeueAny().name);
	    System.out.println(queue.dequeueDogs().name); 
	    System.out.println(queue.dequeueCats().name);
	    System.out.println(queue.dequeueCats().name);
	    //System.out.println(queue.dequeueAny().name);
	    //System.out.println(queue.dequeueAny().name);
	    //System.out.println(queue.dequeueAny().name);
	   
	    
	    
	
	}

}
  class AnimalQueue{
	  LinkedList<Dog> dogs=new  LinkedList<Dog>();
	  LinkedList<Cat> cats=new LinkedList<Cat>();
	 private int order=0;
	  public void enqueue(Animal a){
		  a.setOrder(order);
		  order++;
		  if(a instanceof Dog )
			  /*a��Animal ���͵��޷���ӵ�dogs�У��������ǿ������ת��*/
			  dogs.add((Dog)a);//ǿ������ת���������������ͣ���������
		  else if(a instanceof Cat)
			  cats.add((Cat)a);
	  }
	  public Animal dequeueAny(){
		  
		  if(cats.size()==0)
			  return dequeueDogs();
		  if(dogs.size()==0)
			  return dequeueCats();
		  Dog dog=dogs.peek();
		  Cat cat=cats.peek();
		  Animal a= olderAnimal(dog,cat);
		  if(a instanceof Dog )
			  dequeueDogs();
		  if(a instanceof Cat )
			  dequeueCats();
			  
		
		  return a;
		 
	  }
	  public Dog dequeueDogs(){
		  return dogs.poll();
	  }
	  public Cat dequeueCats(){
		  return cats.poll();
	  }
	  public Animal olderAnimal(Animal a,Animal b){
		  /*ʱ��С��������ӵģ����Գ����ȳ�ʱ��С��*/
			if(a.order<b.order)
				return a;
			else
				return b;
		}
  }
  class  Animal{
	 int order;
	 String name;
	public Animal(String n){
		name=n;
	}
	public void setOrder(int ord){
		order=ord;
	}
	public int getOrder(){
		return order;
	}
	
}
  class Cat extends Animal{
	  public Cat(String n){
		  super(n);
	  }
  }
  
  class Dog extends Animal{
	  public Dog(String n){
		  super(n);
	  }
 }
  
  
  
  
  
  
  
  