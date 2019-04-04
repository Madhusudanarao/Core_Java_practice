import java.util.HashSet;
import java.util.TreeSet;

public class HashAndTreDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		//hs.add(null);
		/*hs.add("Madhu");
		hs.add("uday");
		hs.add("RAm");
		hs.add("Xavier");*/
		
		hs.add(10);
		hs.add(1);
		
		hs.add(9);
		hs.add(8);
		hs.add("Madhu");
		System.out.println(hs);
		//hs.add(null);
		//if you add null to hashSet either at begin or middle or end,when u try to print it prints at starting
		//if you add multiple nulls it consider only one
		//System.out.println(hs);

		TreeSet ts = new TreeSet();
		//ts.add(null);
		ts.add("Madhu");
		ts.add("Uday");
		ts.add("RAm");
		ts.add("Xavier");
		ts.add("AA");
		//ts.add(1);
		System.out.println(ts);

	}

}
