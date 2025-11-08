import java.util.*;

public class LinkedListCollection {
public static void main(String[] args) {
	LinkedList<Integer> list=new LinkedList<Integer>();
	list.addFirst(2);  //2
	list.addFirst(1);  //1->2
	list.addLast(3);   //1->2->3
	list.addLast(4);   //1->2->3->4
	
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+" ->");
	}
	System.out.println("NULL");  //1->2->3->4->NULL
	
	
	
	list.remove(0);     // 2->3-4
	list.removeFirst(); // 3-4
	list.removeLast();  // 3
	
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+" ->");
	}
	System.out.println("NULL"); //3 ->NULL
	
	
	
	list.add(2);     //Bydefault node addedd at last(append)
	list.add(1);
	list.addFirst(4);
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+" ->");
	}
	System.out.println("NULL");  //4 ->3 ->2 ->1 ->NULL
	
	
	
    Collections.reverse(list);
    for (int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + " -> ");
    }
    System.out.println("NULL"); //1 -> 2 -> 3 -> 4 -> NULL

	
	
	
}
}
