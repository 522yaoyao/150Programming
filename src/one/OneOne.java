package one;


public class OneOne {
	public static void main(String[ ]  args){
		 String str1="abcde";
		 String str2="abcdea";
		 OneOne one=new OneOne();
		boolean  one1=one.isUnqueChar2(str1);
	    System.out.println(one1);
	    boolean one2=one.isUnqueChar2(str2);
	    System.out.println(one2);
		 
	 }
	 /**
	  * 确定一个字符串的所有字符是不是全都不同
	  */
		public boolean isUnqueChar1(String str){
			if(str.length()>256)
				return false;
			boolean[ ] char_set=new boolean[256];
			for ( int i=0;i<str.length();i++){
				int val=str.charAt(i);
				if(char_set[val])
					return false;
				else
					char_set[val]=true;
				}
			return true;
		}
		public boolean isUnqueChar2(String str){
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

}
