public class LimitNumOfObjectsCreation {

	private static LimitNumOfObjectsCreation lnoc;
	static int objectCount;

	private LimitNumOfObjectsCreation() {
		objectCount++;
	}

	private static LimitNumOfObjectsCreation getInstance() {
		if (objectCount < 3) {
			lnoc = new LimitNumOfObjectsCreation();
		}
		return lnoc;
	}

	public static void main(String[] args) {
		LimitNumOfObjectsCreation obj1 = lnoc.getInstance();
		LimitNumOfObjectsCreation obj2 = lnoc.getInstance();

		LimitNumOfObjectsCreation obj3 = lnoc.getInstance();
		LimitNumOfObjectsCreation obj4 = lnoc.getInstance();
		LimitNumOfObjectsCreation obj5 = lnoc.getInstance();
		LimitNumOfObjectsCreation obj6 = lnoc.getInstance();

		/*System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);
		System.out.println(obj6);*/
		
		String s = "MadhusudanaRao";
		System.out.println(s.substring(14));
		System.out.println(s.substring(1, 1));
	}

}
