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
	 *��תһ����null��β���ַ��� 
	 * @param str
	 * @return
	 */
	public String reverse1(String str){
         if((null==str)||(str.length()<=1))
        	 return str;
         int lift=0;
         int right=str.length()-2;//���һ���ַ���Ϊnull���Դӵ����ڶ���Ԫ�ط�ת��
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
	 * ��תһ���ַ������ݹ鷨����
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
public String reverse3(String str){
	if(str==null||str.length()<=1)
		return str;
	int left=0;
	char tmp;
	char[] array=str.toCharArray();//
	int right=str.length()-2;//ָ����Ч�ַ������һ��Ԫ�أ�
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
