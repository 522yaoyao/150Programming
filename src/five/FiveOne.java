
package five;

public class FiveOne {
	public static void main(String[] args){
		int result=updateBits(92,6,2,4);
		System.out.println(result);
	}
	public static int updateBits(int n,int m,int i,int j){
	/*��������*/
		int left=~((1<<(1+j))-1);//111100000(j=4);
System.out.println(left);
        int right=(1<<i)-1;//000011(i=2);
System.out.println(right);
       int mark=left | right;
       int n_cleared=mark & n;
System.out.println(n_cleared);
       /*����m����Ӧ��λ����*/
       int m_shift=m<<i;
       return n_cleared | m_shift;
	}

}
