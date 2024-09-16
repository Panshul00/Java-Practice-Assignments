package Day2_Exercises;

public class Person {
	private String name;
	private float age;
	
	Person(String name){
		this.name=name;
		System.out.println(name+" Person created");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	

}
