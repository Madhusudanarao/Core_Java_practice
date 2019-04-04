import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class CustomSortingWIthJava8 {

	
	
	public static void main(String[] args) {
		ArrayList<Student> stList = new ArrayList<Student>();
		stList.add(new Student(1,"Madhu",35));
		stList.add(new Student(2,"soumya",55));
		stList.add(new Student(5,"ram",45));
		stList.add(new Student(4,"rahim",58));
		stList.add(new Student(3,"ribbert",85));
		System.out.println(stList);
		stList.forEach(st->System.out.println(st.getId()+" "+st.getName()+" "+st.getMarks()));
		List<Student> streamList = stList.stream().sorted().collect(Collectors.toList());
		System.out.println("afterSort");
		streamList.forEach(st->System.out.println(st.getId()+" "+st.getName()+" "+st.getMarks()));
		stList.stream().sorted().collect(Collectors.toList())
				.forEach(st->System.out.println(st.getId() + " " + st.getName() + " " + st.getMarks()));
		
		System.out.println("afterSort Reverse");
		stList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
				.forEach(st -> System.out.println(st.getId() + " " + st.getName() + " " + st.getMarks()));
		System.out.println("sort by marks in  Reverse");
		stList.stream().sorted(Comparator.comparing(Student::getMarks).reversed()).collect(Collectors.toList())
				.forEach(st -> System.out.println(st.getId() + " " + st.getName() + " " + st.getMarks()));
		
		HashMap<Integer,String> hs = new HashMap<Integer,String>();
		hs.put(1,"maximum");
		hs.put(2,"okshs");
		hs.put(3,"wsdd");
		hs.put(4,"csd");
		hs.put(5,"tyy");
		System.out.println("Map Iteration");
		hs.entrySet().forEach(map->System.out.println(map.getKey()+ " " +map.getValue()));
		System.out.println("Map Sorting by Value");
		hs.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
				.forEach(map -> System.out.println(map.getKey() + " " + map.getValue()));
		System.out.println("Map Sorting by Key");
		hs.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
		.forEach(map -> System.out.println(map.getKey() + " " + map.getValue()));
		
		HashMap<Integer,Student> hsMap = new HashMap<Integer,Student>();
		hsMap.put(1,new Student(1,"Madhu",35));
		hsMap.put(2,new Student(2,"soumya",55));
		hsMap.put(3,new Student(5,"ram",45));
		hsMap.put(4,new Student(4,"rahim",58));
		hsMap.put(5,new Student(3,"ribbert",85));
		hsMap.entrySet().forEach(map ->  System.out.println(map.getKey()+ "  " +map.getValue()));
		System.out.println("Map Sorting by Customized value");
		hsMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
				.forEach(map -> System.out.println(map.getKey() + "  " + map.getValue()));
		
		List<Entry<Integer,Student>> mapList = hsMap.entrySet().stream().collect(Collectors.toList());
		//System.out.println(mapList.forEach(action));
		mapList.stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(e->System.out.println(e));
	}

}
