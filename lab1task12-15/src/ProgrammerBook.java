public class ProgrammerBook extends Book{
    private String language;
    private int level;

    @Override
    public boolean equals(Object book) {
        return (((ProgrammerBook)book).language.equalsIgnoreCase(this.language) && ((ProgrammerBook)book).level == this.level) ? true : false;
    }

    @Override
    public int hashCode() {
        return this.language.hashCode();
    }

    @Override
    public String toString(){
        String str = this.language + " для уровня " + this.level;
        return str;
    }
}