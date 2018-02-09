package designpattern;

import java.util.ArrayList;
import java.util.List;

//组合模式
public class Composite{
	public static void main(String[] args){
		Component root = new Root();
		Component c1 = new Root();
		Component c2 = new Root();

		Component leaf1 = new Leaf();
		Component leaf2 = new Leaf();
		Component leaf3 = new Leaf();

		// 组合成为树形的对象结构
		root.addChild(c1);
		root.addChild(c2);
		root.addChild(leaf1);
		c1.addChild(leaf2);
		c2.addChild(leaf3);

		// 操作Component对象
		Component o = root.getChildren(1);
		System.out.println(o);
	}

}

abstract class Component{

	/**
	 * 示意方法，子组件对象可能有的功能方法
	 */
	public abstract void someOperation();

	/**
	 * 向组合对象中加入组件对象
	 * @param child 被加入组合对象中的组件对象
	 */
	public void addChild(Component child){
		// 缺省的实现，抛出例外，因为叶子对象没有这个功能，
		// 或者子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");
	}

	/**
	 * 从组合对象中移出某个组件对象
	 * @param child 被移出的组件对象
	 */
	public void removeChild(Component child){
		// 缺省的实现，抛出例外，因为叶子对象没有这个功能，
		// 或者子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");
	}

	/**
	 * 返回某个索引对应的组件对象
	 * @param index 需要获取的组件对象的索引，索引从0开始
	 * @return 索引对应的组件对象
	 */
	public Component getChildren(int index){
		// 缺省的实现，抛出例外，因为叶子对象没有这个功能，
		// 或者子组件没有实现这个功能
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
}

/**
 * 组合对象，通常需要存储子对象，定义有子部件的部件行为，
 * 并实现在Component里面定义的与子部件有关的操作
 */

class Root extends Component{
	/**
	 * 用来存储组合对象中包含的子组件对象
	 */
	private List<Component> childComponents = null;

	/** * 示意方法，通常在里面需要实现递归的调用 */
	public void someOperation(){
		if(childComponents != null){
			for(Component c : childComponents){
				// 递归的进行子组件相应方法的调用
				c.someOperation();
			}
		}
	}

	public void addChild(Component child){
		// 延迟初始化 懒汉模式
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
 * 叶子对象，叶子对象不再包含其他子对象
 */
class Leaf extends Component{
	/**
	 * 示意方法，叶子对象可能有自己的功能方法
	 */
	public void someOperation(){
		// do something;
	}
}
