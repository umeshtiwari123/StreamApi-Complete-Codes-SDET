package mapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {

		List<Integer> numbersList=Arrays.asList(2,3,4,5);
		
		List<Integer> resultList=new ArrayList<Integer>();
		//before Java 8
		
//		for(int num:numbersList)
//		{
//			//System.out.println(num*3);
//			
//			resultList.add(num*3);
//		}
//		
//		System.out.println(resultList);
//		
		
		//after  Java 8 -using streams map
		
		numbersList.stream().map(m->m*3).forEach(n->System.out.print(" "+n));
		System.out.println();
		System.out.println("+++++++++++++");
		numbersList.stream().map(m->m*3).forEach(System.out::println);
		
		
		
		System.out.println("+++++++++++++++++++++++");
		
		
		resultList = numbersList.stream().map(m->m*3).collect(Collectors.toList());
		
		System.out.println(resultList);
	}

}
