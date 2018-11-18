package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import entities.Person;

public class ProgramTest {

	public static void main(String[] args) {
		
		List<Person>list = Arrays.asList(new Person("Joao",32), new Person("Antonio",20),
											new Person("Maria", 18),
											new Person("Angela", 30));
		
		Stream<Person>streamPerson = list.stream();
		
		Integer sunAge = streamPerson.filter(p -> p.getName().startsWith("A")).mapToInt(p -> p.getAge()).sum();
		
		Stream<Person>streamPerson2 = list.parallelStream();
		
		Integer sunAge2 = streamPerson2.filter(p -> p.getName().startsWith("A")).mapToInt(p -> p.getAge()).sum();
		
		
		System.out.println(sunAge.toString());
		System.out.println(sunAge2.toString());

	}

}
