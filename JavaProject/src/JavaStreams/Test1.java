package JavaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

//@Test
public class Test1 {

	public void regular() {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhi");
		names.add("Puman");
		names.add("Ritesh");
		names.add("Prachi");
		names.add("Aniket");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}

	// @Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhi");
		names.add("Puman");
		names.add("Ritesh");
		names.add("Prachi");
		names.add("Aniket");

		Long con = names.stream().filter(s -> s.startsWith("A")).count();// You can also short for loop or count methos
																			// with this.
		System.out.println(con);

		Long d = Stream.of("Abhi", "Puman", "Ritesh", "Prachi", "Aniket").filter(s -> // You can also short arrey list
																						// with this method.
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d); // You can also short whole method this way (43-48)

		// names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		// //It will print above 4 letter names

		names.stream().filter(s -> s.length() > 4).limit(2).forEach(s -> System.out.println(s));
		// it will print only first 2 names
	}

	// @Test
	public void streamMap() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Aditi");
		names.add("Utkarsh");
		names.add("Lina");

		// It print names which having last letter as i with upper case
		Stream.of("Abhi", "Puman", "Ritesh", "Prachi", "Aniket").filter(s -> s.endsWith("i")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// it print names which having first letter as a with upper case and sort
		List<String> name1 = Arrays.asList("Abhi", "Puman", "Ritesh", "Prachi", "Aniket");
		name1.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		// marging two different list
		Stream<String> newStream = Stream.concat(names.stream(), name1.stream());
		// newStream.sorted().forEach(s->System.out.println(s));
		boolean goofy = newStream.anyMatch(s -> s.equalsIgnoreCase("Prachi"));
		System.out.println(goofy);
		Assert.assertTrue(goofy);
	}

	@Test
	public void streamCollect() {
		// Use in real time freame work
		List<String> ls = Stream.of("Abhi", "Puman", "Ritesh", "Prachi", "Aniket").filter(s -> s.endsWith("i"))
				.map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> values=Arrays.asList(9,7,3,8,6,3,5,1);
//		values.stream().distinct().forEach(s->System.out.println(s)); //Tt will print unique numbers 
		List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList()); // it will sort & print numebers
		System.out.println(li.get(3));  //it will print 4 index
	}

}
