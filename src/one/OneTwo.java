package one;

public class OneTwo {
	
	public static void main(String[] args){
		String a="abcd";
		OneTwo one=new OneTwo();
		System.out.println(one.reverse2(a));
		
	}
	/**
	 *反转一个以null结尾的字符串 
	 * @param str
	 * @return
	 */
	public String reverse1(String str){
         if((null==str)||(str.length()<=1))
        	 return str;
         int lift=0;
         int right=str.length()-2;
         char tmp;
         char[ ] chars=str.toCharArray();
         while(lift<right){
        	 tmp=chars[lift];
        	 chars[lift++]=chars[right];
        	 chars[right--]=tmp;
             }
        	 return  new String(chars);
         }
	/**
	 * 反转一个字符串
	 * @param str
	 * @return
	 */
	public String reverse2(String str){
		if((null==str)||(str.length()<=1))
			return str;
		return (new StringBuffer(str)).reverse().toString();
		//递归
		//return  reverse2(str.substring(1))+str.charAt(0);
	}

}
