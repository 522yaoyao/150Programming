package five;

public class One {
        // �������ֵĶ�����������ȷ��ĳһ������ֵΪtrue����eg:8�Ķ�������1000����ôһ�����ݵĵ��ĸ���
		public static void main(String[] args){
			int exp = 8;
			for(int k = 0; k < 12; k++){
				// int j = k % 12;
				boolean rs = (exp >> k & 1) > 0;
				System.out.println(rs + " K:" + k);
			}
		}

	}


