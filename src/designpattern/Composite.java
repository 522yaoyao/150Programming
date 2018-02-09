package designpattern;

import java.util.ArrayList;
import java.util.List;

//���ģʽ
public class Composite{
	public static void main(String[] args){
		Component root = new Root();
		Component c1 = new Root();
		Component c2 = new Root();

		Component leaf1 = new Leaf();
		Component leaf2 = new Leaf();
		Component leaf3 = new Leaf();

		// ��ϳ�Ϊ���εĶ���ṹ
		root.addChild(c1);
		root.addChild(c2);
		root.addChild(leaf1);
		c1.addChild(leaf2);
		c2.addChild(leaf3);

		// ����Component����
		Component o = root.getChildren(1);
		System.out.println(o);
	}

}

abstract class Component{

	/**
	 * ʾ�ⷽ�����������������еĹ��ܷ���
	 */
	public abstract void someOperation();

	/**
	 * ����϶����м����������
	 * @param child ��������϶����е��������
	 */
	public void addChild(Component child){
		// ȱʡ��ʵ�֣��׳����⣬��ΪҶ�Ӷ���û��������ܣ�
		// ���������û��ʵ���������
		throw new UnsupportedOperationException("����֧���������");
	}

	/**
	 * ����϶������Ƴ�ĳ���������
	 * @param child ���Ƴ����������
	 */
	public void removeChild(Component child){
		// ȱʡ��ʵ�֣��׳����⣬��ΪҶ�Ӷ���û��������ܣ�
		// ���������û��ʵ���������
		throw new UnsupportedOperationException("����֧���������");
	}

	/**
	 * ����ĳ��������Ӧ���������
	 * @param index ��Ҫ��ȡ����������������������0��ʼ
	 * @return ������Ӧ���������
	 */
	public Component getChildren(int index){
		// ȱʡ��ʵ�֣��׳����⣬��ΪҶ�Ӷ���û��������ܣ�
		// ���������û��ʵ���������
		throw new UnsupportedOperationException("����֧���������");
	}
}

/**
 * ��϶���ͨ����Ҫ�洢�Ӷ��󣬶������Ӳ����Ĳ�����Ϊ��
 * ��ʵ����Component���涨������Ӳ����йصĲ���
 */

class Root extends Component{
	/**
	 * �����洢��϶����а��������������
	 */
	private List<Component> childComponents = null;

	/** * ʾ�ⷽ����ͨ����������Ҫʵ�ֵݹ�ĵ��� */
	public void someOperation(){
		if(childComponents != null){
			for(Component c : childComponents){
				// �ݹ�Ľ����������Ӧ�����ĵ���
				c.someOperation();
			}
		}
	}

	public void addChild(Component child){
		// �ӳٳ�ʼ�� ����ģʽ
		if(null == childComponents) childComponents = new ArrayList<Component>();
		childComponents.add(child);
	}

	public void removeChild(Component child){
		if(null != childComponents) childComponents.remove(child);
	}

	public Component getChildren(int index){
		if(null != childComponents){
			if(index >= 0 && index < childComponents.size()){
				return childComponents.get(index);
			}
		}
		return null;
	}
}

/**
 * Ҷ�Ӷ���Ҷ�Ӷ����ٰ��������Ӷ���
 */
class Leaf extends Component{
	/**
	 * ʾ�ⷽ����Ҷ�Ӷ���������Լ��Ĺ��ܷ���
	 */
	public void someOperation(){
		// do something;
	}
}
