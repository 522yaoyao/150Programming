package eleven;

public class Two {
	public static void main(String[] args) {
		String s="Hello World";
	//trans(s,s.length());
		System.out.println(s.length());
		System.out.println(s.charAt(10));
		System.out.println(s.charAt(10)==' ');
         
	}
	public static void trans(String s,int n){
	//	String str=null;
		
		for(int i=n-1;i>=0;i--){
			int j=0;
			System.out.println(s.charAt(12));
			while(s.charAt(i)!=' '){
				j++;
				
				System.out.println(s.charAt(i));
				i--;
			}
			i++;
			System.out.println(i);
			System.out.println(j);
			
}
}
}