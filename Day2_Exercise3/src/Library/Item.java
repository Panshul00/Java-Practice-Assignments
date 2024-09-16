package Library;

abstract class Item {
	private int id;
	private String title;
	private int numCopies;

	public Item(int id, String title, int numCopies) {
		this.id = id;
		this.title = title;
		this.numCopies = numCopies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumCopies() {
		return numCopies;
	}

	public void setNumCopies(int numCopies) {
		this.numCopies = numCopies;
	}

	public void checkOut() {
		if (numCopies > 0) {
			numCopies--;
			System.out.println("Checked out 1 copy of: " + title);
		} else {
			System.out.println("No more copies available.");
		}
	}

	public void checkIn() {
		numCopies++;
		System.out.println("Checked in 1 copy of: " + title);
	}

	public void addItem(int num) {
		numCopies += num;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Item item = (Item) obj;
		return id == item.id;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Title: " + title + ", Copies: " + numCopies;
	}

	// Abstract method to be implemented by subclasses
	public abstract void print();
}
