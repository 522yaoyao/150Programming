package eleven;

public class ElevenThree {
	public static void main(String[] args){
		int[] a={2,2,2,3,4,2};
		int index=search(a,0,a.length-1,4);
		System.out.println(index);
		
	}
	public static int search(int[] a,int low,int high,int x){
		int mid=(low+high)/2;
		if(x==a[mid])
			return mid;
		if(low>high)
			return -1;
		if(a[low]<a[mid]){
			//�������
			if(a[low]<=x&&a[mid]>x)
				//Ҫ��ѯ�����ڴ˷�Χ�ڣ�
			return 	search(a,low,mid-1,x);
		      else
			return 	search(a,mid+1,high,x);
		}
		else  if	(a[low]>a[mid]){
			//�ұ�����
			if(a[mid]<x&&a[high]>=x)
			return 	search(a,mid+1,high,x);
				else
				return 	search(a,low,mid-1,x);
		}
		else{
			if(a[low]==a[mid]){
				if(a[mid]==a[high]){
				int result=search(a,low,mid-1,x);
				if(result==-1)
				   return search(a,mid+1,high,x);
				else
				      return result;
				}
				    else
				return    	search(a,mid+1,high,x);
			}
			
		}
		return -1;
					
		}
			
	

}
