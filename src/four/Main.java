package four;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		String str;
		//String s="";
		int n=0;
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			str=in.nextLine();
			n=in.nextInt();
			// System.out.println(str);
		//	System.out.println(n);
			 for(;n>0;n--){
					String s="";
				 int p=in.nextInt();
				 int l1=in.nextInt();
				  int l=p+l1-1;
				 int ll=l;
				 System.out.println(n);
				 char first=str.charAt(p);
				 char last=str.charAt(l);
				 while(ll>=p){
					 s=s+str.charAt(ll);
					 ll--;
				 }
			//	 System.out.println(s);
				str=str.substring(0,l+1)+s+str.substring(l+1);
				 //System.out.println(str);
			 }
			 System.out.println(str);
			 
		}
		}
	}


