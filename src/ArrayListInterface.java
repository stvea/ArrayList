
public interface ArrayListInterface {

	//���Ԫ��
	<T> void add(T t);

	//��ȡ���Ա�Ԫ��
	<T> T get(int i);

	//��ӡ����Ԫ��
	void print();

	//���list��С
	int getSize();

	//ɾ��һ��Ԫ��
	<T> T remove(int position);

}