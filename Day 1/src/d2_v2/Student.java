package d2_v2;

public class Student {

		public Student() {
		
		System.out.println("Default Cons.... ");
		}
		public Student(String name){
		System.out.println("Parameter String");
		}
		public Student(int a) {
		this("abc");
		System.out.println("Paramater Int");
		}
		
}
