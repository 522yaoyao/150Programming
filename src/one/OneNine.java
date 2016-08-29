package one;

public class OneNine {
	public static void main(String[] args){
		String s="wwwww";
		String s1="q";
		int index1=s.indexOf(s1,0);//未查找到返回-1；
		int index=countStr("abababcabcabc","abc");
		
		System.out.println(index);
	}
	/**
	 * 计算出一个字符串中子串出现的次数；
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static int countStr(String str1,String str2){
		int count=0;
		int start=0;
     while(str1.indexOf(str2,start)>=0&&start<str1.length()){//未找到子串返回-1；
    	 count++;
    	// start++;
      start=str1.indexOf(str2, start)+str2.length();
     }
     return count;
	}
   public int countNum(String str,String str1){
	   int count=0;
	   int start=0;
	   while(str.indexOf(str1,start)>0&&start<str.length()){//在字符串中未找到子串返回-1；
		   count++;
		   start=str.indexOf(str1, start)+str1.length();
	   }
	   return count;
   }
}
