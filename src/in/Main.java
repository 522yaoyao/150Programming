package in;

import java.util.Scanner;

public class Main {
	public static void main (String[] args){
	    int n;
	    int s;
	    int l;
	    int CDNum;
	    int j;
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			n=in.nextInt();
			s=in.nextInt();
			l=in.nextInt();
			if(n<=100&&s<=l&&l<=1000){
			int songNum=(l+1)/(s+1);//每个CD中的歌曲数；
			if(songNum!=13){
			//System.out.println(songNum);
			 j=n%songNum;
			if(j==0)
				CDNum=n/songNum;
			else
				CDNum=n/songNum+1;
			System.out.println(CDNum);
			
	}
			else{
				songNum=songNum-1;//比原来少一首；
				 j=n%songNum;
					if(j==0)
						CDNum=n/songNum;
					else
						CDNum=n/songNum+1;
					System.out.println(CDNum);
					
			}
	
}
}
}
}