import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class task12 {
    public static void main(String[] args){
        Book.setEdition(15);
        Book book1 = new Book("Pride and Prejudice", "Jane Austen", 2500, "1234567890378");
        System.out.println(book1);
        System.out.println("Hash code = " + book1.hashCode());
        Book other = new Book("Beyond Good and Evil", "F. Nietzsche", 3940, "1234567899876");
        System.out.println(other);
        System.out.println("Hash code = " + other.hashCode());
        System.out.println("b.equals(other): " + book1.equals(other));

        book1.setTitle("Beyond Good and Evil");
        book1.setAuthor("F. Nietzsche");
        book1.setPrice(3940);
        System.out.println("b.equals(other): " + book1.equals(other));

        ProgrammerBook pascal = new ProgrammerBook("Pascal Guide", "N. Virt", 3990, "English", 500, "8650737543219");
        System.out.println(pascal);
        System.out.println("Hash code = " + pascal.hashCode());
        System.out.println("b.equals(pascal): " + book1.equals(pascal));
        System.out.println("other.equals(pascal): " + other.equals(pascal));
        ProgrammerBook pascal2 = new ProgrammerBook("Pascal Guide", "N. Virt", 3990, "English", 500, "9485665323567");
        System.out.println("pascal.equals(pascal2): " + pascal.equals(pascal2));

        book1.setTitle("Crime and Punishment"); book1.setAuthor("F. Dostoevsky");
        other.setTitle("Possessed"); other.setAuthor("F. Dostoevsky");
        pascal.setTitle("Les Miserables"); pascal.setAuthor("Victor Hugo");
        pascal2.setTitle("War and Peace"); pascal2.setAuthor("Leo Tolstoy");

        TreeSet<Book> mySet = new TreeSet<Book>();
        mySet.add(book1);
        mySet.add(other);
        mySet.add(pascal);
        mySet.add(pascal2);

        for (Book book : mySet) {
            System.out.println(book.getISBN() + " - " + book.getTitle());
        }

        ArrayList<Book> arr = new ArrayList<>(mySet);


        arr.sort(new SortByName());
        System.out.println(arr);
        arr.sort(new SortByNameAuthor());
        System.out.println(arr);
        arr.sort(new SortByAuthorName());
        System.out.println(arr);
        arr.sort(new SortByAuthorNamePrice());
        System.out.println(arr);
    }
}
