package util;

import java.util.*;

/**
 * list���򷽷���ʵ�֣�
 * @author zx
 *
 */
public class Test {
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		LinkedList<String> list=new LinkedList<String>();//����һ������
	/*	for(int i=0;i<5;i++){
			list.add(i);
		}
		*/
		list.add("2");
		list.add("6");
		list.add("1");
/*1��ʹ��������Ĭ�ϵķ�����*/
		Collections.sort(list);
		//print(list);
		LinkedList<Student> list1=new LinkedList<Student>();
	     for(int i=0;i<3;i++){
	    	 list1.add(new Student(20-i));
	     }
/*2��chongxieComparaor�ӿ��е�compate()������*/
	    Collections.sort(list1,new Comparator(){
	    	@Override
	    	public int compare(Object s1,Object s2){
	    		//���������
	    		return ((Student) s1).getAge()-((Student) s2).getAge();
	    		//�������
                //   return ((Student) s2).getAge()-((Student) s1).getAge();	    		
	    	}
	    	
	    	
	    });
	 /*   for(int i=0;i<list1.size();i++){
			System.out.print(list1.get(i).getAge()+"\t");
		}*/
	   LinkedList<Person> list2=new LinkedList<Person>();
	   Person p1=new Person(21,"ccc");
	   Person p2=new Person(19,"ecc");
	   Person p3=new Person(11,"qcc");
	   list2.add(p1);
	   list2.add(p2);
	   list2.add(p3);
/*3���ڹ���������дComparable�ӿڵ�compareTo()������*/
	   Collections.sort(list2);
	   for(int i=0;i<list2.size();i++){
			System.out.print(list2.get(i).getName()+"\t");
		}
	   
	}
/**
 * ������������е�Ԫ�أ�
 * @param list
 */
	public static  void print(LinkedList<Integer> list){
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+"\t");
		}
	}
}
/**
 * ����һ�������ࣻ
 * @author zx
 *
 */
class Student{
	int age;
	public Student(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	
}
class Person implements Comparable{
         int age;
         String name;
         
         public Person(int age,String name){
        	 this.age=age;
        	 this.name=name;
         }
         public int getAge(){
        	 return age;
         }
         public String getName(){
        	 return name;
         }
	@Override
	public int compareTo(Object o) {
		Person p=(Person)o;//ǿ������ת����
		int age=p.getAge();
		String name=p.getName();
//�����ַ����ıȽϣ�
	return this.getName().compareTo(name);
//int ���͵ıȽϣ�
	/*	if(this.age>age)
			return 1;
		else if(this.age<age)
			return -1;
		else
			return 0;*/
	}
	
}
