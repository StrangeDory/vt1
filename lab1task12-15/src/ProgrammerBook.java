public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price,
                          String language, int level, String isbn){
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object book) {
        if(book instanceof ProgrammerBook)
            return ((ProgrammerBook) book).language.equalsIgnoreCase(this.language) && ((ProgrammerBook) book).level == this.level;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return this.language.hashCode();
    }

    @Override
    public String toString(){
        return super.toString() + " " + this.language + " для уровня " + this.level;
    }
}