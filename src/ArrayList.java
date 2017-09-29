import java.util.Arrays;

public class ArrayList implements ArrayListInterface {
	
	private static final int DEFAULT_SIZE = 16;//默认数组长度
	
	private Object[] lists;
	
	private int size = 0;//当前元素个数
	
	//增加线性表长度
	private void increaseSizeOfList() {
		int newSize = lists.length * 2;
		lists = Arrays.copyOf(lists, newSize);
	}
	
	//添加元素
	/* (non-Javadoc)
	 * @see ArrayListInterface#add(T)
	 */
	@Override
	public <T> void add(T t) {
		if(size == lists.length)
			increaseSizeOfList();
		lists[size++] = t;
	}
	
	// 以默认数组长度创建空顺序线性表
	public ArrayList() {
		lists = new Object[DEFAULT_SIZE];
	}
	
	//获取线性表元素
	/* (non-Javadoc)
	 * @see ArrayListInterface#get(int)
	 */
	@Override
	public <T> T get(int i) {
		if(i >= size || i < 0)
			throw new IndexOutOfBoundsException("无法找到此元素");
		return (T)lists[i];
	}
	
	//打印所有元素
	/* (non-Javadoc)
	 * @see ArrayListInterface#print()
	 */
	@Override
	public void print() {
		for(int i=0;i<lists.length;i++)
			if(lists[i] != null)
				System.out.print(lists[i]+",");
	}
	
	//获得list大小
	/* (non-Javadoc)
	 * @see ArrayListInterface#getSize()
	 */
	@Override
	public int getSize() {
		return lists.length;
	}
	
	//删除一个元素
	/* (non-Javadoc)
	 * @see ArrayListInterface#remove(int)
	 */
	@Override
	public <T> T remove(int position) {
		if(position<0||position>=size)
			throw new IndexOutOfBoundsException("无法找到此元素");
		Object itemToRemove = lists[position];
		for(int i=position;i<lists.length-1;i++)
			lists[i] = lists[i+1];
		size--;
		return (T) itemToRemove;
	}
}
