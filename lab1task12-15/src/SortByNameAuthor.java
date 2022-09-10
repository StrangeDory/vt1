import java.util.Comparator;

class SortByNameAuthor implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2){
        int compare =  book1.getTitle().compareTo(book2.getTitle());
        if (compare == 0){
            return book1.getAuthor().compareTo(book2.getAuthor());
        }
        return compare;
    }
}
