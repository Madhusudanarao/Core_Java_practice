
public class ClonableTest implements Cloneable{
	int i=10;
	int j=20;
	

	public static void main(String[] args) throws CloneNotSupportedException {
		ClonableTest ct = new ClonableTest();
		ClonableTest ct2 = (ClonableTest)ct.clone();
		ct2.i=80;
		ct2.j=90;
		System.out.println(ct.i+"  "+ct.j);
		System.out.println(ct.hashCode() == ct2.hashCode());
	}


}
