import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntToMap {

	public static void main(String[] args) {
		List<Integer> allList = new ArrayList<Integer>();
		allList.add(10);
		allList.add(20);
		allList.add(50);
		allList.add(40);
		allList.add(30);
		System.out.println(
				allList.stream().collect(Collectors.toMap(i -> i, i -> i * 10, (i1, i2) -> i2, LinkedHashMap::new)));
	}

}
