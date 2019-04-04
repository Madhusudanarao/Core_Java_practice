import java.util.HashSet;
import java.util.Iterator;

public class HashSetEmployeeTest {

	public static void main(String[] args) {
		String s1= "Madhu";
		String s2 = new String("Madhu").intern();
		System.out.println(s1==s2);
		HashSet hsa = new HashSet();
		hsa.add("Ma");
		hsa.add("Ma");
		HashSet<Employee1> hs = new HashSet<Employee1>();
		hs.add(new Employee1(1, "Madhu"));
		hs.add(new Employee1(1, "Madhu"));
		hs.add(new Employee1(1, "Madhu"));
		hs.add(new Employee1(1, "Madhu"));
		
		//System.out.println(hs);
		  Iterator<Employee1> it = hs.iterator();
		     while(it.hasNext()){
		        System.out.println(it.next());
		     }
	}

}
