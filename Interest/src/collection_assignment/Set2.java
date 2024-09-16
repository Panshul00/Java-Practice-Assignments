package collection_assignment;

public class Set2 {
	


	private float marks;

	@Override
	public String toString() {
		return "Set2 [marks=" + marks + "]";
	}

	public Set2(double d) {
		super();
		this.marks =(float) d;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(marks);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Set2))
			return false;
		Set2 other = (Set2) obj;
		if (Float.floatToIntBits(marks) != Float.floatToIntBits(other.marks))
			return false;
		return true;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	



	
	
}
