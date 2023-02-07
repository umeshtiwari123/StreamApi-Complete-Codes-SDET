package mapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {

	public static void main(String[] args) {
		
		List<String> vehicles=Arrays.asList("bus","car","bicycle","flight","train");
		
		List<Integer> lengthCount=new ArrayList<Integer>();
		
		//Before Java 8 - without streams
		
//		for (String name : vehicles) {
//			System.out.println(name.length());
//		}
		
		
		vehicles.stream().map(l->l.length()).forEach(n->System.out.println(n));

		vehicles.stream().map(l->l.length()).forEach(System.out::println);
		
		lengthCount= vehicles.stream().map(l->l.length()).collect(Collectors.toList());
		
		
		System.out.println(lengthCount);
		
	}

}
