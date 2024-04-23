import java.util.LinkedList;
import java.util.List;

public class DoublyLinkedList {

	public static void main(String[] args) {
		
		List linkedList= new LinkedList<>();
		
		linkedList.add(1);
		linkedList.add("pune");
		linkedList.add(1);
		linkedList.add(null);
		
		
		for (Object list:linkedList) {
		System.out.println(list);
	}

}
}