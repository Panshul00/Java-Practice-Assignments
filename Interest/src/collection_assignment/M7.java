package collection_assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
@SuppressWarnings("all")
public class M7 {

	public static void main(String[] args) {
		
		List s=new ArrayList(5);
		s.add("qqq");
		s.add("www");
		s.add(new Set3("Aman", 23));
		s.add(new Set3("Kali", 54));
		s.add(23);
		s.add(75);
		s.add(21);
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
