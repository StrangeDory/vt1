public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private String ISBN;

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.ISBN = isbn;
    }

    public Book() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public boolean equals(Object book) {
        if(book instanceof Book)
            return ((Book) book).title.equalsIgnoreCase(this.title) && ((Book) book).author.equalsIgnoreCase(this.author);
        else
            return false;
    }

    @Override
    public int hashCode() {
        return (this.title.hashCode() + 17);
    }

    @Override
    public String toString(){
        return this.author + " \"" + this.title + "\" " + " стоимость: " + this.price + " издание: " + this.edition + " ISBN: " + this.ISBN;
    }

    @Override
    public Object clone() {
        Book clone = new Book();
        clone.author = this.author;
        clone.title = this.title;
        clone.price = this.price;
        return clone;
    }

    @Override
    public int compareTo(Book obj) {
        return ISBN.compareTo(obj.ISBN);
    }
}
