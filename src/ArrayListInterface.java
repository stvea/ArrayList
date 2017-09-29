
public interface ArrayListInterface {

	//添加元素
	<T> void add(T t);

	//获取线性表元素
	<T> T get(int i);

	//打印所有元素
	void print();

	//获得list大小
	int getSize();

	//删除一个元素
	<T> T remove(int position);

}