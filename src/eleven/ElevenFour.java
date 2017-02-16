package eleven;

public class ElevenFour {
public static void main(String[] args){
	String[] str={"abc","","","","","bac","","","","","cba"};
	int index=search(str,"bac");
	System.out.println(index);
	}
public static int searchStr(String[] str,String s,int first,int last){
	int mid=(first+last)/2;
	if(last<first)
		return -1;
	//使mid指向离当前空字符串最近的非空串；
	while(str[mid].isEmpty()){
		int left=mid-1;
		int right=mid+1;
		while(true){
			if(left<first||right>last)
				return -1;
	     	else 	if(!str[left].isEmpty()&&left<=first){
				mid=left;
				break;
			}
			else if(!str[right].isEmpty()&&right<=last){
				mid=right;
				break;
			}
			right++;
			left--;
		}
		
	}
	
	if(str[mid]==s)
		return mid;
	else if(str[mid].compareTo(s)<0)
	return 	searchStr(str,s,mid+1,last);
	else
		return searchStr(str,s,first,mid-1);
}
public static int search(String[] str,String s){
	if(str==null||s==null||s=="")
		return -1;
	else 
	return 	searchStr(str,s,0,str.length);
}
}
