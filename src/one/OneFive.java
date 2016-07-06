package one;

public class OneFive {
	public static void main(String[ ] arg){
		String a="aadcccccaae";
		OneFive one=new OneFive();
		System.out.println(one.compressBetter2(a));
		
	}
	/**
	 * �����ַ��ظ��Ĵ�������дһ��������ʵ�ֻ������ַ���ѹ�����ܡ����磬
	 * �ַ���aabcccccaaa����a2b1c5a3.��ѹ������ַ���û�б�̣���
	 * �򷵻�ԭ�ȵ��ַ�����
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
	*ѹ�����ַ����ĳ���
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
	  //���룻
	//  return array.toString();
  }/**
  *����last ��count �������飻
  */
  public int setChar(char[ ]  array,char last,int index,int count){
	  array[index]=last;
	  index++;
	  char[ ] cnt=String.valueOf(count).toCharArray();//��int�͵ı���ת��Ϊ�ַ�������ת��Ϊ�ַ�����
	  for(char x:cnt){
		  array[index]=x;
		  index++;
	  }
	  return index;
  }
}
