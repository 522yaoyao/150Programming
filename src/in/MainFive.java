package in;

import java.util.*;

public class MainFive{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        StringBuilder[] str=new StringBuilder[2];
        while(in.hasNext()){
           for(int i=0;i<2;i++){
               str[i]=new StringBuilder(in.next());
           }   
           for(int i=0;i<2;i++){
             //printStr(str[j]); 
                if(str[i].length()%8!=0){
            int l=8-str[i].length()%8;
            for(int k=0;k<l;k++){
            	
                str[i].append("0");
            }
        }
        
            while(str[i].length()>=8){
               
                System.out.println(str[i].substring(0,8));
                str[i].delete(0,8);
            }
        
           }
            
        }
    }
}