package collection_assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class M3 {

	public static void main(String[] args) {
		
		Set<Set2> s=new HashSet<Set2>();
		s.add(new Set2(100));
		s.add(new Set2(54.6));
		s.add(new Set2(1.5));
		s.add(new Set2(8.3));
		s.add(new Set2(100));
		
		Iterator<Set2> i=s.iterator();
		float sum=0;
		while(i.hasNext()) {
			Set2 e=i.next();
			sum=sum+e.getMarks();
		}
		System.out.println(sum);

	}

}
