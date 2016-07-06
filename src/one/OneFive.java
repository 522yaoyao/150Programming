package one;

public class OneFive {
	public static void main(String[ ] arg){
		String a="aadcccccaae";
		OneFive one=new OneFive();
		System.out.println(one.compressBetter2(a));
		
	}
	/**
	 * 利用字符重复的次数，编写一个方法，实现基本的字符串压缩功能。比如，
	 * 字符串aabcccccaaa会变成a2b1c5a3.若压缩后的字符串没有变短，则
	 * 则返回原先的字符串。
	 */
	public String  compressBetter1(String str){
		int size=compression(str);
		if(size>=str.length())
			return str;
		int count=1;
		StringBuffer myStr=new StringBuffer();
		char last=str.charAt(0);
		for(int i=1; i<str.length();i++){
			if(last==str.charAt(i))
					count++;
			else{
				myStr.append(last);
				myStr.append(count);
				last=str.charAt(i);
				count=1;
			}
		}
		myStr.append(last);
		myStr.append(count);
		return new String(myStr);
		//return myStr.toString();
		
	}/**
	*压缩后字符串的长度
	*/
	public int compression(String str){
		int count=1;
		int size=0;
		char last=str.charAt(0);
		for(int i=1;i<str.length();i++){
			if(last==str.charAt(i))
				count++;
			else{
				size+=1+String.valueOf(count).length();
				last=str.charAt(i);
				count=1;
			}
			
		}
		return  size+1+String.valueOf(count).length();
	}
  public String compressBetter2(String str){
	  int size=compression(str);
	  if(size>=str.length())
		  return str;
	  int index=0;
	  int count=1;
	  char[ ]   array=new char[size];
	  char last=str.charAt(0);
	  for(int i=0; i<str.length();i++){
		  if(last==str.charAt(i))
			  count++;
		  else{
			  index=setChar(array,last,index,count);
			  last=str.charAt(i);
			  count=1;
		  }
      }
	  index=setChar(array,last,index,count);
	  //return String.valueOf(array);
	  return  new String(array);
	  //乱码；
	//  return array.toString();
  }/**
  *根据last 和count 构建数组；
  */
  public int setChar(char[ ]  array,char last,int index,int count){
	  array[index]=last;
	  index++;
	  char[ ] cnt=String.valueOf(count).toCharArray();//将int型的变量转化为字符串，再转化为字符数组
	  for(char x:cnt){
		  array[index]=x;
		  index++;
	  }
	  return index;
  }
}
