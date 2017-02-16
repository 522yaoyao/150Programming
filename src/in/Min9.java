package in;

import java.util.Scanner;

 class Min9 {
	public static void main(String[] args){
		//System.out.println();
		Scanner in=new Scanner(System.in);
	   while(in.hasNext()){
		int r=in.nextInt();
		int c=in.nextInt();
	   char[][] array=new char[r][c];
		for(int i=0;i<r;i++){
			 for(int j=0; j<c; j++){
                 array[i][j] = (char)in.nextInt();
            }
		}
		
	}
	}

}
