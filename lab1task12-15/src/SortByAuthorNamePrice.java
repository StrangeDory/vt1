import java.util.Comparator;

class SortByAuthorNamePrice implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2){
        int compare =  book1.getAuthor().compareTo(book2.getAuthor());
        if (compare == 0){
            compare = book1.getTitle().compareTo(book2.getTitle());
            if (compare == 0){
                return Integer.compare(book1.getPrice(), book2.getPrice());
            }
            return compare;
        }
        return compare;
    }
}
