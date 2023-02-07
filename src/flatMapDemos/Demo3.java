package flatMapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	String sname;
	int sid;
	char grade;
	
	Student(String sname,int sid,char grade)
	{
		this.sname=sname;
		this.sid=sid;
		this.grade=grade;
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		
		List<Student> studentList1=new ArrayList<Student>();
		
		studentList1.add(new Student("Smith",101,'A'));
		studentList1.add(new Student("John",102,'B'));
		studentList1.add(new Student("Kenedy",103,'C'));
		
		List<Student> studentList2=new ArrayList<Student>();
		
		studentList2.add(new Student("Scott",104,'A'));
		studentList2.add(new Student("Mary",105,'B'));
		studentList2.add(new Student("Kitty",106,'C'));
		
		List<List<Student>> studentList=Arrays.asList(studentList1,studentList2);
		
		//before java8
		
//		for(List<Student> s:studentList)
//		{
//			for(Student stu:s)
//			{
//				System.out.println(stu.sname);
//			}
//		}
		
		//after java 8
		//using stream flatMap()
		
		List<String> namesList=studentList.stream()
				.flatMap(s->s.stream())
				.map(s->s.sname)
				.collect(Collectors.toList());
		
		//studentList.stream().flatMap(s->s.stream()).map(s->s.sname).forEach(n->System.out.print(" "+n));
		
		System.out.println(namesList);
		
	}
}
