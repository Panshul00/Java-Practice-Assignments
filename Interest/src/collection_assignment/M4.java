package collection_assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
@SuppressWarnings("all")
public class M4 {

	public static void main(String[] args) {
		
		Set s=new HashSet(5);
		s.add("qqq");
		s.add("www");
		s.add(new Set2(1.5));
		s.add(new Set2(8.3));
		s.add(23);
		s.add(75);
		s.add(21);
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
