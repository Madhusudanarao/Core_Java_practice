import java.util.ArrayList;
import java.util.List;

public class StreamSum {

	public static void main(String[] args) {
		List<Integer> allList = new ArrayList<Integer>();
		allList.add(10);
		allList.add(20);
		allList.add(50);
		allList.add(40);
		allList.add(30);
		System.out.println(allList.stream().filter(i -> i > 10).mapToInt(i -> i).sum());

	}

}
