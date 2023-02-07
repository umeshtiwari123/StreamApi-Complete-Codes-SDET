package streamsMethods2;

import java.util.HashSet;
import java.util.Set;

//anyMatch() --
//allMatch() --
//noneMatch() --

public class Demo2 {

	public static void main(String[] args) {

		Set<String> fruits=new HashSet<String>();
		
		fruits.add("One apple");
		fruits.add("One mango");
		fruits.add("Two apples");
		fruits.add("More grapes");
		fruits.add("Two guavas");
		
		//anyMatch()
		boolean result=fruits.stream().anyMatch(value -> {return value.startsWith("One");});
		System.out.println(result); //true
		
		//allMatch()
		result=fruits.stream().allMatch(value -> {return value.startsWith("One");});
		System.out.println(result); //false
		
		//noneMatch()
		result=fruits.stream().noneMatch(value -> {return value.startsWith("Four");});
		System.out.println(result); //true
		
		
		
	}

}
