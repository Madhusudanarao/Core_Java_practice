package com.interfc.test;

public class MyClass implements MyInterfaceB,MyInterfaceA{
	

		/*@Override
		public String Show() {
			return "Hello";
			
		}
		
		@Override
		public int Show() {
			return 12;
			
		}*/
		public static void main(String[] args) {
		
			System.out.println(MyInterfaceB.a);
			System.out.println(MyInterfaceA.a);
			/*System.out.println(Obj1.Show());
			System.out.println(Obj2.Show());*/
		}

		@Override
		public int Show() {
			// TODO Auto-generated method stub
			return 0;
		}

	

}
