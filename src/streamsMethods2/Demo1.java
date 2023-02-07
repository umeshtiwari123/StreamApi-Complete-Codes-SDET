package streamsMethods2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//sorted()
public class Demo1 {

	public static void main(String[] args) {
		
		List<Integer> list1=Arrays.asList(2,4,1,3,7,5,9);
		
		List<Integer> sortedList=list1.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);//ascending order -- [1, 2, 3, 4, 5, 7, 9]

		
		List<Integer> reverseSortedList= list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(reverseSortedList); //descending order -- [9, 7, 5, 4, 3, 2, 1]

		
		//Strings 
		
		List<String> list2=Arrays.asList("John","Mary","Kim","David","Smith");
		
		List<String> sortedStringList=list2.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedStringList);
		
		List<String> revverseSortedStringList=list2.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(revverseSortedStringList);
		
		
		
	}

}
