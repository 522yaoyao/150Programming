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
			  /*a是Animal 类型的无法添加到dogs中，必须进行强制类型转换*/
			  dogs.add((Dog)a);//强制类型转换：（低数据类型）变量或常量
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
		  /*时戳小的是先入队的，所以出队先出时戳小的*/
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
  
  
  
  
  
  
  
  