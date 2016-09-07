package in;

import java.util.*;

public class MainFour{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        StringBuilder[] str=new StringBuilder[2];
        while(in.hasNext()){
           for(int i=0;i<2;i++){
               str[i]=new StringBuilder(in.next());
           }   
           for(int j=0;j<2;j++){
             printStr(str[j]);  
           }
            
        }
    }
    /**
     * 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理

     * @param str
     */
    public static void printStr(StringBuilder str){
        if(str.length()%8!=0){
            int l=8-str.length()%8;
            for(int i=0;i<l;i++){
                str.append("0");
            }
        }
        while(str.length()>=8){
                 System.out.println(str.substring(0,8));
                str.delete(0,8);
            
        }
    }
}