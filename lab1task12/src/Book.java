public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    @Override
    public boolean equals(Object book) {
        if (((Book)book).title.equalsIgnoreCase(this.title) && ((Book)book).author.equalsIgnoreCase(this.author))
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return this.title.hashCode();
    }

    @Override
    public String toString(){
        String str = this.author + " \"" + this.title + "\" " + " стоимость: " + this.price + " издание: " + this.edition;
        return str;
    }
}
