package mapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		
		List<String> vehicles=Arrays.asList("bus","car","bicycle","flight","train");
		
		//without using streams
		
		List<String> vehiclesListinUpperCase=new ArrayList<String>();
		
		//before java 8
//		for (String name : vehicles) {
//			vehiclesListinUpperCase.add(name.toUpperCase());
//		}
//		
//		System.out.println(vehiclesListinUpperCase);
//		
		
		//stream - map (consumer) -- after java 8
		vehiclesListinUpperCase = vehicles.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
	
		System.out.println(vehiclesListinUpperCase);
		
		
	}
}
