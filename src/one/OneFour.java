package one;

public class OneFour {
	public static void main(String[ ]  args){
		String a="a b c g";
		OneFour one=new OneFour();
	System.out.println(one.replaceSpace1(a, a.length()));
	//	String s="ab c";
		//char[ ] b=s.toCharArray();
		//one.replaceSpace2(b, b.length);
	}
	/**
	 * 把一个字符串中的空格全部替换成“%20”，已知字符串和字符串长度
	 * @param s
	 * @param length
	 * @return
	 */
	public String replaceSpace1(String s, int length){
		int spaceCount=0;
		int newLength=0;
		char[ ] str=s.toCharArray();
		for(int i=0;i<length;i++){
			if(str[i]==' ')
				spaceCount++;
				}
		newLength=length+spaceCount*2;
		
		char[] a=new char[newLength];
		for(int i=length-1;i>=0;i--){
			if(str[i]==' '){
				a[newLength-1]='0';
				a[newLength-2]='2';
				a[newLength-3]='%';
				newLength=newLength-3;
			}
			else{
				a[newLength-1]=str[i];
				newLength=newLength-1;
			}
		}
		return new String(a);
	}
	/*public void  replaceSpace2(char[] str,int length){
		int spaceCount=0;
		int newLength=0;
		for(int i=0;i<length;i++){
			if(str[i]==' ')
				spaceCount++;
		}
		newLength=spaceCount*2+newLength;
		str[newLength]='\0';
		for(int i=length-1;i>=0;i--){
			if(str[i]==' '){
				str[newLength-1]='0';
				str[newLength-2]='2';
				str[newLength-3]='%';
				newLength=newLength-3;
			}
			else{
				str[newLength-1]=str[i];
				newLength=newLength-1;
			}
		}
		for(char c:str){
			System.out.println(c);
		}
	}*/

}
