package three;

import java.util.Stack;

public class ThreeFour {
	public static void main(String[] args){
		int n=3;
		Tower[] tower=new Tower[n];
		for(int i=0;i<3;i++){
			tower[i]=new Tower(i);
			}
		/*for(int i=n-1;i>=0;i--){
			tower[0].add(i);
			}*/
	    tower[0].add(5);
		tower[0].add(4);
		tower[0].add(3);
		tower[0].add(2);
		
		tower[0].removeDisk(n, tower[2],tower[1]);
	
	}

}
class Tower{
	private Stack<Integer> disks;
	private int index;
	public Tower(int i){
		disks=new Stack<Integer>();
		index=i;
	}
	/**
	 * 得到当前索引
	 * @return
	 */
	public int getIndex(){
		return index;
	}
	/**
	 * 添加元素
	 * @param d
	 */
	public void add(int d){
		if((!disks.isEmpty())&&(disks.peek()<=d))
			System.out.println("Error placing disks   "+d);
		else
			disks.push(d);
	}
	public void removeDisk(int n,Tower destination,Tower buffer){
		if(n>0){
			removeDisk(n-1,buffer,destination);
			removeTopTo(destination);
			buffer.removeDisk(n-1,destination,this);
		}
		
	}

	/**
	 * 移动元素到当前塔
	 * @param t
	 */
	public void removeTopTo(Tower t){
		int top=disks.pop();
		t.add(top);
		System.out.println("Move disk  "+top+"  from  tower"+getIndex()+ "  to  tower "+t.getIndex());
	}
	}