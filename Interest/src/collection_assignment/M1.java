package collection_assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class M1 {

	public static void main(String[] args) {
		
		Set<Set1> s=new HashSet<Set1>();
		s.add(new Set1("A"));
		s.add(new Set1("B"));
		s.add(new Set1("C"));
		s.add(new Set1("D"));
		s.add(new Set1("FGHH"));
		
		Iterator<Set1> i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
