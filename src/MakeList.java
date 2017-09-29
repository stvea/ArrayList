
public class MakeList {
	public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add(" hello ");
        myList.add(" my dear ");
        myList.add(" friend! ");
        myList.print();
        myList.remove(1);
        System.out.println();
        myList.print();
    }
}
