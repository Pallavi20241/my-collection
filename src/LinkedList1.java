import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
       
		LinkedList linkedlist=new LinkedList<>();
		
		linkedList.add(1);
		linkedlist.add('x');

		
		for (Object list:linkedlist) {
			System.out.println(list);
		}
	}

}

