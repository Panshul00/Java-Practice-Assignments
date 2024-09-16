package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("all")
public class Q1 {
	
	public static void main(String ar[]) {
	
	ArrayList<Integer> li = new ArrayList<>(Arrays.asList(11, 2, 3, 4, 5, 6 , 9, 6 , 5 , 5));
	int sum=0;
	for(int item : li) {
		sum+=item;
	}
	System.out.println(sum);
	int suml=0;
	
    for (int i = 0; i < li.size(); i++) {
        
        int sumr = sum - suml - li.get(i);

        
        if (suml == sumr) {
            System.out.println("Index - "+i + "   Pivot  " + li.get(i));
            break;
        }

       
        suml += li.get(i);
    }
	}
}
