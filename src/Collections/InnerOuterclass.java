package Collections;


public class InnerOuterclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner in = new Outer.Inner();
		in.letsc();
		//myMethod(()-> System.out.println("letc method"));
	}
	public void myMethod(MyInterface myMet ){
		myMet.letc();
	}
		@FunctionalInterface
	interface MyInterface{
		public void letc();
	}

}
	class Outer{
		private int id;
		static class Inner{
		
		public void letsc(){
			System.out.println("Hello World");
		}
	}
}
	



//class MyClass implements MyInterface{
//
//	@Override
//	public void letc() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	
//}

