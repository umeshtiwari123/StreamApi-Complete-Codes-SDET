package streamMethods;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		
		List<String> stringList=Arrays.asList("A","B","C","1","2","3");
		
		Object arr[]=stringList.stream().toArray();
		
		for (Object object : arr) {
			System.out.println(object);
		}
		
		System.out.println("Length : "+arr.length);
	}

}
