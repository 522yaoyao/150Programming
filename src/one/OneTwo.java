package one;

public class OneTwo {
	
	public static void main(String[] args){
		String str1="abcd";
		String str2="efg ";
		String a=str1+str2;
//System.out.println(a);
		OneTwo one=new OneTwo();
		System.out.println(one.reverse3(a));
		
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
         int right=str.length()-2;//最后一个字符串为null所以从倒数第二个元素反转；
System.out.println(str.charAt(right));
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
	 * 反转一个字符串（递归法）；
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
public String reverse3(String str){
	if(str==null||str.length()<=1)
		return str;
	int left=0;
	char tmp;
	char[] array=str.toCharArray();//
	int right=str.length()-2;//指向有效字符的最后一个元素；
	while(left<right){
	    tmp=array[left];
		array[left]=array[right];
		array[right]=tmp;
		left++;
		right--;
}
	
	//return new String(array);
	return String.valueOf(array);

	}
public String r(String str){
	return str;
}
}
