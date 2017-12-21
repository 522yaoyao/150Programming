package five;

public class One {
        // 根据数字的二进制数据来确定某一索引的值为true；（eg:8的二进制是1000，那么一个数据的第四个）
		public static void main(String[] args){
			int exp = 8;
			for(int k = 0; k < 12; k++){
				// int j = k % 12;
				boolean rs = (exp >> k & 1) > 0;
				System.out.println(rs + " K:" + k);
			}
		}

	}


