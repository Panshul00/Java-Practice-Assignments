package Library;

//Client program
public class LMS {
 public static void main(String[] args) {
     Book book = new Book(1, "Java Programming", 3, "James Gosling");
     JournalPaper journal = new JournalPaper(2, "AI in Healthcare", 5, "John Smith", 2021);
     Video video = new Video(3, "Inception", 2, 148, "Christopher Nolan", "Science Fiction", 2010);
     CD cd = new CD(4, "Thriller", 4, 42, "Michael Jackson", "Pop");

     book.print();
     journal.print();
     video.print();
     cd.print();

     System.out.println("\nChecking out one copy of 'Inception':");
     video.checkOut();
     video.print();

     System.out.println("\nAdding two more copies of 'Thriller':");
     cd.addItem(2);
     cd.print();
 }
}

