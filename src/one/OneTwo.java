package one;

public class OneTwo {
	
	public static void main(String[] args){
		String a="abcd";
		OneTwo one=new OneTwo();
		System.out.println(one.reverse2(a));
		
	}
	/**
	 *��תһ����null��β���ַ��� 
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
	 * ��תһ���ַ���
	 * @param str
	 * @return
	 */
	public String reverse2(String str){
		if((null==str)||(str.length()<=1))
			return str;
		return (new StringBuffer(str)).reverse().toString();
		//�ݹ�
		//return  reverse2(str.substring(1))+str.charAt(0);
	}

}
