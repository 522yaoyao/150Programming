package in;

import java.util.*;

/**
 * 将两个时间差计算出来（用秒来表示）；
 * @author zx
 *
 */
public class Main8 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		    int[] time=new int[3];
		while(in.hasNext()){
			String start=in.next();
			String end=in.next();
			String[] str1=start.split(":");
			String[] str2=end.split(":");
			    for(int i=0;i<3;i++){
			    	time[i]=(new Integer(str1[i]))-(new Integer(str2[i]));
			    }
	        int result=time[0]*3600+time[1]*60+time[2];
	        System.out.println(result);
			
			}
	
		}
			
	}


