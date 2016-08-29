package one;


public class OneOne {
	public static void main(String[ ]  args){
		 String str1="abcde";
		 String str2="abcdea";
		 OneOne one=new OneOne();
		boolean  one1=one.isUniqueChars(str2);
	   System.out.println(one1);
	    boolean one2=one.isUniqueChars1(str2);
	//    System.out.println(one2);
		//System.out.println(6&(1<<2)); //位移后与运算返回的是一个运算结果，不是boolean类型；
	 }
	 /**
	  * 确定一个字符串的所有字符是不是全都不同
	  */
		public boolean isUniqueChars1(String str){
			if(str.length()>256)
				return false;
			boolean[] array=new boolean[256];//ASCII表中的元素有256个(默认为false；
			for(int i=0;i<str.length();i++){
			int  index=str.charAt(i);//依次获取相应的元素，返回指定索引处的 char 值(低精度到高精度自动转换)；
			if(array[index]){//为true,此元素不是首次出现；
				return false;
			}
			array[index]=true;//在此元素第一次出现的时候就在数组中将相应的位置置为true;
	//System.out.println(index);
	        	}
			return true;
		}
		public boolean isUniqueChars2(String str){
			if(str.length()>256)
				return false;
			int checker=0;
			for(int i=0;i<str.length();i++){
				int val=str.charAt(i);
				if((checker&(1<<val))>0)
					return false;
				else
					checker|=(1<<val);
			}
			return true;
		}
		/**
		 * 使用位向量法判断一个字符串中是否含有不同的元素；
		 * @param str
		 * @return
		 */
        public boolean isUniqueChars(String str){
        	if(str.length()>256)
        		return false;
        	int result=0;//局部变量必须初始化；
        	for(int i=0;i<str.length();i++){
        		int index=str.charAt(i)-'a';//byte,short,char,涉及运算自动转化为int类型；
        		if((result & (1<<index))>0){//相应的位之前已经置1，此元素存在过（相应位为1，不是结果为1）；
        			return false;
        		}
        		result |=(1<<index);//将相应的位置1；
        	}
        	return true;
        }
}
