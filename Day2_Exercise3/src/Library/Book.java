package Library;

class Book extends WrittenItem {
    public Book(int id, String title, int numCopies, String author) {
        super(id, title, numCopies, author);
    }

    @Override
    public void print() {
        System.out.println("Book: " + this.toString());
    }
}