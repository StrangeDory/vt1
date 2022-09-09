public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public boolean equals(Object book) {
        return (((Book)book).title.equalsIgnoreCase(this.title) && ((Book)book).author.equalsIgnoreCase(this.author)) ? true : false;
    }

    @Override
    public int hashCode() {
        return this.title.hashCode();
    }

    @Override
    public String toString(){
        return this.author + " \"" + this.title + "\" " + " стоимость: " + this.price + " издание: " + this.edition;
    }

    @Override
    public Object clone() {
        Book clone = new Book();
        clone.author = this.author;
        clone.title = this.title;
        clone.price = this.price;
        return clone;
    }
}
