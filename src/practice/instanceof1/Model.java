package practice.instanceof1;

import java.util.Comparator;

public class Model  implements Comparator{
			
			private int a;
			public Model (int s){
				a=s;
			}
			public void print(){
				System.out.println(a);
			}
			private  void print1(){
				System.out.println(a);
			}
			@Override
			public int compare(Object o1,Object o2){
				return 1;
			}

}
