import java.util.Comparator;

class SortByAuthorName implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2){
        int compare =  book1.getAuthor().compareTo(book2.getAuthor());
        if (compare == 0){
            return book1.getTitle().compareTo(book2.getTitle());
        }
        return compare;
    }
}
