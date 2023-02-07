package filterdemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {

		/*
		 * ArrayList<Integer> numbersList=new ArrayList<>();
		 * 
		 * numbersList.add(10); numbersList.add(15); numbersList.add(20);
		 * numbersList.add(25); numbersList.add(30);
		 */

		List<Integer> numbersList = Arrays.asList(10, 15, 20, 25, 30);

		List<Integer> evenList = new ArrayList<Integer>();

		// without using streams
		for (int even : numbersList) {
			if (even % 2 == 0) {
				evenList.add(even);
			}
		}

		System.out.println(evenList);

		// with streams concept
		 List<Integer> evenNumbersList = numbersList.stream().filter(e -> e % 2 ==
		 0).collect(Collectors.toList());

		 System.out.println("Approach 2:"+evenNumbersList);

		 
		 //Approach :3
		 evenNumbersList.stream().filter(n->n%2==0).forEach(n->System.out.print(" "+n));

		 //Approach :4
		 numbersList.stream().filter(e -> e % 2 == 0).forEach(System.out::println);
		
		
	}
}
