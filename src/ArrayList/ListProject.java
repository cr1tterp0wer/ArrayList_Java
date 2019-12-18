package ArrayList;

public class ListProject {

	public static void main( String[] args ) {
		
		ArrayList<Integer> arrlist = new ArrayList<Integer>(3);
		
		arrlist.add(1);
		arrlist.add(2);
		arrlist.add(3);
		arrlist.add(4);
		arrlist.add(5);
		arrlist.add(6);
		arrlist.addAt(5, 99);
		

		arrlist.printList();

	}
}
