package in;

import java.util.Scanner;

/**
 * 输出一个菱形；
 * @author zx
 *
 */
public class Main10 {
	public static void main(String[] args){
		   Scanner in=new Scanner(System.in);
		   System.out.println("请输入菱形的行数（行数为奇数）");
	        while(in.hasNext()){
	        	int x=in.nextInt();
	        	  print( x);
	        }
	 
	
		}
	/**
	 * 输出菱形；
	 */
	public  static void print(int x){
	         int a=-(x/2);
	         int b=(x/2)+1;
	      //   System.out.println(a);
		for(int i=0;i<x;i++,a++){//输出的行数；
			for(int j=0;j<Math.abs(a);j++){
              System.out.print("  ");	//每行输出的“ ”数；			
			}
			for(int k=0;k<2*(b-Math.abs(a))-1;k++){
				System.out.print("$");
			
			}
//.out.print("*");
			System.out.println("");
		}
			
	}
}
