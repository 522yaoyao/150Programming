package in;

import java.util.Scanner;

public class TwoElevn {
	public static void main(String[] args){
		   Scanner in=new Scanner(System.in);
	        while(in.hasNext()){
	        	int x=in.nextInt();
	        	  print( x);
	        }
	 
	
		}
	/**
	 * ������Σ�
	 */
	public  static void print(int x){
	         int a=-x;
	         System.out.println(a);
		for(;a<=5;a++){//�����������
			for(int j=0;j<Math.abs(a);j++){
              System.out.print("  ");	//ÿ������ġ� ������			
			}
			for(int k=0;k<2*(6-Math.abs(a))-1;k++){
				System.out.print("$");
			
			}
//.out.print("*");
			System.out.println("");
		}
			
	}
}
