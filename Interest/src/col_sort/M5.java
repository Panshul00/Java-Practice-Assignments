package col_sort;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class M5 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> m=new HashMap<String, Integer>();
		
		String[] words= {"apple", "banana", "apple", "orange", "banana", "grape",
	            "grape", "apple", "grape", "orange", "banana", "apple",
	            "grape", "orange", "mango"};
		
        for (String word : words) {
        	 

            Integer integer = m.get(word);
 
            if (integer == null)

                m.put(word, 1);
 
            else {

                m.put(word, integer + 1);
            }
        }
        System.out.println(m);
        
        Iterator hmIterator = m.entrySet().iterator();
        
 

        while (hmIterator.hasNext()) {
 
            @SuppressWarnings("all")
			Map.Entry mapElement = (Map.Entry)hmIterator.next();
            if((int)mapElement.getValue()>2)
            	System.out.println(mapElement.getKey() + " : " + (int)mapElement.getValue());
        }

	}

}
