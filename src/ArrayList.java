import java.util.Arrays;

public class ArrayList implements ArrayListInterface {
	
	private static final int DEFAULT_SIZE = 16;//Ĭ�����鳤��
	
	private Object[] lists;
	
	private int size = 0;//��ǰԪ�ظ���
	
	//�������Ա���
	private void increaseSizeOfList() {
		int newSize = lists.length * 2;
		lists = Arrays.copyOf(lists, newSize);
	}
	
	//���Ԫ��
	/* (non-Javadoc)
	 * @see ArrayListInterface#add(T)
	 */
	@Override
	public <T> void add(T t) {
		if(size == lists.length)
			increaseSizeOfList();
		lists[size++] = t;
	}
	
	// ��Ĭ�����鳤�ȴ�����˳�����Ա�
	public ArrayList() {
		lists = new Object[DEFAULT_SIZE];
	}
	
	//��ȡ���Ա�Ԫ��
	/* (non-Javadoc)
	 * @see ArrayListInterface#get(int)
	 */
	@Override
	public <T> T get(int i) {
		if(i >= size || i < 0)
			throw new IndexOutOfBoundsException("�޷��ҵ���Ԫ��");
		return (T)lists[i];
	}
	
	//��ӡ����Ԫ��
	/* (non-Javadoc)
	 * @see ArrayListInterface#print()
	 */
	@Override
	public void print() {
		for(int i=0;i<lists.length;i++)
			if(lists[i] != null)
				System.out.print(lists[i]+",");
	}
	
	//���list��С
	/* (non-Javadoc)
	 * @see ArrayListInterface#getSize()
	 */
	@Override
	public int getSize() {
		return lists.length;
	}
	
	//ɾ��һ��Ԫ��
	/* (non-Javadoc)
	 * @see ArrayListInterface#remove(int)
	 */
	@Override
	public <T> T remove(int position) {
		if(position<0||position>=size)
			throw new IndexOutOfBoundsException("�޷��ҵ���Ԫ��");
		Object itemToRemove = lists[position];
		for(int i=position;i<lists.length-1;i++)
			lists[i] = lists[i+1];
		size--;
		return (T) itemToRemove;
	}
}
