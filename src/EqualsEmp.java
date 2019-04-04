
public class EqualsEmp {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpName("Madhu");
		Employee e2 = new Employee();
		e2.setEmpName("Madhu");
		
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
	}

}
