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
		//System.out.println(6&(1<<2)); //λ�ƺ������㷵�ص���һ��������������boolean���ͣ�
	 }
	 /**
	  * ȷ��һ���ַ����������ַ��ǲ���ȫ����ͬ
	  */
		public boolean isUniqueChars1(String str){
			if(str.length()>256)
				return false;
			boolean[] array=new boolean[256];//ASCII���е�Ԫ����256��(Ĭ��Ϊfalse��
			for(int i=0;i<str.length();i++){
			int  index=str.charAt(i);//���λ�ȡ��Ӧ��Ԫ�أ�����ָ���������� char ֵ(�;��ȵ��߾����Զ�ת��)��
			if(array[index]){//Ϊtrue,��Ԫ�ز����״γ��֣�
				return false;
			}
			array[index]=true;//�ڴ�Ԫ�ص�һ�γ��ֵ�ʱ����������н���Ӧ��λ����Ϊtrue;
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
		 * ʹ��λ�������ж�һ���ַ������Ƿ��в�ͬ��Ԫ�أ�
		 * @param str
		 * @return
		 */
        public boolean isUniqueChars(String str){
        	if(str.length()>256)
        		return false;
        	int result=0;//�ֲ����������ʼ����
        	for(int i=0;i<str.length();i++){
        		int index=str.charAt(i)-'a';//byte,short,char,�漰�����Զ�ת��Ϊint���ͣ�
        		if((result & (1<<index))>0){//��Ӧ��λ֮ǰ�Ѿ���1����Ԫ�ش��ڹ�����ӦλΪ1�����ǽ��Ϊ1����
        			return false;
        		}
        		result |=(1<<index);//����Ӧ��λ��1��
        	}
        	return true;
        }
}
