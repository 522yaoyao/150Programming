package eleven;

public class ElevenOne {
public static void main(String[] arg){
	int[] a=new int[30];
	int[] c={1,2,4,6,8,9};
	for(int i=0;i<c.length;i++){
		a[i]=c[i];
	}
	int[] b={3,2,5,7,10};
	merge(a,b,c.length,b.length);
	MySort.print(a);
	
}
public static void merge(int[] a,int[] b,int lastA,int lastB){
	int indexA=lastA-1;
	int indexB=lastB-1;
	int index=lastA+lastB-1;
	while(indexA>=0&&indexB>=0){
		if(a[indexA]>=b[indexB]){
			a[index]=a[indexA];
			index--;
			indexA--;}
		
			else{
				a[index]=b[indexB];
				index--;
				indexB--;
			}
		}
	if(indexB>=0){
		a[index]=b[indexB];
		index--;
		indexB--;
	}
	}
	
}

