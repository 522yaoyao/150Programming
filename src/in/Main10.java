package in;

import java.util.Scanner;

/**
 * ���һ�����Σ�
 * @author zx
 *
 */
public class Main10 {
	public static void main(String[] args){
		   Scanner in=new Scanner(System.in);
		   System.out.println("���������ε�����������Ϊ������");
	        while(in.hasNext()){
	        	int x=in.nextInt();
	        	  print( x);
	        }
	 
	
		}
	/**
	 * ������Σ�
	 */
	public  static void print(int x){
	         int a=-(x/2);
	         int b=(x/2)+1;
	      //   System.out.println(a);
		for(int i=0;i<x;i++,a++){//�����������
			for(int j=0;j<Math.abs(a);j++){
              System.out.print("  ");	//ÿ������ġ� ������			
			}
			for(int k=0;k<2*(b-Math.abs(a))-1;k++){
				System.out.print("$");
			
			}
//.out.print("*");
			System.out.println("");
		}
			
	}
}
