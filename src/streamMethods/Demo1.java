package streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//distinct()  limit() -- processing for collection -- non terminal
// count() -- terminal

public class Demo1 {

	public static void main(String[] args) {

		List<String> vehiclesList =Arrays.asList("bus","car","bicycle","bus","car","car","bike");
		
		
		//distinct() -- non terminal
		List<String> distinctVehicles =vehiclesList.stream().distinct().collect(Collectors.toList());

		
		System.out.println(distinctVehicles);// [bus, car, bicycle, bike]
		
		
		vehiclesList.stream().distinct().forEach(value->System.out.print(" "+value));
		
		System.out.println();
		//count() -- terminal
		
		long count=vehiclesList.stream().distinct().count();
		
		System.out.println(count);
		
		//limit()  -- non terminal
		List<String> limitedVehiclesList=vehiclesList.stream().limit(3).collect(Collectors.toList());
		
		System.out.println(limitedVehiclesList);
		
		vehiclesList.stream().limit(3).forEach(value->System.out.println(value));
		
		
		
		
		
		

	}

}
