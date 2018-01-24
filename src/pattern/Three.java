package pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//start��end����
public class Three{
	public static void main(String args[]){
		String REGEX = "\\bcat\\b";
		String INPUT = "cat cat cat catthhyhie cat";
		matchCat(REGEX, INPUT);
	}

	/**
	 * ���� "cat" �����������ַ����г��ִ������м���������
	 * @param pattern ������ʽ
	 * @param content ��Ҫƥ����ַ���
	 */
	public static void matchCat(String pattern, String content){
		Pattern p = Pattern.compile(pattern);// ��������ʽ���뵽ģʽ��
		Matcher m = p.matcher(content);// ����������ģʽƥ��
		int count = 0;// ƥ��Ĵ���
		// ����ƥ�䣬����ƥ��ɹ�������true,ƥ���λ���ƶ����´�ƥ���λ��
		while(m.find()){
			count++;
			System.out.println("Match number " + count);
			System.out.println("start(): " + m.start());
			System.out.println("end(): " + m.end());

		}
	}

}
