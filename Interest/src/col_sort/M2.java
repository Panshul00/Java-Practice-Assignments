package col_sort;

import java.util.ArrayList;
import java.util.Collections;

public class M2 {

	public static void main(String[] args) {
		
		@SuppressWarnings("all")
		ArrayList<Student> li=new ArrayList<Student>();
		
		li.add(new Student("A",55)); 
		li.add(new Student("T",25)); 
		li.add(new Student("C",76)); 
		li.add(new Student("O",74)); 
		li.add(new Student("Q",8)); 
		
        Collections.sort(li);

       
        for (Student s : li) {
            System.out.println(s);
        }
		

	}

}
